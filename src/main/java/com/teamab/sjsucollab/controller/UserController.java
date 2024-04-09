package com.teamab.sjsucollab.controller;

import com.teamab.sjsucollab.entity.User;
import com.teamab.sjsucollab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> registerUserAccount(@RequestBody User user) {
        User registeredUser = userService.registerNewUserAccount(user);
        return ResponseEntity.ok(registeredUser);
    }
}
