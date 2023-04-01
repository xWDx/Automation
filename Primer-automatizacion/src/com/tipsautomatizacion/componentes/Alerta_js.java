package com.tipsautomatizacion.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerta_js {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver navegador = new ChromeDriver(options);
		navegador.get("http://winstoncastillo.com/ejercicios/atoc.html");
		navegador.findElement(By.cssSelector("#testCasesAtoC > p:nth-child(2) > button")).click();
		String mensaje = navegador.switchTo().alert().getText().toString();
		System.out.println(mensaje);
		navegador.switchTo().alert().accept();
		navegador.close();
	}

}
