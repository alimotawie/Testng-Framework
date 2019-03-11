package Resourses;
import org.testng.annotations.BeforeSuite;

import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Base extends AbstractTestNGCucumberTests {

	public static WebDriver driver= null;
	public static Properties dataFile= null;
	public static WebDriverWait wait= null;
	public static org.json.simple.JSONObject TestData = null;
	
	
	

	@BeforeSuite
	public void Intilize() throws IOException, ParseException{

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

		// read json file 

		String dataFilePath = System.getProperty("user.dir")+("\\testdata.json");
		FileReader JsonFile = new FileReader(dataFilePath);  

		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		//Read JSON file
		Object jsonObject = jsonParser.parse(JsonFile);
		
		 TestData = (org.json.simple.JSONObject) jsonObject;
		
		 
		

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


}
