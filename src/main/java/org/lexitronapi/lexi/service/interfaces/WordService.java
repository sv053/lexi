package org.lexitronapi.lexi.service.interfaces;

import org.lexitronapi.lexi.dto.WordDto;
import org.lexitronapi.lexi.service.ValidationException;

import java.util.List;

public interface WordService {
    WordDto saveWord(WordDto wordsDto) throws ValidationException;

    void deleteWord(Integer wordId);

    WordDto findByMorfema(String morfema);

    List<WordDto> findAllByMorfema(String morfema);
    List<WordDto> findAllWords();
}