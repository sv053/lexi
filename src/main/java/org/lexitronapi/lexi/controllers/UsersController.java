package org.lexitronapi.lexi.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.lexitronapi.lexi.dto.UserDto;
import org.lexitronapi.lexi.service.interfaces.UserService;
import org.lexitronapi.lexi.service.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Log
public class UsersController {

    private final UserService usersService;

    @PostMapping("/save")
    public UserDto saveUsers(@RequestBody UserDto usersDto) throws ValidationException {
        log.info("Handling save users: " + usersDto);
        return usersService.saveUser(usersDto);
    }

    @GetMapping("/findAll") // для работы с базой
    public List<UserDto> findAllUsers() {
        log.info("Handling find all users request");
        return usersService.findAll();
    }

    @GetMapping("/findByLogin")
    public UserDto findByLogin(@RequestParam String login) {
        log.info("Handling find by login request: " + login);
        return usersService.findByLogin(login);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUsers(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        usersService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
