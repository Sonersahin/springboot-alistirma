package com.Lesson2.Lesson2.controller;


import com.Lesson2.Lesson2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("users-all")
    public List<User> users(@RequestBody List<User> users){
        System.out.println("user Added!!");
        return users;
    }
}
