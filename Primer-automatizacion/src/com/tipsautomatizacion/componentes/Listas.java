package com.tipsautomatizacion.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.google.mx");
		
		WebElement listaEstatica = driver.findElement(By.id("id_contact"));
		Select listaSeleccionada = new Select(listaEstatica);
		listaSeleccionada.selectByIndex(2);
		listaSeleccionada.selectByVisibleText("Customer Service");
		listaSeleccionada.selectByValue("2");
		
		
	}

}
