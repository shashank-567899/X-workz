package com.java.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



public class NonVegPizz  implements Pizz{

	@Override
	public String getPizz() {
		// TODO Auto-generated method stub
		return "NonVegPIZZ";
	}

}
