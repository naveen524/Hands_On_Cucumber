package stepDefiniation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Hands_On_Cucumber/src/test/resources/Features/flipkart_Login.feature"},
glue= {"/Hands_On_Cucumber/src/test/java/stepDefiniation/flipkart_Login.java"},
monochrome = true
		)
public class TestRunner_Flipkart {

}
