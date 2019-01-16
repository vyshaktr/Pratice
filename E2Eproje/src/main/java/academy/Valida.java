package academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobjects.LandPag;
import resources.Base;
public class Valida extends Base {
	
	
	@BeforeTest
	public void ind() throws IOException
	{
		driver = inidriver();
		
		driver.get(prop.getProperty("URL"));
		
	}

	@Test
	public void basepval() throws IOException {		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LandPag L = new LandPag(driver);
		//Assert.assertEquals(L.title().getText(), "ICICI Offer Ends In");
		Assert.assertTrue(L.visi().isDisplayed());
	}
	
	@AfterTest
	public void clobro()
	{
		driver.close();
		driver=null;
	}

}
