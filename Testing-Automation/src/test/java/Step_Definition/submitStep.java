package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page_objects.submit;
import utility.TestDriver;

public class submitStep extends TestDriver {
	
	private submit submits;
	
	
	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		
		submits = PageFactory.initElements(driver, submit.class);
		submits.nextButton();
	}
	

	
	
}
