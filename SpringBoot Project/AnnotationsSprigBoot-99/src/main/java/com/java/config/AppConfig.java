package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.contoller.PizzController;
import com.java.service.NonVegPizz;
import com.java.service.Pizz;
import com.java.service.VegPizza;

@Configuration
public class AppConfig {
	
	@Bean
	public Pizz vegPizz()
	{
		return new VegPizza();
	}
	
	@Bean
	public Pizz nonVegPizz()
	{
		return new NonVegPizz();
	} 
	
	@Bean
	public PizzController pizzController()
	{
		return  new PizzController(vegPizz());
	}

}
 