package com.qaschool.automatizacion;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mi primer prueba de automatizacion
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		// Inicializar e instanciar el navegador
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}

}
