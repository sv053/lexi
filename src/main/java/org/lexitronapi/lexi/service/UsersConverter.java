package org.lexitronapi.lexi.service;

import org.lexitronapi.lexi.dto.UserDto;
import org.lexitronapi.lexi.entiities.User;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {
    public User fromUserDtoToUser(UserDto usersDto) {
        User user = new User();
        user.setId(usersDto.getId());
        user.setEmail(usersDto.getEmail());
        user.setName(usersDto.getName());
        user.setLogin(usersDto.getLogin());
        return user;
    }

    public UserDto fromUserToUserDto(User users) {
        return UserDto.builder()
                .id(users.getId())
                .email(users.getEmail())
                .login(users.getLogin())
                .name(users.getName())
                .build();
    }
}
