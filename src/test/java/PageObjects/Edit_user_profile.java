package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
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
	
	
    public void SelectCountry(String Country) {

    	Select country = new Select( driver.findElement(By.name("Country")));
    	country.selectByVisibleText(Country);
	}
    
    public void SelectRegion(String Region) {

    	Select region = new Select( driver.findElement(By.name("Region")));
    	region.selectByVisibleText(Region);
	}
    
    public void SelectCity(String City) {

    	Select country = new Select( driver.findElement(By.name("City")));
    	country.selectByVisibleText(City);
	}
    
    public void Selectlang(String lang) {

    	Select country = new Select( driver.findElement(By.name("City")));
    	country.selectByVisibleText(lang);
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
    
    
public void setData() {
	
	String fName = "updated";
	String lName= "wooow";
	String fARName= "arabic";
	String lARName= "arabicc2";
	String email= "ali@ali22.com";
	String Phone= "0111111110";
	String landLine="3332452";
	String authType= "LDAP";
	String genderType= "Female";
	String lang= "Arabic";
	String type= "System Admin";
	String job = "Tester";
	String Nid="20120528";
	String Country ="EGYPT";
	String Region ="North";
	String City ="Cairo";
	String Street ="egpyt";
	String Zip = "11112";
	String Title = "Dr";

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





}
