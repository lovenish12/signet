package Step_Definition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import page_objects.Giftcard;
import page_objects.Smoketest;
import test.TestDriver;

public class Giftcardstep extends TestDriver {
	
	private Giftcard Giftcards;
	
	
	@Given("^I am on the payment details page$")
	public void i_am_on_the_payment_details_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://test3.sterlingjewelers.com");
	}
	
	@Given("^I expand Giftcard$")
	public void i_expand_Giftcard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Giftcards=PageFactory.initElements(driver, Giftcard.class);
	    Giftcards.expandGiftCard();
	}

	
	@Given("^I enter giftcardnumber \"([^\"]*)\" on payment page$")
	public void i_enter_giftcardnumber_on_payment_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	   Giftcards.enterGiftCardNumber(arg1);
	}

	@Given("^I enter giftcardpin \"([^\"]*)\" on payment page$")
	public void i_enter_giftcardpin_on_payment_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Giftcards.enterGiftCardPin(arg1);
	}
	
	@Given("^I click on aplly giftcard button$")
	public void i_click_on_aplly_Giftcard_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Giftcards.giftCardApply();
	    Thread.sleep(4000);
	}

	@Given("^I take a screenshot \"([^\"]*)\"$")
	public void i_take_a_screenshot(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  screenShot(arg1);
	}


}
