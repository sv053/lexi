package org.lexitronapi.lexi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WordDto {

    private int id;
    private String palabra;
    private String raiz;
    private String morfema;
}
