package com.example;

import com.example.controller.PriborController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MetrologApplication {


	@Autowired
	private PriborController controller;


	public static void main(String[] args) {
		SpringApplication.run(MetrologApplication.class, args);


	}
}
