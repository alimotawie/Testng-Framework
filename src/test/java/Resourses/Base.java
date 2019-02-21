package Resourses;
import org.testng.annotations.BeforeSuite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	  
	  //properties file reader
	  BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+("\\data.properties")));
	  dataFile = (Properties) new Properties();
	  dataFile.load(reader);
  }
  
//take screenshot when test case fail and add it in the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) throws IOException 
	{
		    String path;
		    if (result.getStatus() == ITestResult.FAILURE)
			{
		    	System.out.println("Failed!");
				System.out.println("Taking Screenshot....");
				
				Path dest = Paths.get("./Screenshots",result.getName()+System.currentTimeMillis()+".png"); 
				try {
					Files.createDirectories(dest.getParent());
					FileOutputStream out = new FileOutputStream(dest.toString());
					out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
					out.close();
				} catch (IOException e) {
					System.out.println("Excpetion while taking screenshot"+ e.getMessage());
				}
		}
	}
	
// read json file 
	
	protected JSONObject getDataFile() {
	    String dataFilePath = System.getProperty("user.dir")+("\\data.properties");
	    JSONObject testObject = null; 

	    try {
	        FileReader reader = new FileReader(dataFilePath + "testdata.json");                        
	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
	        testObject = (JSONObject) jsonObject;
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return testObject;
	}
  

}
