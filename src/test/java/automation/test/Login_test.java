package automation.test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
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


public class Login_test extends Base {


	Login_page objLogin;
	
	@Test
	public void checkLogin() 
	{
		
		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
		
		//key of Testdata you want 
		JSONObject inputData = (JSONObject) TestData.get("login");
		
		//key of input you want
		String Username = (String) inputData.get("username");
		String Password =(String) inputData.get("password");

		objLogin.enterUserData(Username, Password);

		objLogin.clickLogin();

		String actualTitle =driver.getTitle();
		String Expected =(String) inputData.get("expected") ;
		String expectedTitle = Expected ;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
//	@Test
//	public void CheckLoginMandatory()
//	{
//		JSONObject inputData = (JSONObject) TestData.get("loginEmpty");
//		String Username = (String) inputData.get("username");
//		String Password =(String) inputData.get("password");
//
//		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
//		objLogin.enterUserData(Username, Password);
//		String expectedLabel=(String) inputData.get("expected") ;
//		objLogin.clickLogin();
//
//		Assert.assertEquals(objLogin.MandatroyLabel(),expectedLabel);	 
//	}

//	@Test
//	public void CheckLoginInvalidData()
//	{
//		JSONObject inputData = (JSONObject) TestData.get("loginInvalid");
//		String Username = (String) inputData.get("username");
//		String Password =(String) inputData.get("password");
//		
//		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
//		objLogin.enterUserData(Username, Password);
//		objLogin.clickLogin();
//		Assert.assertNotEquals(objLogin.MandatroyLabel(),(String) inputData.get("expected"));
//	}

//	@Test
//	public void CheckLoginSQLi()
//	{
//		JSONObject inputData = (JSONObject) TestData.get("loginSQLi");
//		
//		String Username = (String) inputData.get("username");
//		String Password =(String) inputData.get("password");
//		
//		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
//		objLogin.enterUserData(Username, Password);
//
//		objLogin.clickLogin();
//
//		Assert.assertNotEquals(objLogin.MandatroyLabel(),(String) inputData.get("expected"));	 
//	}

}
