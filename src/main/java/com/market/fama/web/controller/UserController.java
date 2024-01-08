package com.market.fama.web.controller;

import com.market.fama.domain.Family;
import com.market.fama.domain.User;
import com.market.fama.domain.service.FamilyService;
import com.market.fama.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable("userId") int userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/email/{emailUser}")
    public User getUserByEmail  (@PathVariable("emailUser") String emailUser) {
        return userService.getUserByEmail(emailUser);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int userId) {
        return userService.delete(userId);
    }
}