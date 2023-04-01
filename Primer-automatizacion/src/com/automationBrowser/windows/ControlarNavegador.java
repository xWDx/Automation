package com.automationBrowser.windows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ControlarNavegador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://winstoncastillo.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.className("mc-closeModal")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		//Declaracion de la nueva clase Actions
		Actions acciones = new Actions(driver);
		WebElement opcionMenu = driver.findElement(By.className("btnCursos"));
		acciones.moveToElement(opcionMenu).perform();
		
		//Manipulando nuevas pestañas
		/*WebDriver driver2 = new ChromeDriver(options);
		driver2.get("https://www.Youtube.com");
		driver2.quit();*/
		String primerPestana = driver.getWindowHandle();
		Integer cantidadPestanas = driver.getWindowHandles().size();
		System.out.println(cantidadPestanas);
		JavascriptExecutor codigo = (JavascriptExecutor)driver;
		codigo.executeScript("window.open()");
		cantidadPestanas = driver.getWindowHandles().size();
		System.out.println(cantidadPestanas);
		ArrayList<String> pestanas = new ArrayList<String>(driver.getWindowHandles());  
		driver.switchTo().window(pestanas.get(1));
		driver.get("https://www.google.com");
		
		String segundaPestana = driver.getWindowHandle();
		codigo.executeScript("window.open()");
		codigo.executeScript("window.open()");
		
		pestanas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(pestanas.get(2));
		driver.get("https://www.google.com");
		
		String terceraPestana = driver.getWindowHandle();
		driver.switchTo().window(pestanas.get(3));
		driver.get("https://www.google.com");
		
		String cuartaPestana = driver.getWindowHandle();
		cantidadPestanas = driver.getWindowHandles().size();
		System.out.println(cantidadPestanas);
		driver.switchTo().window(primerPestana);
	}

}
