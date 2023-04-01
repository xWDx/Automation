package com.anotaciones.testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class SegundoSet {

	
	@Test(dependsOnMethods = {"prueba4"}) 
	public void prueba3() {
		System.out.println("Test 3");
		
	}
	
	@Test
	public void prueba4() {
		System.out.println("Test 4");
		
	}
	}


