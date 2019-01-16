package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop = new Properties();
	public 	 WebDriver inidriver() throws IOException
	{
		
		FileInputStream f = new FileInputStream("C:\\Users\\vyshak.t.r\\E2Eproje\\src\\main\\java\\resources\\data.properties");
	prop.load(f);
	String bname=prop.getProperty("browser");
	if(bname.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vyshak.t.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	}
	else
	{
		System.out.println("invalid browser");
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	public void screen(String name) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\vyshak.t.r\\Downloads\\Scrrenshots\\"+name +"screen.png"));
	}
	
	
	
}
