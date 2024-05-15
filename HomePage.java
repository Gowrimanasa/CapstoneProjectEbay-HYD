package CPpages;

import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

	boolean res;
	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	By SearchBox = By.id("gh-ac-box2");
	By SearchButton = By.id("gh-btn");
	
	public boolean checkSearchBoxIsPresent()
	{
		try {
			WebElement searchbox=driver.findElement(SearchBox);
			System.out.println(searchbox);
			res=true;
		}
		catch(NoSuchElementException e) {
			System.out.println("Search box not found");
			res=false;
		}
		return res;
		
	}
	
	public boolean checkSearchButtonIsPresent() {
		try {
			WebElement searchbox=driver.findElement(SearchButton);
			System.out.println(SearchButton);
			res=true;
		}
		catch(NoSuchElementException e) {
			System.out.println("Search button not found");
			res=false;
		}
		return res;
	}
		
}
	
			


			
		
	

			
		
		
		
		
	

		
		
	


