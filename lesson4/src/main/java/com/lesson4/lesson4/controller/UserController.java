package com.lesson4.lesson4.controller;

import com.lesson4.lesson4.dto.User;
import com.lesson4.lesson4.service.UserService;
import com.lesson4.lesson4.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }

}
