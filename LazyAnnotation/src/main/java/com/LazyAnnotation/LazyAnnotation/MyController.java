package com.LazyAnnotation.LazyAnnotation;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyComponent myComponent;

    public MyController(MyComponent myComponent){
        this.myComponent = myComponent;
    }


}
