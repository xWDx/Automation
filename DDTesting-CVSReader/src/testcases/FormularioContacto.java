package testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bases.Base;
import repositorio.contactFormRepository;

public class FormularioContacto extends Base {
	
	@BeforeTest
	public void openBrowser() {}
	@AfterTest
	public void cerarBrowser(){}
	
	@Test
	public void aplicarDataForm() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		 contactFormRepository contacto = new contactFormRepository(driver);
		 
		driver.get("https://winstoncastillo.com/robot-selenium/index.php?route=information/contact");
		//System.out.println(driver.getTitle());
		ArrayList<String> datos= datosLeidos.getData();
		int number = datos.size();
		System.out.println(number);
		
		for(int i=1; i<number; i++) {
			String[] lineaDatos = datos.get(i).split(";");
			contacto.fieldNameElement().sendKeys(lineaDatos[1]);
			contacto.fieldEmailElement().sendKeys(lineaDatos[2]);
			contacto.fieldDescriptionElement().sendKeys(lineaDatos[3]);
			contacto.submitButton().click();
			System.out.println("Repeticion: " + i);
			driver.get("https://winstoncastillo.com/robot-selenium/index.php?route=information/contact");
	
		}
		
		driver.close();
		
	}

}
