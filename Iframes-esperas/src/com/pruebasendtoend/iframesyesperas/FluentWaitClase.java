package com.pruebasendtoend.iframesyesperas;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluentWaitClase {
	
	@Test
	public void FluentWaitMetodo() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	//Fluent Wait
	Wait<WebDriver> espera = new FluentWait<WebDriver>(driver)
			// Es el tiempo que espera para fallar el test
			.withTimeout(Duration.ofSeconds(5))
			//Cada 5 segundos va a hacer el proceso de busqueda
			.pollingEvery(Duration.ofSeconds(5))
			//Para ignorar la clase NoSuchElementException para que no falle la prueba porque el elemento realemnte existe
			.ignoring(NoSuchElementException.class);
	
	driver.get("https://winstoncastillo.com/ejercicios/atoc.html#home");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("SUSCRIBIRSE")).click();
	
	WebElement fluent =  espera.until( new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/yt-button-shape/button"));
		}
	
			}
	);
	
	driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/yt-button-shape/button")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id=\"button\"]/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).getText());

	}

}
