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


public class OrgAdmin_Group_Delete extends Base {


	OrgAdmin_Groups objGroup;


//	@Test
//	public void checkDeleteGroup() throws InterruptedException 
//	{
//		
//		OrgAdmin_Groups objGroup = PageFactory.initElements(driver, OrgAdmin_Groups.class);
//		
//		objGroup.GroupsPage();
//		
//		objGroup.EditGroupIcon();
//		
//		objGroup.DeleteGroup();
//		
//		Thread.sleep(1000);
//		objGroup.ConfirmDelete();
//	
//		Thread.sleep(1000);
//		String actual = objGroup.groupTitle().getText();
//		String Expected = "User Groups" ; 
//		Assert.assertEquals(actual, Expected);
//		
//	}
	
	
	@Test
	public void checkDeleteGroups() throws InterruptedException 
	{
		
		OrgAdmin_Groups objGroup = PageFactory.initElements(driver, OrgAdmin_Groups.class);
		
		objGroup.GroupsPage();
		
		objGroup.itemDelete();
		
		objGroup.DeleteGroup();
		
		Thread.sleep(1000);
		objGroup.MainConfirmDelete();
	
		Thread.sleep(1000);
		String actual = objGroup.groupTitle().getText();
		String Expected = "User Groups" ; 
		Assert.assertEquals(actual, Expected);
		
	}
	
	

}
