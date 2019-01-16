package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginP {
	
	public WebDriver driver;
	
	
	public LoginP(WebDriver driver) {
		this.driver=driver;
	}

	By username=By.xpath("//input[@type='email']");
	By password = By.xpath("//input[@type='password']");
	By login=By.xpath("//button[@class='login-login-button']");
	By createaccount= By.xpath("//a[@class='login-create-account-link login-link']");
	By textv= By.xpath("//p[@class='login-title']")	;
	public WebElement email()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement pass()
	{
		return driver.findElement(password);
		
	}

	public WebElement log() {
		return driver.findElement(login);

	}

	public void max() {
		driver.manage().window().maximize();
		
	}
	public WebElement creaacc()
	{
		return driver.findElement(createaccount);
		
	}	
	public WebElement textv()
	{
		return driver.findElement(textv);
		
	}
	
}
