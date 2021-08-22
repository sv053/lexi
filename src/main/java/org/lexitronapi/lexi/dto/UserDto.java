package org.lexitronapi.lexi.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class UserDto {
    private int id;
    private String name;
    private String login;
    private String email;
}
