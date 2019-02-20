package automation.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resourses.Base;
import PageObjects.Login_page;
import PageObjects.OrgAdmin_Groups;


public class OrgAdmin_Group_Add extends Base {


	OrgAdmin_Groups objGroup;


	@Test(dataProvider="TestData")
	public void checkAddGroup(String groupName , String groupDescription) throws InterruptedException 
	{
		String Name = groupName;
		String Description = groupDescription;
		OrgAdmin_Groups objGroup = PageFactory.initElements(driver, OrgAdmin_Groups.class);
	
		objGroup.AddGroup(Name, Description);
		
		Thread.sleep(1000);
		String actual = objGroup.groupTitle().getText();
		String Expected = "User Groups" ; 
		Assert.assertEquals(actual, Expected);
		
	}
	
	@Test
	public void checkMandatory() throws InterruptedException 
	{
		String Name = "";
		String Description = "";
		OrgAdmin_Groups objGroup = PageFactory.initElements(driver, OrgAdmin_Groups.class);
	
		objGroup.AddGroup(Name, Description);
		
		Thread.sleep(1000);
		String actual = objGroup.groupTitle().getText();
		String Expected = "New Group" ; 
		Assert.assertEquals(actual, Expected);
		
	}
	
	
	@DataProvider(name = "TestData")
    public Object[][] dataProvider() {
        return new Object[][] { { "woow", "test group"  }, { "test or 1=1 --" ,"test' or 1=1 #" } };
    }


}
