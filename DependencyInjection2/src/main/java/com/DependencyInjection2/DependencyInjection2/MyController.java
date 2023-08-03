package com.DependencyInjection2.DependencyInjection2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private FirstClass firstClass;

    private SecondClass secondClass;


    private ThirdClass thirdClass;

    @GetMapping("names")
    public String getNameOfClasses(){
        return this.firstClass.getName() + " - " +
                this.secondClass.getName() + " - " +
                this.thirdClass.getName();
    }

    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public MyController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }
}
