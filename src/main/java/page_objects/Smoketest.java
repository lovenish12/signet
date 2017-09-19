package page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import test.TestDriver;


public class Smoketest extends TestDriver {
	
	
	
//_______________________________-webelements____________________________________________________//	
	@FindBy(how=How.ID,using="login-username")
	private WebElement email;

	// Home Page
	  @FindBy(xpath="//li[contains(@class,'sign-in')]//a[contains(@class,'login')]")
	  private WebElement signInButton;
	  
	  @FindBy(xpath="//*[@class='thumb main-thumb']")
	 private List<WebElement> Productlist = new ArrayList();
	  
	  @FindBy(xpath="(//a[@class='thumb']//following-sibling::label//span[@class='signet-text'])[1]")
		 private WebElement addtocompare;
	  
	  //(//a[@class='thumb']//following-sibling::label)[1]//span[@class='signet-mark']
	  
	 @FindBy(id="js-site-search-input")
		private WebElement Searchboxclick;
	  
	  @FindBy(id="js-site-search-input")
		private WebElement Entersearchbox;
	  
	  @FindBy(xpath="//*[@id='search_form_SearchBox_submit']")
	  private WebElement Searchboxsubmit;
	  
	 //Login Page//*[@id="search_form_SearchBox_submit"]/span
	  @FindBy(id="j_username")
	  private WebElement emailAddressInputBox;
	  
	  @FindBy(id="j_password")
	  private WebElement passwordInputBox;
	  
	  //PLP Page
	  @FindBy(xpath="//div[@class='compare-actions']//a[@disabled]")
		private WebElement disabledCompareButton;
		
	  @FindBy(xpath="//div[@class='compare-actions']//a")
		private WebElement enabledCompareButton;
		
	  @FindBy(xpath="//div[@class='compare-actions']//button")
		private WebElement clearAll;
		
	  @FindBy(xpath="//img[contains(@title,'Butterfly with Tail Belly Button Ring with Cubic Zirconia in 14K Gold')]")
		private WebElement productImagePeoples;
	  
	  @FindBy(xpath="//a[@class='thumb main-thumb']")
		private  List<WebElement> productImagegordon=new ArrayList();
	  
	  @FindBy(xpath="(//a[@class='thumb main-thumb'])[1]")
		private  WebElement higlightproduct;
	  
	  @FindBy(xpath="//img[contains(@title,'Oval Link Charm Bracelet in Sterling Silver and 18K Gold Plate - 7.5&quot;')]")
		private WebElement productImagepagoda;
	  
	  @FindBy(xpath="//img[contains(@title,'Ever Us™ 2 CT. T.W. Two-Stone Diamond Bypass Necklace in 14K White Gold - 19.5&quot;')]")
		private WebElement productImagezalesoutlet;
	  
	  @FindBy(xpath="//i[contains(@class,'heart')][1]")
		private WebElement addToFavoriteIcon;
	  
	  @FindBy(xpath="(//div[contains(@class,'margin-t9')])[2]")
		private WebElement price;
	  
		
	  @FindBy(xpath="(//span[contains(@class,'signet-mark')])[5]")
		private WebElement addToCompareIcon;
	  
	  @FindBy(xpath="(//span[contains(@class,'signet-text')])[5]")
		private WebElement addToCompareIcon2;
	  
	  @FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block btn-login')]")
		private WebElement signinbutton;
	  
	 
	  
	  //PDP Page Elements
	  @FindBy(id="addToCartButton")
		private WebElement addToShoppingBagCTA;
	  
	  @FindBy(id="addToCartForm")
		private WebElement addToShoppingBaggordon;
		
	  @FindBy(xpath="//button[contains(@class,'btn-favorite')]")
		private WebElement favoriteCTA; 
	  
	  @FindBy(linkText="/cart")
		private WebElement checkout;
	  
	  @FindBy(id="mini-cart-comp-total")
		private WebElement minishoppingbag;
	  
	  //checkout page
	  
	  @FindBy(xpath="/html/body/main/div/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/button")
	  private WebElement CheckoutButton;
	  
	  @FindBy(xpath="/html/body/main/div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div/div/div[3]/button/span")
	  private WebElement shiptostore;
	  
	  
	  @FindBy(id="locationQuery")
		private WebElement storelocation;
	  
	  @FindBy(xpath="//button[contains(@class,'form-group')]")
	  private WebElement searchstorebutton;
	  
	  @FindBy(id="shipToStoreSubmit")
		private WebElement shippingsubmit;
	  
	  @FindBy(xpath="//button[contains(@class,'checkout-next')]")
	  private WebElement giftmessagepageNextbutton;
	  
	  @FindBy(xpath="/html/body/main/div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div/div[1]/div/div[3]/label[1]")
	  private WebElement Savedcreditcardshipping;
	  
	  
	  @FindBy(xpath="/html/body/main/div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/label")
	  private WebElement clickSavedcreditcard;
	  
	  ///html/body/main/div/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div[5]/div[2]/div[1]/label
	  
	  @FindBy(xpath="//*[@id='addressbook']/div[1]/form/button")
	  private WebElement selectSavedcreditcardshipping;
	  
	  @FindBy(xpath="//*[@id='methodSubmit']")
	  private WebElement clicknextshipping;
	  
	  @FindBy(xpath="//*[@id='savedpaymentsbody']/form[1]/button")
	  private WebElement clickselectSavedcreditcardpayment;
	  

