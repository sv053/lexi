package org.lexitronapi.lexi.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.lexitronapi.lexi.dto.WordDto;
import org.lexitronapi.lexi.service.ValidationException;
import org.lexitronapi.lexi.service.interfaces.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/words")
    @AllArgsConstructor
    @Log
    public class WordsController {

        private final WordService wordsService;

        @PostMapping("/saveWord")
        public WordDto saveWord(@RequestBody WordDto wordDto) throws ValidationException {
            log.info("Handling save users: " + wordDto);
            return wordsService.saveWord(wordDto);
        }

        @GetMapping("/findAllWords")
        public List<WordDto> findAllWords() {
            log.info("Handling find all users request");
            return wordsService.findAllWords();
        }

        @GetMapping("/findByMorfema")
        public WordDto findByMorfema(@RequestParam String morfema) {
            log.info("Handling find by morfema: " + morfema);
            return wordsService.findByMorfema(morfema);
        }

        @GetMapping("/findAllByMorfema")
        public List<WordDto> findAllByMorfema(@RequestParam String morfema) {
            log.info("Handling find by morfema: " + morfema);
            return wordsService.findAllByMorfema(morfema);
        }

        @DeleteMapping("/deleteWord/{id}")
        public ResponseEntity<Void> deleteWord(@PathVariable Integer id) {
            log.info("Handling delete user request: " + id);
            wordsService.deleteWord(id);
            return ResponseEntity.ok().build();
        }
}
