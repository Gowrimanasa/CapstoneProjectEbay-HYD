package CapstoneProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utils.ExcelApiTest;

public class EbaySearchTestCase
{
	static WebDriver driver;
	static boolean res;
	static EbayHomePage_PageObject1 eb;
	
	
	@DataProvider
	public  Object[][]  dp(){
		return  new Object[][]
				{
			new Object[] {"laptop"},
			new Object[] {"astryufd"},
				};
	}
	
	
	@BeforeClass
	public void initDriver()
	{
		
		driver = new ChromeDriver();
		eb = new EbayHomePage_PageObject1(driver);
		
		driver.get("https://www.ebay.com/");
		  	
	}
	


	@Test 
	public void clickSearchLens()
	{
		eb.clickSearchLens();
	}


	@Test (dependsOnMethods = "clickSearchLens" )
	public void checkSearchBoxIsPresent()
	{
		Assert.assertEquals(true, eb.checkSearchBox());
	}

	@Test (dataProvider = "dp")
   	
	  public void enterSearch(String s) {
		
		 eb.enterSearch(s);
		 Assert.assertEquals(true, eb.chkresults());
	}

	}	
