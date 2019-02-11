package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resourses.Base;

public class OrgAdmin_Groups extends Base {

	public WebDriver driver;
	public OrgAdmin_Groups (WebDriver driver){ 
		this.driver=driver; 
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="item_4280") WebElement SideMenuGroupIcon ;
	@FindBy(id="item_4308") WebElement SideMenuIcon;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/a") WebElement InitialAddButton;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[1]/div[2]/div/div/div[1]/button/translate") WebElement AddButton;
	
	@FindBy(xpath="//input[@name='usersGroupName']") WebElement GroupName;
	@FindBy(xpath="//textarea") WebElement GroupDescription;
	@FindBy(xpath="//button[1]") WebElement SaveButton;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[1]/div[1]/h2") WebElement GroupTitle; 
	
	
	public void AddGroup(String groupName , String groupDescription) throws InterruptedException
	{
		
		Thread.sleep(1000);
		SideMenuGroupIcon.click();
		
		if(InitialAddButton.isDisplayed())
		{
			InitialAddButton.click();
		}else
		{
			AddButton.click();
		}
		
		GroupName.sendKeys(groupName);
		
		GroupDescription.sendKeys(groupDescription);
	
		SaveButton.click();
		
//		driver.findElement(By.xpath("//div[@class='onoffswitch']")).click();		
		
	}
	
	public WebElement groupTitle()
	{
		return GroupTitle;
	}

	
	
	

	
	

	
	

}
