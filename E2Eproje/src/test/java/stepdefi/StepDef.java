package stepdefi;

import java.util.concurrent.TimeUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.LandPag;
import pageobjects.LoginP;
import resources.Base;

public class StepDef extends Base {

	

@Given("^initialize browser$")
public void initialize_browser() throws Throwable {
	driver = inidriver();	

}

@Given("^navigate to \"([^\"]*)\" site$")
public void navigate_to_site(String arg1) throws Throwable {
	driver.get(arg1);
    
}

@Given("^click on login link in home$")
public void click_on_login_link_in_home() throws Throwable {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LandPag L = new LandPag(driver);
	L.drop().click();
	L.log().click();
    
}

@When("^user enters (.+) and (.+)$")
public void user_enters_and(String username, String password) throws Throwable {
   LoginP Lp= new LoginP(driver);
	Lp.email().sendKeys(username);
	Lp.pass().sendKeys(password);	
	Lp.log().click();
    
}

@Then("^verify thast user is successfully loggedin$")
public void verify_thast_user_is_successfully_loggedin() throws Throwable {
	LoginP Lp= new LoginP(driver);
   
}

@And("^close browser$")
public void close_browser() throws Throwable {
    driver.quit();
}

}
