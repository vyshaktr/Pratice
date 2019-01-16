package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandPag {
	
	public WebDriver driver;
	
	public LandPag(WebDriver driver) {
		this.driver=driver;}
		
	By drop=By.xpath("//span[@class='myntraweb-sprite desktop-caret sprites-caret']");
	By log = By.xpath("//a[@href='/login?referer=https://www.myntra.com/']");
	By title = By.xpath("//div[@class='desktop-saleMessage']");
	By visi = By.xpath("//*[text()='Gift Card']");
	public WebElement drop()
	{
		return driver.findElement(drop);
		
	}
	public WebElement log()
	{
		return driver.findElement(log);
		
	}
	public WebElement title()
	{
		return driver.findElement(title);
		
	}
	
	public WebElement visi()
	{
		return driver.findElement(visi);
		
	}


}
