package academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandPag;
import pageobjects.LoginP;
import resources.Base;

public class Homep extends Base {

	// Base b = new Base();

	@Test(dataProvider="getdata")
	public void basep(String username,String pass,String text) throws IOException {
		driver = inidriver();
		driver.get("https://www.myntra.com/");
		System.out.println("site is opening");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LandPag L = new LandPag(driver);
		L.drop().click();
		L.log().click();
		LoginP Lp= new LoginP(driver);
		Lp.email().sendKeys(username);
		Lp.pass().sendKeys(pass);
		System.out.println(text);
		Lp.log().click();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="vyshaktr6@gmail.com";
		data[0][1]="V@1993tr";
		data[0][2]="firstuser";
		
		data[1][0]="vyshak6@gmail.com";
		data[1][1]="V@1893tr";
		data[1][2]="seocnduser";
		
		return data;
	}
	
	
	
}
