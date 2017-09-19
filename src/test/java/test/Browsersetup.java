package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Browsersetup extends TestDriver{
	
	
	@Before
	public void setup(){
		initialize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void closebrowser(){
		close();
	}
}