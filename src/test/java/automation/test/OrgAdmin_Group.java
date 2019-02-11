package automation.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resourses.Base;
import PageObjects.Login_page;
import PageObjects.OrgAdmin_Groups;


public class OrgAdmin_Group extends Base {


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
	
	@DataProvider(name = "TestData")
    public Object[][] dataProvider() {
        return new Object[][] { { "woow", "test group"  }, { "test or 1=1 --" ,"test' or 1=1 #" }};
    }


}
