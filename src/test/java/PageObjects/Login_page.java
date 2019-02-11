package PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Resourses.Base;


public class Login_page extends Base {
	
	public WebDriver driver;
	public Login_page (WebDriver driver){ 
       this.driver=driver; 
       PageFactory.initElements(driver, this);
      
}
	
    
    @FindBy(how=How.NAME, using="username") public WebElement user_field;
    @FindBy(how=How.NAME, using="password") public WebElement password_field;
    
    @FindBy(xpath="//*[@id='page-wrapper']/div/div/div/div/ul/li/div/div/div/div/div/div/form/div[3]/button") WebElement login_button;
    @FindBy(xpath="//label//*[@class='ng-scope']") WebElement MandatoryLabel;
    @FindBy(xpath="//label//*[@class='ng-scope ng-binding']") WebElement InvalidLabel;
    
    
    
    public void enterUserData (String Username , String Password)
    {
    	user_field.sendKeys(Username);
    	password_field.sendKeys(Password);
    }
    
   
    public void clickLogin ()
    {
    	login_button.click();
    }
    
    public String MandatroyLabel ()
    {
    	String label = MandatoryLabel.getText();
		return label;
    }
    
    public String invalidLabel ()
    {
    	String label = InvalidLabel.getText();
		return label;
    }
    
}
