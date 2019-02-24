package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Resourses.Base;



public class Edit_user_profile extends Base  {
	
	WebDriver driver;
	public Edit_user_profile (WebDriver driver){ 
       this.driver=driver; 
       PageFactory.initElements(driver, this);
      
}
	
	@FindBy(name="firstName") WebElement firstName;
	@FindBy(name="lastName") WebElement lastName;;
	@FindBy(name="phone") WebElement phone;;
	@FindBy(name="firstARName") WebElement firstARName;;
	@FindBy(name="lastARName") WebElement lastARName;
	@FindBy(name="landlineNumber") WebElement landlineNumber;
	@FindBy(name="jobTilte") WebElement jobTilte;
	@FindBy(name="nationalId") WebElement nationalId;
	@FindBy(name="street") WebElement street;
	@FindBy(name="zipCode") WebElement zipCode;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[1]/div/div[7]/div/span/span/button") WebElement dateIcon;
	@FindBy(name="gender") WebElement gender;
	@FindBy(name="lang") WebElement lang;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[2]/div/div[2]/button") WebElement addEmailFirst;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[2]/div/div[2]/button") WebElement addEmailSecond;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[2]/div/div[2]/ng-form/div[1]/input") WebElement Email;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[2]/div/div[2]/ng-form/div[2]/button[1]") WebElement SaveEmail;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[2]/div/div[2]/div[3]/button") WebElement RemoveEmail ; 
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[5]/div/button[1]") WebElement SaveButton;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[5]/div/button[2]") WebElement CancelButton;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[1]/div/div[3]/div[2]/span[2]/label[1]") WebElement MandatoryLabel;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[1]/div/div[7]/div/span/span/button") WebElement CalenderIcon;
	@FindBy(xpath="//table/tbody/tr[1]/td[2]") WebElement Birthdate;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[2]/div/div") WebElement Emails;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div[1]/form/div[1]/div/div[1]/div[2]/div/div[1]/i") WebElement uploadImg;

	

	
    public void SelectCountry(String Country) {

    	Select country = new Select( driver.findElement(By.name("country")));
    	country.selectByVisibleText(Country);
	}
    
    public void SelectTitle(String Title) {

    	Select title = new Select( driver.findElement(By.name("title")));
    	title.selectByVisibleText(Title);
	}
    
    
    
    public void SelectBirthDate() throws InterruptedException {
    	
    	CalenderIcon.click();

    	Thread.sleep(1000);
    	Birthdate.click();
		
	}
    
    
    public void SelectRegion(String Region) {

    	Select region = new Select( driver.findElement(By.name("region")));
    	region.selectByVisibleText(Region);
	}
    
    public void SelectCity(String City) {

    	Select city = new Select( driver.findElement(By.name("city")));
    	city.selectByVisibleText(City);
	}
    
    public void Selectlang(String lang) {

    	Select Lang = new Select( driver.findElement(By.name("lang")));
    	Lang.selectByVisibleText(lang);
	}
    
    public void SelectGender(String Gender) {

    	Select gender = new Select( driver.findElement(By.name("gender")));
    	gender.selectByVisibleText(Gender);
	}
    
    public void ClearData() {
    	
    	firstName.clear();
		lastName.clear();
		phone.clear();
		firstARName.clear();
		lastARName.clear();
		landlineNumber.clear();
		jobTilte.clear();
		nationalId.clear();
		street.clear();
		zipCode.clear();
	}
    
    
public void setData() throws InterruptedException {
	
	String fName = "updated";
	String lName= "wooow";
	String fARName= "arabic";
	String lARName= "arabicc2";
	String email= "ali@ali22.com";
	String Phone= "0111111110";
	String landLine="3332452";
	String authType= "LDAP";
	String genderType= "Female";
	String lang= "English";
	String type= "System Admin";
	String job = "Tester";
	String Nid="20120528";
	String Country ="EGYPT";
	String Region ="North";
	String City ="Cairo";
	String Street ="egpyt";
	String Zip = "11112";
	String Title = "Dr";
	
	SelectCountry(Country);
	SelectRegion(Region);
	SelectCity(City);
	Selectlang(lang);
	SelectGender(genderType);
	SelectTitle(Title);
	SelectBirthDate();
	
	
	firstName.sendKeys(fName);
	lastName.sendKeys(lName);
	phone.sendKeys(Phone);
	firstARName.sendKeys(fARName);
	lastARName.sendKeys(lARName);
	landlineNumber.sendKeys(landLine);
	jobTilte.sendKeys(job);
	nationalId.sendKeys(Nid);
	street.sendKeys(Street);
	zipCode.sendKeys(Zip);
}

public void SaveEdit() {
	
	SaveButton.click();
}

public void CancelEdit() {
	
	CancelButton.click();
}

public void AddExtraEmail() {
	
		addEmailFirst.click();
		Email.sendKeys("test@test.com");
		SaveEmail.click();


}

public WebElement Label() {
	
	return MandatoryLabel;
}

//using robot class to upload image / files 
public void SelectImage() throws AWTException {
	
	uploadImg.click();
	String imgPath =  System.getProperty("user.dir")+("\\testimg.png");
	 StringSelection stringSelection = new StringSelection(imgPath);
     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
     clipboard.setContents(stringSelection, null);

     Robot robot = null;
     robot = new Robot();
   
     robot.delay(250);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.delay(150);
     robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}








}
