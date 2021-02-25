package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
    @Autowired
    private Parent parent;
    public Parent getParent()
    {
        return parent;
    }
}
