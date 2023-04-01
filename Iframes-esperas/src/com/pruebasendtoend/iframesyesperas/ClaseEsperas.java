package com.pruebasendtoend.iframesyesperas;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClaseEsperas {
	
		@Test(enabled = false)
		public void EsperaImplicita() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://winstoncastillo.com/ejercicios/atoc.html#home");
		driver.manage().window().maximize();
		Actions mouseActions = new Actions(driver);
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"OpcionMenuUno\"]"));
		mouseActions.moveToElement(elemento).perform();
		driver.findElement(By.xpath("https://winstoncastillo.com/ejercicios/atoc.html#home")).click();
}
		
		@Test
		public void EsperaExplicita() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//Explicit Wait
		
		driver.get("https://winstoncastillo.com/ejercicios/atoc.html#home");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SUSCRIBIRSE")).click();
		
		WebElement espera = new WebDriverWait(driver, Duration.ofSeconds(20)).
		until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/yt-button-shape/button"))));
		
		driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/yt-button-shape/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"button\"]/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).getText());
	
		}
}
