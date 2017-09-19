package test;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestDriver  {
	protected static WebDriver driver;
	
	
	protected static WebDriver initialize()
	{
		System.out.println("In driverInit()");
		String userDir=System.getProperty("user.dir");
		Platform current = Platform.getCurrent();
		String firefox = ReadProperty.loadProperty("seleniumfirefox");
		String chrome = ReadProperty.loadProperty("seleniumchrome");
		{
		if(firefox.equals("yes"))
			
		{
			System.out.println("firefox");
			if(current.WINDOWS!=null)
			{
				System.out.println("initializing firefox2");
				try
				{
					System.out.println("initializing firefox");
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\lovenish.saluja\\Downloads\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				catch(Exception e1)
				{
					System.out.println("firefox not found");
					e1.printStackTrace();
			}
				// similarly for xp,mac and vista
				}
			
		}
		else if (chrome.equals("yes"))
		{
			System.out.println("chrome");
			if (current.WINDOWS!=null)
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\lovenish.saluja\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		// similarly for xp,mac and vista	
			}
		}
		return driver;
		
				
		}


				
	
	public void close() {
		this.driver.quit();
		
	}
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public void get(String arg0) {
		
		this.driver.get(arg0);
		// TODO Auto-generated method stub
		
	}
	public void screenShot(String arg1) {
		try{
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./reports/" +arg1+".png"));
		}

		catch(Exception e){
		System.out.println("exception while taking screenshot");	
		}
		
	}
	
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}


}
