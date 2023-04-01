package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class CasosCarrito extends Base {
	
	@Test
	public void elegirArticulosAlAzar() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.demoblaze.com/index.html");
		Assert.assertEquals(driver.getTitle(), "STORE");
		WebElement contenedorDeProductos = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]"));
		listaDeProductos =  contenedorDeProductos.findElements(By.tagName("div"));
		System.out.println(listaDeProductos.size());
	}
	
	@AfterSuite
	public void CerrarNavegador(WebDriver driver) {
		driver.close();
		}
 
}
