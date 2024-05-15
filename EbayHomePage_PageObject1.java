package CPpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class EbayHomePage_PageObject1 {
	

	
	static WebDriver driver;
	boolean res;
	
	//Constructor
		public EbayHomePage_PageObject1(WebDriver driver)
		{
			this.driver=driver;
		}
	
	//Element References
	By menuSearchIcon = By.id("gh-btn");
	By searchBox = By.id("gh-ac");
	By checkResults = By.xpath("//*[contains(@class,\"count-heading\")]");
	
	//Methods
	
	//Method to click Search lens icon
	
	public void clickSearchLens()
	{
		driver.findElement(menuSearchIcon).click();
		
	}
		
	//Method to check AutoComplete Search Box is present
	
	public boolean checkSearchBox()
	
	{
		try
		{
		driver.findElement(searchBox);
		res = true;
		}
		catch(NoSuchElementException e)
		{
		res = false;
		}
		return res;
	}
	
   //Method to enter search keyword
	
	public void enterSearch(String s)
	{
		driver.findElement(searchBox).sendKeys(s + Keys.ENTER);
	}
	public boolean chkresults()
	{
		
	    	
	    	String howmanyequalto = driver.findElement(checkResults).getText();	
	    	System.out.println(howmanyequalto);
	    	if(howmanyequalto.startsWith("0"))
	    	{
		
		    res = false;
		    System.out.println("no results found");
	    }		
	
	    	else
	    {
	    	
	    	System.out.println("results found");
	     res = true;
	    }
		return res;
        
	}
		
	}    

	    	
	
	  
	

  
	
	






