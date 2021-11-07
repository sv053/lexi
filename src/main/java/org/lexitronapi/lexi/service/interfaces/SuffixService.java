package org.lexitronapi.lexi.service.interfaces;

import org.lexitronapi.lexi.repo.sufijos.Adjetivo;

import java.util.List;

public interface SuffixService {
    List<String> findVerbSuf();
    List<String> findNounSuf();
    List<String> findAdjSuf();
    List<String> findPrepositions();
}
