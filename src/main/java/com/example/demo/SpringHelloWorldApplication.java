package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringHelloWorldApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext=SpringApplication.run(SpringHelloWorldApplication.class,args);
        BoardGame boardGame= applicationContext.getBean(BoardGame.class);
        StudentService  service = applicationContext.getBean(StudentService.class);
        Parent parent = service.getParent();
        System.out.println(parent.getStudentName());
    }
}
