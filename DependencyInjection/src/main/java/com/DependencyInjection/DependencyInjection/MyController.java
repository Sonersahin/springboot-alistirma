package com.DependencyInjection.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    @Qualifier("pdfFileReader")
    private Reader reader;

    @GetMapping("/read")
    public String read(){
        return this.reader.readFile();
    }
}
