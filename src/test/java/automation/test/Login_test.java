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


public class Login_test extends Base {


	Login_page objLogin;


	@Test
	public void checkLogin() 
	{
		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
		String Username = "Ali" ;
		String Password ="P@ssw0rd";

		objLogin.enterUserData(Username, Password);

		objLogin.clickLogin();

		String actualTitle =driver.getTitle();
		String Expected ="Organization Administration Site" ;
		String expectedTitle = Expected ;
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	/*
	@Test
	public void CheckLoginMandatory()
	{
		String Username = "";
		String Password ="";

		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
		objLogin.enterUserData(Username, Password);
		String expectedLabel="Missing mandatory fields";
		objLogin.clickLogin();

		Assert.assertEquals(objLogin.MandatroyLabel(),expectedLabel);	 
	}

	@Test
	public void CheckLoginInvalidData()
	{
		String Username = "alim222";
		String Password ="P@ssw0rd2222";

		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
		objLogin.enterUserData(Username, Password);
		objLogin.clickLogin();
		Assert.assertNotEquals(objLogin.MandatroyLabel(),"Invalid Username or Password");
	}

	@Test
	public void CheckLoginSQLi()
	{
		String Username = " abc' or 1=1 limit 1 #" ;
		String Password =" test' or 1=1 limit 1 --";
		Login_page objLogin = PageFactory.initElements(driver, Login_page.class);
		objLogin.enterUserData(Username, Password);

		String expectedLabel="Invalid Username or Password.";

		objLogin.clickLogin();

		Assert.assertNotEquals(objLogin.MandatroyLabel(),"Invalid Username or Password");	 
	}
*/
}
