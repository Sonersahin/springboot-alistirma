package com.Lesson1.Lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    //@GetMapping(path = "/hello")
    @RequestMapping(path = "hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World!! ";
    }

    @PostMapping(path ="/save")
    public String save(){
        return "Data Saved!! ";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data Deleted!! ";
    }


}
