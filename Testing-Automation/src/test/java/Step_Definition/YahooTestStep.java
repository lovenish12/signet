package Step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import page_objects.submit;
import page_objects.Smoketest;
import utility.TestDriver;
import utility.ReadProperty;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class YahooTestStep extends TestDriver {
	
	
	private Smoketest yahootests;
	
	String link =ReadProperty.loadProperty("LINK");
		 
	
	@Given("^I am on the yahoo mail site$")
	public void i_am_on_the_yahoo_mail_site() throws Throwable {
	    // Write code here that t"webdriver.chrome.driverurns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lovenish pc\\Downloads\\chromedriver.exe");
	
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
			System.out.println(driver.getWindowHandle());
			driver.get(link);
			
		}
		
	   // driver.get("https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com");
	

	
	
	@Then("^I capture screenshot$")
	public void i_capture_screenshot() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		screenShot();
	}
	


}
