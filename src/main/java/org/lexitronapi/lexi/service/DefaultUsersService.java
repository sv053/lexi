package org.lexitronapi.lexi.service;

import lombok.AllArgsConstructor;
import org.lexitronapi.lexi.dto.UserDto;
import org.lexitronapi.lexi.entiities.User;
import org.lexitronapi.lexi.repo.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class DefaultUsersService implements UserService {

    private final UsersRepository usersRepository;
    private final UsersConverter usersConverter;

    @Override
    public UserDto saveUser(UserDto usersDto) throws ValidationException {
        validateUserDto(usersDto);
        User savedUser = usersRepository.save(usersConverter.fromUserDtoToUser(usersDto));
        return usersConverter.fromUserToUserDto(savedUser);

    }

    @Override
    public void deleteUser(Integer userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public UserDto findByLogin(String login) {

        User users = usersRepository.findByLogin(login);
        if (users != null) {
            return usersConverter.fromUserToUserDto(users);
        }
        return null;
    }

    @Override
    public List<UserDto> findAll() {

        return usersRepository.findAll()
                .stream()
                .map(usersConverter::fromUserToUserDto)
                .collect(Collectors.toList());
    }

    private void validateUserDto(UserDto usersDto) throws ValidationException {
        if (isNull(usersDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(usersDto.getLogin()) || usersDto.getLogin().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }
}
