package org.lexitronapi.lexi.service;

import org.lexitronapi.lexi.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UserDto findByLogin(String login);

    List<UserDto> findAll();
}
