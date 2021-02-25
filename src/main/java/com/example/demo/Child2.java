package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Child2 implements Parent{
    @Override
    public String getStudentName()
    {
        return "Child2";
    }
    public void run() {
        System.out.println("I m inside child2");
    }
}
