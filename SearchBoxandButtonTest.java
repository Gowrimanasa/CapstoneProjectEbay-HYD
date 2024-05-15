package CapstoneProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.OpenChromeBrowser;


public class SearchBoxandButtonTest {
	public WebDriver driver;
	static HomePage searchBoxandButton;
	boolean res;
	
	
	@AfterClass
	public void closeDriver()
	{
	driver.close();	
	}
	
	@BeforeClass
	public void initDriver()
	{
		OpenChromeBrowser ob = new OpenChromeBrowser();
		
		driver = ob.openChrome();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		searchBoxandButton = new HomePage (driver);	
	}
	
  @Test(priority=2)
  public void SearchBoxIsPresent() {
	  Assert.assertEquals(true, searchBoxandButton.checkSearchBoxIsPresent());
	  
  }
  
  @Test(priority=1)
  public void SearchButtonIsPresent() {
	  Assert.assertEquals(true, searchBoxandButton.checkSearchButtonIsPresent());
	  
  }

}
