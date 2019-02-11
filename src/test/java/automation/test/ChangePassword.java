package automation.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import PageObjects.Edit_user_profile;
import PageObjects.Profile_top_icon;
import Resourses.Base;


public class ChangePassword extends Base {

	Profile_top_icon objIcon;
	
	@Test
	public void CheckChangePassword () throws InterruptedException {

		
		Profile_top_icon objIcon = PageFactory.initElements(driver, Profile_top_icon.class);
		
		Thread.sleep(1000);
		objIcon.openChangePassword(); 
	
	}

}

