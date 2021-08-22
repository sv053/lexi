package org.lexitronapi.lexi.service;

import lombok.AllArgsConstructor;
import org.lexitronapi.lexi.dto.UserDto;
import org.lexitronapi.lexi.dto.WordDto;
import org.lexitronapi.lexi.entities.User;
import org.lexitronapi.lexi.entities.Word;
import org.lexitronapi.lexi.repo.WordsRepository;
import org.lexitronapi.lexi.service.converters.WordsConverter;
import org.lexitronapi.lexi.service.interfaces.WordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class DefaultWordsService implements WordService {

    private final WordsRepository wordsRepository;
    private final WordsConverter wordsConverter;

    @Override
    public WordDto saveWord(WordDto wordDto) throws ValidationException {
        validateWordDto(wordDto);
        Word savedWord = wordsRepository.save(wordsConverter.fromWordDtoToWord(wordDto));
        return wordsConverter.fromWordToWordDto(savedWord);
    }

    @Override
    public void deleteWord(Integer userId) {
        wordsRepository.deleteById(userId);
    }

    @Override
    public WordDto findByMorfema(String part) {

        Word word = wordsRepository.findByMorfema(part);
        if (word != null) {
            return wordsConverter.fromWordToWordDto(word);
        }
        return null;
    }

    @Override
    public List<WordDto> findAllWords() {

        return wordsRepository.findAll()
                .stream()
                .map(wordsConverter::fromWordToWordDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<WordDto> findAllByMorfema(String part) {

        return wordsRepository.findAll()
                .stream()
                .filter(word -> word.getMorfema().contains(part))
                .map(wordsConverter::fromWordToWordDto)
                .collect(Collectors.toList());
    }

    private void validateWordDto(WordDto wordsDto) throws ValidationException {
        if (isNull(wordsDto)) {
            throw new ValidationException("Object word is null");
        }
        if (isNull(wordsDto.getPalabra()) || wordsDto.getPalabra().isEmpty()) {
            throw new ValidationException("Word does not exist");
        }
    }
}
