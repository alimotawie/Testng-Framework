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

//	Edit_user_profile objEdit
//	Profile_top_icon objProfileIcon

public class Edit_profile_test extends Base {

	Profile_top_icon objIcon;
	Edit_user_profile objEdit;

	@Test
	public void CheckEditProfile () throws InterruptedException {

		
		Profile_top_icon objIcon = PageFactory.initElements(driver, Profile_top_icon.class);
		Edit_user_profile objEdit = PageFactory.initElements(driver, Edit_user_profile.class);

		objIcon.OpenEditProfile();
		objEdit.ClearData();		
		objEdit.setData();
		objEdit.AddExtraEmail();
		objEdit.SaveEdit();
		
		
		
	}

}

