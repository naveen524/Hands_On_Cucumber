package stepDefiniation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/Features/flipkart_Login.feature"},
glue = {"stepDefiniation"},
monochrome = true

)
public class TestRunner {

}
