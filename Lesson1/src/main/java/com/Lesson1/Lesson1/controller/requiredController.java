package com.Lesson1.Lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api")
public class requiredController {

    @GetMapping({"/message1","/message1/{message}"})
    public String getMessageWithVariable(@PathVariable(name = "message", required = false) String message) {
        return "Your message is: " + message;
    }

    @GetMapping("message2")
    public String getMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "my default message") String message) {
        return "Your message is: " + message;
    }
}
