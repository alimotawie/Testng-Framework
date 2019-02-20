package automation.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Login_page;
import PageObjects.Settings_page;
import Resourses.Base;

public class Settings_test extends Base{
	
	Settings_page objSettings ;
	
//	@Test
//	public void checkSettingsCanChange() throws InterruptedException 
//	{
//		Settings_page objSettings = PageFactory.initElements(driver, Settings_page.class);
//		
//		objSettings.ChangeSettings();
//		Thread.sleep(1000);
//		Assert.assertTrue(objSettings.checkConfirm());
//	}
//	
//	@Test
//	public void checkRestSettings() throws InterruptedException 
//	{
//		Settings_page objSettings = PageFactory.initElements(driver, Settings_page.class);
//		
//		objSettings.ChangeSettings();
//		objSettings.restSettings();
//	
//		Thread.sleep(1000);
//		Assert.assertTrue(objSettings.checkConfirm());
//
//	}
	
//	@Test
//	public void checkAddSkin() throws InterruptedException 
//	{
//		Settings_page objSettings = PageFactory.initElements(driver, Settings_page.class);
//		
//		objSettings.AddNewSkin();;
//	
//		Thread.sleep(1000);
//		Assert.assertTrue(objSettings.checkConfirm());
//
//	}
//	
//	@Test
//	public void CheckChangeLang() throws InterruptedException 
//	{
//		Settings_page objSettings = PageFactory.initElements(driver, Settings_page.class);
//		
//		objSettings.ChangeLang();
//	
//		Thread.sleep(1000);
//		Assert.assertTrue(objSettings.checkConfirm());
//
//	}
//	
	@Test
	public void CheckLangMandatory() throws InterruptedException 
	{
		Settings_page objSettings = PageFactory.initElements(driver, Settings_page.class);
		
		
		WebElement LangMandatoryLabel = objSettings.MandatoryLang();
	
		Thread.sleep(1000);
		Assert.assertTrue(LangMandatoryLabel.isDisplayed());

	}
}
