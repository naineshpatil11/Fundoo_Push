
/**
 * Description : HomePage.java init all webelements and Contains the Methods
 * Author      : Sheetal Chaudhari
 * Date        : 12/07/2019
 */

package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


@Test
public class HomePage 
{
	//plus-div
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-article/div/div[3]/div/mat-icon")
	private WebElement ClickAdd;
	
	@FindBy(xpath="//button[contains(text(),'ADD STORY')]")
	private WebElement AddSTORY;
	
	@FindBy(xpath="//*[@id=\"mat-input-79\"]")
	private WebElement ClickRedirectLink;
	
	//constructor
	public HomePage(WebDriver driver) 
	{   
		//Initialization
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void ClickAddbtn()
	{
		ClickAdd.click();
	}
	
	public void ClickAddStory() 
	{
		 AddSTORY.click();
	}
	
//	public void newtab(WebDriver driver) 
//	{
////		//open new tab using ctrl+ t
////		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
////		
////        //Switch between tabs using Ctrl + \t
////		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
//		
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	    
//	    driver.switchTo().window(tabs.get(1)); //switches to new tab
//	    driver.get("https://timesofindia.indiatimes.com/india");
//
//	    driver.switchTo().window(tabs.get(1)); // switch back to main screen        
//	    //driver.get("https://www.news.google.com");
//	}
	public void ClickRedirectLink()
	{
		ClickRedirectLink.sendKeys("https://indianexpress.com/article/sports/cricket/virat-kohli-team-india-new-coach-ravi-shastri-5835005/");
	}
	
}
