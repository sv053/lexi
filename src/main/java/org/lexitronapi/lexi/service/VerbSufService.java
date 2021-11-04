package org.lexitronapi.lexi.service;


import lombok.AllArgsConstructor;
import org.lexitronapi.lexi.repo.sufijos.Verbo;
import org.lexitronapi.lexi.service.interfaces.VerbService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VerbSufService {//implements VerbService {

   // @Override
    public List<String> findSuf() {
        return Verbo.sufijos;
    }
}
