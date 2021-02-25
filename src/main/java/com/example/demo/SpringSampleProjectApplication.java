package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;



@SpringBootApplication
public class SpringSampleProjectApplication implements CommandLineRunner {
	@Autowired TextEditor textEditor;
	@Autowired BoardGame boardGame;
	@Autowired Child2 child2;
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		textEditor.spellCheck();
		boardGame.print();
	}
}
