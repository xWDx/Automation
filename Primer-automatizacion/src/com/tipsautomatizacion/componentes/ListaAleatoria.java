package com.tipsautomatizacion.componentes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ListaAleatoria {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

		ChromeOptions notificaciones = new ChromeOptions();
		notificaciones.addArguments("--remote-allow-origins=*");
		notificaciones.addArguments("--disable-notifications");
		notificaciones.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(notificaciones);


		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(2000);
		List<WebElement> opciones = driver.findElements(By.id("nav-flyout-searchAjax"));
		for (WebElement opcion:opciones) {
			//System.out.println(opcion.getText());
			if (opcion.getText().contains("laptop stand")) {
				opcion.click();
				break;
			}
		}
		
		Assert.assertEquals(driver.getTitle(), "Amazon.com");
	}

}
