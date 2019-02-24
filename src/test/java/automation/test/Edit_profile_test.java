package automation.test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import PageObjects.Edit_user_profile;
import PageObjects.Profile_top_icon;
import Resourses.Base;

//	Edit_user_profile objEdit
//	Profile_top_icon objProfileIcon

public class Edit_profile_test extends Base {

	Profile_top_icon objIcon;
	Edit_user_profile objEdit;

	@Test
	public void CheckEditProfile () throws InterruptedException, AWTException {

		
		Profile_top_icon objIcon = PageFactory.initElements(driver, Profile_top_icon.class);
		Edit_user_profile objEdit = PageFactory.initElements(driver, Edit_user_profile.class);

		objIcon.OpenEditProfile();
		objEdit.ClearData();		
		objEdit.setData();
		objEdit.AddExtraEmail();
		objEdit.SelectImage();
		objEdit.SaveEdit();
		Assert.assertFalse(objEdit.Label().isDisplayed());
	}
	
//	@Test
//	public void CheckMandatory () throws InterruptedException {
//
//		
//		Profile_top_icon objIcon = PageFactory.initElements(driver, Profile_top_icon.class);
//		Edit_user_profile objEdit = PageFactory.initElements(driver, Edit_user_profile.class);
//
//		objIcon.OpenEditProfile();
//		
//		Thread.sleep(1000);
//		objEdit.ClearData();		
//		
//		objEdit.SaveEdit();
//		
//		
//		Assert.assertEquals(objEdit.Label().getText(), "Value is required");
//}
	
}

