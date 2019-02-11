package Resourses;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Base {
	
 public static WebDriver driver= null;
 
  @BeforeSuite
  public void Intilize() throws IOException{
	  
	  //driver position 
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\chromedriver.exe"));
	  driver = (WebDriver) new ChromeDriver() ;
	  
	  //Set URL
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://demo3:8080/IMOREGATEWAY/IMORECORE/mota/mota/admin/landing");
	  
	  
	  
	  
  }
  

}
