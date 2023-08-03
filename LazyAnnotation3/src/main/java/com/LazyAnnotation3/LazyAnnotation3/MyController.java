package com.LazyAnnotation3.LazyAnnotation3;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    private MyComponent myComponent;

    public MyController(@Lazy MyComponent myComponent){
        this.myComponent = myComponent;
    }

    @GetMapping("/name")
    public String getComponentName(){
        return myComponent.getName();
    }

}
