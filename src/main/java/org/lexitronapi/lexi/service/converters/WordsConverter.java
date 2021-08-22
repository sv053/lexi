package org.lexitronapi.lexi.service.converters;

import org.lexitronapi.lexi.dto.WordDto;
import org.lexitronapi.lexi.entities.Word;
import org.springframework.stereotype.Component;

@Component
public class WordsConverter {

    public Word fromWordDtoToWord(WordDto wordDto) {
        Word word = new Word();
        word.setId(wordDto.getId());
        word.setPalabra(wordDto.getPalabra());
        word.setRaiz(wordDto.getRaiz());
        word.setMorfema(wordDto.getMorfema());
        return word;
    }

    public WordDto fromWordToWordDto(Word word) {
        return WordDto.builder()
                .id(word.getId())
                .palabra(word.getPalabra())
                .raiz(word.getRaiz())
                .morfema(word.getMorfema())
                .build();
    }
}
