package test;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"Step_Definition","test"},
		tags={"@TC05"},
		plugin = {
		        "html:target/cucumber.html", "json:target/cucumber.json",
		         })
		

public class RunTest {

}
