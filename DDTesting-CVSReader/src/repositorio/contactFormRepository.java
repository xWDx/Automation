package repositorio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactFormRepository {

	WebDriver driver;

	public contactFormRepository(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-name")
	WebElement fieldName;
	@FindBy(id="input-email")
	WebElement fieldEmail;
	@FindBy(id="input-enquiry")
	WebElement fieldDescription;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	WebElement submitButton;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
	WebElement continueButton;
	
	public WebElement fieldNameElement() {
		return fieldName;
	}
	public WebElement fieldEmailElement() {
		return fieldEmail;
	}
	public WebElement fieldDescriptionElement() {
		return fieldDescription;
	}
	public WebElement submitButton() {
		return submitButton;
	}
	public WebElement continueButton() {
		return continueButton;
	}
	

}
