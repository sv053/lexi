package org.lexitronapi.lexi.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.lexitronapi.lexi.service.interfaces.SuffixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wordtype")
@AllArgsConstructor
@Log
public class SuffixController {

    private final SuffixService suffixService;

    @GetMapping("/findverbsuffix") // для работы с базой
    public List<String> findAllVerbSuffix() {
        log.info("Handling find all verbos sufijos request");
        return suffixService.findVerbSuf();
    }

    @GetMapping("/findnounsuffix") // для работы с базой
    public List<String> findAllNounSuffix() {
        log.info("Handling find all noun sufijos request");
        return suffixService.findNounSuf();
    }

    @GetMapping("/findadjsuffix") // для работы с базой
    public List<String> findAllAdjSuffix() {
        log.info("Handling find all adj sufijos request");
        return suffixService.findAdjSuf();
    }
}

