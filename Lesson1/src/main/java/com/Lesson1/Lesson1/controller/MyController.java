package com.Lesson1.Lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api")
public class MyController {

    // @GetMapping(path = "/message/{message}")
    //public String message(@PathVariable String message){
    //    return "Your message is: " + message;
    //}

    @GetMapping("/message")
    public String getMessage(@RequestParam("m") String message){
        return "Your message is: " + message;
    }
}
