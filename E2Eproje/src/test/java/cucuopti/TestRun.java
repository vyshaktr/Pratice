package cucuopti;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "C:\\Users\\vyshak.t.r\\E2Eproje\\src\\test\\java\\features",
	    glue="stepdefi")
public class TestRun extends AbstractTestNGCucumberTests{
}

 
