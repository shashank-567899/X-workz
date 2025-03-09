package com.java.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.service.Pizz;
import com.java.service.VegPizza;

public class PizzController {
	
	
	private Pizz pizz;
	
//	@Autowired
	public PizzController(Pizz pizz)
	{
		this.pizz=pizz;
	}
//	
//	@Autowired
//	public void setVegPizza(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}
//	
	
	
	public String getPizz()
	{
		return pizz.getPizz() ;
	}
     
	

}
