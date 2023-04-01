package com.automationGoogle.busqueda;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusquedaEnGoogle extends xpaths{

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		// Iniciar y abrir el navegador
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className(barraBusquedaGoogle)).sendKeys(palabraYoutube);
		driver.findElement(By.className(lupaGoogle)).click();
		driver.findElement(By.xpath(primerResultadoBusquedaGoogle)).click();
		 
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath(barraBusquedaYoutube)));
		driver.findElement(By.xpath(barraBusquedaYoutube)).sendKeys("Shorty Party");
		
		driver.findElement(By.xpath(lupaYoutube)).click();
		driver.findElement(By.linkText(nombreVideo)).click();
		
	

	}

}
