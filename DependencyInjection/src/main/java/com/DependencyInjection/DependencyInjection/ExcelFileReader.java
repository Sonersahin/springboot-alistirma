package com.DependencyInjection.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader implements Reader{
    @Override
    public String readFile() {
        return "Excel file";
    }
}
