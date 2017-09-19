package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Giftcard {
	
	@FindBy(how=How.ID,using="giftCardToggle")
	private WebElement GIftcardexpand;
	
	@FindBy(how=How.ID,using="txtGiftCardNum")
	private WebElement GIftcardnumber;
	
	@FindBy(how=How.ID,using="txtGiftPin")
	private WebElement GIftcardpin;
	
	@FindBy(how=How.ID,using="btnGiftPin")
	private WebElement GIftcardapply;
	
	
	public void expandGiftCard() {
		 
		 GIftcardexpand.click();   
		 }  
	
	public void enterGiftCardNumber(String arg1) {
		 
		 GIftcardnumber.sendKeys(arg1);   
		 } 
	
	public void enterGiftCardPin(String arg1) {
		 
		 GIftcardpin.sendKeys(arg1);   
		 } 
	
	public void giftCardApply() {
		 
		 GIftcardapply.click();   
		 }

}