	  @FindBy(xpath="//*[@id='card_cvNumber_dummy']")
	  private WebElement entercvv;
	  
	 
	  
	  @FindBy(id="nextButtonForSavedCreditCard")
	  private WebElement selectclicknextpayment;
	  
	  @FindBy(xpath="//*[@id='placeOrder']")
		private WebElement PlaceOrder;
	  
//__________________________________methods_______________________________________//
	  
	 // HOme Page Methods 

	 public void clickSignInButtonInHeader() { 
	  //signInButton.click();
		 Actions actions = new Actions(driver);
		 actions.click(signInButton).perform();
	 }  
	 
	 public void clickSearchbox() { 
		  Searchboxclick.click(); 
		 }  
	 
	 public void enterSearchbox(String arg1) {
		 
		 Entersearchbox.sendKeys(arg1);   
		 }  
	 
	 public void searchboxSubmit() { 
		  Searchboxsubmit.click(); 
		 }  
	 
//Login Page Methods
	 
	 public void enterEmailAddress(String arg1){
		  System.out.println(arg1);
		  emailAddressInputBox.sendKeys(arg1);
		   return;
		     }
		 
		 public void enterPassword(String arg1){
		  System.out.println(arg1);
		  passwordInputBox.sendKeys(arg1);
		   return;
		  }
	 
	 // PLP PAge Methods
	public void productcount() { 
	  System.out.println("The number of products on the serach result page is"+Productlist.size()); 
	 } 
	
	public void verifyCompareCTAIsEnabled() {
		Assert.assertTrue("Compare Button Is Enabled",enabledCompareButton.isDisplayed());
	} 
	
	public void verifyCompareCTAIsDisabled() {
		Assert.assertTrue("Compare Button Is Disabled",disabledCompareButton.isDisplayed());
	} 
 

	public void clickProductImageOnPLPPeoples() {
		productImagePeoples.click();
	} 
	
	public void clickProductImageOnPLPgordon(int i) {
		productImagegordon.get(i).click();
	} 
	
	public void clickProductImageOnP() {
		//Actions act = new Actions(driver);
		//act.moveToElement(higlightproduct).perform();
		
		//helper.highLightElement(driver, higlightproduct);
		
		addtocompare.click();
	} 
	
	public void Mousehover() {
		Actions act = new Actions(driver);
		act.moveToElement(higlightproduct).perform();
	}
	
	public void clickProductImageOnPLPagoda() {
		productImagepagoda.click();
	} 
	
	public void clickProductImageOnPLPZalesoutlet() {
		productImagezalesoutlet.click();
	} 

	public void clickAddToFavoriteIcon() {
		
		
		/*System.out.println(i);
		Actions builder = new Actions(driver);
		 builder.moveToElement(addToFavoriteIcon.get(i)).build().perform();
		addToFavoriteIcon.get(i).click();
	*/
		addToFavoriteIcon.click();
	}
	
	public void clickAddToCompareIcon(int arg1) {
		//addtocompare.click();	
	} 
	
	public void clickAddToCompareIcon2() {
		addToCompareIcon2.click();	
	}

	 // PDP PAge Methods
	 public void clickAddToShoppingCartCTA() {
			addToShoppingBagCTA.click();
		}
		
	 public void clickAddToShoppingCartGordon() {
			addToShoppingBaggordon.click();
		}
	 
	 public void clickFavoriteCTA() {
			favoriteCTA.click();
		} 
	 
	 public void clickPrice() {
		
		 Assert.assertEquals(79.00, price.getText());
		 System.out.println(price.getText());
			
		} 
	 
	 public void clickCheckout() {
			checkout.click();
		}
		
	 
	 public void clickSigninbutton() {
			signinbutton.click();
		}
	 /*public void highlightElement(int i){
		 WebDriver driver = new ChromeDriver();
		new Actions(driver).moveToElement().click().perform();
	 }*/
	 
	 public void clickMinishoppingbag() {
		 minishoppingbag.click();
		}
	 
	 public void clickCheckoutbutton() {
		 CheckoutButton.click();
		}
	 
	 public WebElement signINButton() {
		 return signInButton;
		}

	 public void enterStoreLocation(String arg1) {
		 storelocation.sendKeys(arg1);
		}
	 
	 public void clickSearchStore() {
		 searchstorebutton.click();
		}
	 
	 public void clickNextShipping() {
		 shippingsubmit.click();
		}
	 
	 public void clickNextGiftMessage() {
		 giftmessagepageNextbutton.click();
		}
	 
	 public void clickSavedCardpayment() {
		 clickSavedcreditcard.click();
		}
	 
	 public void selectSavedCard() {
		 clickselectSavedcreditcardpayment.click();
		}
	 
	 public void enterCVV(String arg1) {
		 entercvv.sendKeys(arg1);
		}
	 
	 public void clickNextPayment() {
		 selectclicknextpayment.click();
		}
	 
	 public void clickShipToStore() {
		 shiptostore.click();
		}
	 
	 public void clickPlaceOrder() {
		 PlaceOrder.click();
		}
	 
	 public void clickSavedCardShipping() {
		 Savedcreditcardshipping.click();
		}
	 
	 public void selectSavedCardShipping() {
		 selectSavedcreditcardshipping.click();
		}
	 
	 public void clickNextshipping() {
		 clicknextshipping.click();
		}

}
