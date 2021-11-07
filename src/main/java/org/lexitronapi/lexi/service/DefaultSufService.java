package org.lexitronapi.lexi.service;


import lombok.AllArgsConstructor;
import org.lexitronapi.lexi.repo.sufijos.Adjetivo;
import org.lexitronapi.lexi.repo.sufijos.Sustantivo;
import org.lexitronapi.lexi.repo.sufijos.Verbo;
import org.lexitronapi.lexi.service.interfaces.SuffixService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DefaultSufService implements SuffixService {

    @Override
    public List<String> findVerbSuf() {
        return Verbo.sufijos;
    }

    @Override
    public List<String> findNounSuf() {
        return Sustantivo.sufijos;
    }

    @Override
    public List<String> findAdjSuf() {
        return Adjetivo.sufijos;
    }

    @Override
    public List<String> findPrepositions() {
        return null;
    }
}

