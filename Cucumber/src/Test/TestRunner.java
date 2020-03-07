package Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Javd\\eclipse-workspace\\Cucumber\\Feature\\Search.Google",
glue= {"StepDefinitions"})

public class TestRunner {

}
