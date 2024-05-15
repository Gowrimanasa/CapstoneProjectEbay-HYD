package CapstoneProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.OpenChromeBrowser;



public class CheckTitleEbayTest {
	private static final String ActualTitle= null;
  @Test
  public void checktitle() throws IOException {
	  WebDriver driver;
		OpenChromeBrowser ob = new OpenChromeBrowser();
		driver = ob.openChrome();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String ActualTitle = driver.getTitle() ;
		System.out.print("ActualTitle");
		String ExcepectedTitle = ("Electronics, Cars, Fashion, Collectibles & More | eBay");
		
		
	        
	        Assert.assertEquals(ActualTitle, ExcepectedTitle);
	    }
    
	  
  }

