package com.java.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void add1() {
		
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.add(4, 6));
		
	}
	
	@Test
	public void add2() {
		
		Calculator calculator = new Calculator();
		assertNotEquals(1, calculator.add(4, 6));
		
	}
	
	@Test
	public void multiply() {
		
		Calculator calculator = new Calculator();
		assertEquals(15, calculator.multiply(3,5));
		
	}
	
	

}
