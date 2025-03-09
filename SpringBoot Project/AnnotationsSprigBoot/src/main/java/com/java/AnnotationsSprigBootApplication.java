package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.java.controller.PizzaController;

@SpringBootApplication
public class AnnotationsSprigBootApplication {

	public static void main(String[] args) {
	ApplicationContext context	=SpringApplication.run(AnnotationsSprigBootApplication.class, args);
	     PizzaController pizzaController   = context.getBean(PizzaController.class);
	     System.out.println(pizzaController.getPizz());
	}

}
