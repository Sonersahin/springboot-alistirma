package com.LazyAnnotation4.LazyAnnotation4;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private SecondService secondService;

    public FirstService(@Lazy SecondService secondService) {
        this.secondService = secondService;
    }
}
