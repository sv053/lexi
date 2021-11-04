package org.lexitronapi.lexi.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.lexitronapi.lexi.repo.sufijos.Verbo;
import org.lexitronapi.lexi.service.interfaces.VerbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wordtype")
@AllArgsConstructor
@Log
public class VerbController {

    private final VerbService verbService;

    @GetMapping("/findVerbSuffix") // для работы с базой
    public Verbo findAllVerbSuffix() {
        log.info("Handling find all verbos sufijos request");
        return verbService.findAll();
    }

}
