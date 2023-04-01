package com.pruebasendtoend.iframesyesperas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Iframes {

	
	@Test
	public void Iframes() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://winstoncastillo.com/ejercicios/atoc.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframes")).size());
		//maneras de moverse entre iframes
		driver.switchTo().frame(0);
		driver.switchTo().frame("iframe-prueba");
		driver.findElement(By.xpath("//*[@id=\"elemento01\"]/a/p")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

	}
	

}
