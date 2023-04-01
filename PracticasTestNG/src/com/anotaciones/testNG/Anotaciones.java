package com.anotaciones.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Anotaciones {
	
	@BeforeClass
	public void codigoAntesClass() {
		System.out.println("Este codigo se ejecuta antes de la clase");
	}
	
	@AfterClass
	public void codigoDespuesClass() {
		System.out.println("Este codigo se ejecuta despues de la clase");
	}
	
	@BeforeSuite
	public void codigoAntesSuite() {
		System.out.println("Este codigo se ejecuta antes de toda la suite");
	}
	
	@AfterSuite
	public void codigoDespuesSuite() {
		System.out.println("Este codigo se ejecuta despues de toda la suite");
	}
	
	@BeforeMethod
	public void codigoAntesMetodo() {
		System.out.println("Este codigo se ejecuta antes de cada metodo test");
	}
	
	@AfterMethod
	public void codigoDespesMetodo() {
		System.out.println("Este codigo se ejecuta despues de cada metodo test");
	}
	
	@BeforeTest
	public void antesSetTest() {
		System.out.println("Este codigo se ejecuta antes de todos los archivos incluido el set de pruebas");
	}
	
	@AfterTest
	public void despuesSetTest() {
		System.out.println("Este codigo se ejecuta despues de todos los archivos incluido el set de pruebas");
	}
	
	@Test(enabled = false)
	public void test1() {
		System.out.println("Test 1");

	}
	
	@Parameters({"Nombre"})
	@Test
	public void test2(String methodNombre) {
		System.out.println("Test 2" + " " + methodNombre );

	}
	@Test(dataProvider=("getData"))
	public void test2ymedio(String producto, String precio) {
		System.out.println("Test 2 y medio"+ producto + " " + precio );

	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] productos = new Object[3][2];
		
		//Primer Articulo
		productos[0][0] = "Camisa";
		productos[0][1] = "$10,00";
		
		//Segundo Articulo
		productos[1][0] = "Pantalon";
		productos[1][1] = "$12,00";

		//Tercer Articulo
		productos[2][0] = "Falda";
		productos[2][1] = "$14,00";

		return productos;
	}
	}
	
