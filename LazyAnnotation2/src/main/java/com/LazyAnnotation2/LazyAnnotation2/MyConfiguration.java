package com.LazyAnnotation2.LazyAnnotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@Lazy
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("MyConfiguration bean initialized!!");
    }

    @Bean
    public Example1 getExample1(){
        return new Example1();
    }

    @Bean
    public Example2 getExample2(){
        return new Example2();
    }
}
