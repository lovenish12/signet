package utility;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"Step_Definition","utility"},
		tags={"@TC01"},
		plugin = {
		        "html:target/LoginReport", "json:target/cucumber.json",
		        "pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" })
		

public class Runner {

}
