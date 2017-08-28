package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.TestDriver;

public class submit extends TestDriver {
	

		
	
	//_____________ webelements________________________________________________________________________//
	@FindBy(how=How.ID,using="login-signin")
	private WebElement next;
	
	
	
	//________________methods__________________________________________________________________________//
	public void nextButton(){
		next.click();
	}

	
}
