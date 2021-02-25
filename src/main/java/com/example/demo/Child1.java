package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Child1 implements Parent{
    @Override
    public String getStudentName()
    {
        return "Child1";
    }
    public void run() {
        System.out.println("I am inside child1");
    }
}
