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
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/form/div[5]/div/button[1]") WebElement SaveButton;

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div/div[1]/form/div[4]/div/button[1]/translate") WebElement SaveEditButton;

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[1]/div[1]/h2") WebElement GroupTitle; 

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div[1]/div/div/div/div[3]/a") WebElement GroupEditIcon;
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[2]/div/div[1]/div[2]/div/div/div[2]/button") WebElement GroupDelete;

	@FindBy(xpath="//div[10]/div/div/div[3]/div/button[1]") WebElement ConfirmDelete;

	@FindBy(xpath="//div[@class='pull-right']/button[1]") WebElement ConfirmDeleteMain;

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div[1]/div/div[2]/div") WebElement SelectGroup;

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[1]/div[2]/div/div/div[2]/button/translate") WebElement MainDelete;

	@FindBy(xpath="//div[9]/span[3]") WebElement ConfirmMessage;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div/div[1]/form/div[1]/div/span[2]/label[1]") WebElement ValidationMessage;
	
	
	@FindBy(xpath="//div[@class='onoffswitch']") WebElement ActiveTrigger;
	@FindBy(xpath="//span[@class='input-group-btn'][1]") WebElement Calender;

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/form/div[4]/div[1]/div/div[1]/span[2]/span/button/i") WebElement StartDateCalender;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/form/div[4]/div[1]/div/div[2]/span[2]/span") WebElement EndDateCalender;
	@FindBy(xpath="//table/tbody/tr[5]/td[4]") WebElement StartDate;
	@FindBy(xpath="//table/tbody/tr[6]/td[7]") WebElement EndDate;
	
	@FindBy(xpath="//div[4]/div[2]/textarea") WebElement deactivationDetails;
	
	@FindBy(xpath="//*[@id='side-menu']/li[1]/div[1]/span/span/img") WebElement HomeIcon;
	

	
public void triggerActive()
{
	ActiveTrigger.click();
	StartDateCalender.click();
	StartDate.click();
	EndDateCalender.click();
	EndDate.click();
	
	deactivationDetails.sendKeys("test test");
	SaveButton.click();
	
	
}

	public WebElement ConfirmMessage()
	{
		return ConfirmMessage;
	}

	public WebElement ErrorMessage()
	{
		return ValidationMessage;
	}



	public void GroupsPage() throws InterruptedException
	{
		Thread.sleep(4000);
		SideMenuGroupIcon.click();
	}


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
		
		triggerActive();
		
	}

	public WebElement groupTitle()
	{
		return GroupTitle;
	}

	public void checkMandatoryData()
	{
		GroupName.clear();
		GroupDescription.clear();
		SaveEditButton.click();
	}

	public void EditGroupIcon()
	{
		GroupEditIcon.click();
	}

	public void DeleteGroup()
	{
		GroupDelete.click();

	}

	public void ConfirmDelete()
	{
		ConfirmDelete.click();

	}

	public void MainConfirmDelete()
	{
		ConfirmDeleteMain.click();

	}

	public void itemDelete()
	{
		SelectGroup.click();

	}

	public void EditGroup(String groupName , String groupDescription )
	{
		GroupName.clear();
		GroupDescription.clear();
		GroupName.sendKeys(groupName);
		GroupDescription.sendKeys(groupDescription);
		SaveEditButton.click();
	}
	
	public void landingPage()
	{
		HomeIcon.click();

	}
	











}
