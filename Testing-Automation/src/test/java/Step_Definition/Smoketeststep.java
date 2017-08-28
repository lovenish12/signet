package Step_Definition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import page_objects.Smoketest;
import page_objects.Smoketest;
import utility.ReadProperty;
import utility.TestDriver;

public class Smoketeststep extends TestDriver {
	
	private Smoketest smoketests;
	
	String link =ReadProperty.loadProperty("LINK");
	
	
	@Given("^I navigate on to the zales site$")
	public void i_navigate_on_to_the_zales_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smoketests=PageFactory.initElements(driver, Smoketest.class);
	    driver.get(link);  
	    
	}

	
	@Given("^I enter \"([^\"]*)\" in the searchbox$")
	public void i_enter_in_the_searchbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	smoketests.enterSearchbox(arg1);
	
	
	}
	
	
	@Given("^I click on favorite icon on PLP page$")
	public void i_click_on_favorite_icon_on_PLP_page() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		smoketests.clickAddToFavoriteIcon();
	}
	
	@Given("^I verify that compare button is disabled on PLP page$")
	public void i_verify_that_compare_button_is_disabled_on_PLP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smoketests.verifyCompareCTAIsDisabled();
	    System.out.println("coompare button is disabled");
	}

	@Given("^I click on add to compare button$")
	public void i_click_on_add_to_compare_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		smoketests.clickPrice();
	    smoketests.clickAddToCompareIcon();
	}
	
	@Given("^I click on add to compare button for second product$")
	public void i_click_on_add_to_compare_button_for_second_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.clickAddToCompareIcon2();
	}

	@Given("^I verify that compare button is enabled on PLP page$")
	public void i_verify_that_compare_button_is_enabled_on_PLP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.verifyCompareCTAIsEnabled();
	}
		
	@Given("^I verify the number of product on search result page$")
	public void i_verify_the_number_of_product_on_search_result_page() throws Throwable {
		smoketests.productcount();
		
	}
	
	@Given("^I click on the serachbox field$")
	public void i_click_on_the_serachbox_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smoketests.clickSearchbox();
	}

	@Given("^I click on the serachbox submit button$")
	public void i_click_on_the_serachbox_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smoketests.searchboxSubmit();
		
	}

	
	@Given("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		smoketests.clickSignInButtonInHeader();
	}
	
	@Given("^I enter the \"([^\"]*)\" data$")
	public void i_enter_the_data(String arg1) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   String email= ReadProperty.loadTestdata("email", arg1);
	   String Password= ReadProperty.loadTestdata("Password", arg1);
	   smoketests.enterEmailAddress(email);
	   smoketests.enterPassword(Password);
	   
	}
	
	@Given("^I click on signin button$")
	public void i_click_on_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		smoketests.clickSigninbutton();
	}

	
	
	@Given("^I click on product available on PLP page$")
	public void i_click_on_product_available_on_PLP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		smoketests.clickProductImageOnPLP();
	}

	@Given("^I click on add to shopping bag on PDP page$")
	public void i_click_on_add_to_shopping_bag_on_PDP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(4000);
		smoketests.clickAddToShoppingCartCTA();
	}
	
	@Given("^I click on ship to store$")
	public void i_click_on_ship_to_store() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(4000);
		smoketests.clickShipToStore();
	}

	@Given("^I click on checkout now button on PDP page$")
	public void i_click_on_checkout_now_button_on_PDP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
		smoketests.clickCheckout();
	}
	
	
	@Given("^I click on mini shopping bag icon$")
	public void i_click_on_mini_shopping_bag_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);
		smoketests.clickMinishoppingbag();
	}
	
	@Given("^I click on checkout button$")
	public void i_click_on_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		smoketests.clickCheckoutbutton();
	}
	
	@Given("^I enter \"([^\"]*)\" zip code on store location field$")
	public void i_enter_zip_code_on_store_location_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
		smoketests.enterStoreLocation(arg1);
	}

	@Given("^I click on search for stores button$")
	public void i_click_on_search_for_stores_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.clickSearchStore();
	    Thread.sleep(2000);
	}

	@Given("^I click on next button on shipping details page$")
	public void i_click_on_next_button_on_shipping_details_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    smoketests.clickNextShipping();
	}

	@Given("^I click on next button on gift message page$")
	public void i_click_on_next_button_on_gift_message_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	    smoketests.clickNextGiftMessage();
	}

	@Given("^I click on save credit card$")
	public void i_click_on_save_credit_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Given("^I select save credit card$")
	public void i_select_save_credit_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.selectSavedCard();
	}
	
	@Given("^I enter \"([^\"]*)\" cvv on payment details page$")
	public void i_enter_cvv_on_payment_details_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.enterCVV(arg1);
	}
	
	
	@Given("^I click on next button on payment detail page$")
	public void i_click_on_next_button_on_payment_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	    smoketests.clickNextPayment();
	}
	
	@Given("^I click on place an order on summary page$")
	public void i_click_on_place_an_order_on_summary_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	    smoketests.clickPlaceOrder();
	}
	
	@Given("^I take a screenshot of zales home page$")
	public void i_take_a_screenshot_of_zales_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    screenShot();
	}

	@Given("^I take a screenshot of zales login page$")
	public void i_take_a_screenshot_of_zales_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}

	@Given("^I take a screenshot of zales user account page$")
	public void i_take_a_screenshot_of_zales_user_account_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}

	@Given("^I take a screenshot of search result page$")
	public void i_take_a_screenshot_of_search_result_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}

	@Given("^I take a screenshot of PDP page$")
	public void i_take_a_screenshot_of_PDP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}

	@Given("^I take a screenshot of checkout page$")
	public void i_take_a_screenshot_of_checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}

	@Given("^I take a screenshot for delivery page$")
	public void i_take_a_screenshot_for_delivery_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}
	
	@Given("^I take a screenshot for gift page$")
	public void i_take_a_screenshot_for_gift_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    screenShot();
	}

	@Given("^I take a screenshot for payment page$")
	public void i_take_a_screenshot_for_payment_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    screenShot();
	}

	@Given("^I take a screenshot for summary page$")
	public void i_take_a_screenshot_for_summary_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    screenShot();
	}

	@Given("^I click on save address on shipping detail page$")
	public void i_click_on_save_address_on_shipping_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.clickSavedCardShipping();
	}

	@Given("^I select saved address on shipping detail page$")
	public void i_select_saved_address_on_shipping_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.selectSavedCardShipping();
	}

	@Given("^I click next button on shipping detail page$")
	public void i_click_next_button_on_shipping_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    smoketests.clickNextshipping();
	}

	@Given("^I click on save address on payment detail page$")
	public void i_click_on_save_address_on_payment_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	    smoketests.clickSavedCardpayment();
	}

	@Given("^I select saved address on payment detail page$")
	public void i_select_saved_address_on_payment_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
		smoketests.selectSavedCard();
	}	
	

}
