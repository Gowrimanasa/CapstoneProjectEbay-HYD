package CapstoneProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HKPages.LandingPage;
import HKPages.LoginPage;
import utils.OpenChromeBrowser;

public class LoginpageTestcase1 {
	static WebDriver driver;
	static LoginPage lp1;
	static LandingPage landingpage1;
	boolean res;
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	
	@BeforeClass
	public void initDriver()
	{
		
		OpenChromeBrowser ob = new OpenChromeBrowser();
		driver = ob.openChrome();
		driver.get("https://the-internet.herokuapp.com/login");
		lp1 = new LoginPage(driver);
		landingpage1 = new LandingPage(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp1.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	
	
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp1.isPasswordMasked());
	}
	
	@Test
	public void doLogin()
	{
		lp1.fillUsername("tomsmith");
		lp1.fillPassword("SuperSecretPassword!");
		lp1.clickLoginBtn();
		
		Assert.assertEquals(true,landingpage1.isLoginSuccess());
		
	}
	@Test
	public void doLoginNegativeSecurity()
	{
		lp1.fillUsername("tomsmith");
		lp1.fillPassword("SuperSPassword!");
		((LoginPage) lp1).clickLoginBtn();
		
		Assert.assertEquals(false,((LandingPage) landingpage1).isLoginSuccess());
		
	}
	
	
}


 
