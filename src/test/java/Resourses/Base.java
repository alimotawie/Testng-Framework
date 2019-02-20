package Resourses;
import org.testng.annotations.BeforeSuite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Base {
	
 public static WebDriver driver= null;
 public static Properties dataFile= null;
 public static WebDriverWait wait= null;
 
  @BeforeSuite
  public void Intilize() throws IOException{
	  
	  //driver position 
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\chromedriver.exe"));
	  driver = (WebDriver) new ChromeDriver() ;
	  
	  this.wait = new WebDriverWait(driver, 1000);
	  
	  //Set URL
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://demo3:8080/IMOREGATEWAY/IMORECORE/mota/mota/admin/landing");
	  
	  //file reader
	
	  BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+("\\data.properties")));
	  dataFile = (Properties) new Properties();
	  dataFile.load(reader);
  }
  
//take screenshot when test case fail and add it in the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			TakeScreenShot.captureScreenshot(driver, result.getName());
		}
	}
  

}
