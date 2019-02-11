package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resourses.Base;


public class Profile_top_icon extends Base {

	public WebDriver driver;
	
	public Profile_top_icon (WebDriver driver){ 
		this.driver=driver; 
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@id='page-wrapper']/div[1]/div/div/nav/ul/li[2]/div") WebElement FaceIcon;
	@FindBy(xpath="//*[@id='page-wrapper']/div[1]/div/div/nav/ul/li[2]/ul/li[2]/a") WebElement profileItem;
	@FindBy(linkText="Edit Profile") WebElement profileEdit;
	@FindBy(xpath="//a[@class='btn btn-gray-light']") WebElement profileChangePassword;


	
	public void OpenEditProfile() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 9000);
		FaceIcon.click();
		
		Thread.sleep(1000);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(profileItem));
		
		profileItem.click();
		
		Thread.sleep(1000); 
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(profileEdit));
		profileEdit.click();
	}

	public void openChangePassword() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 9000);
		
		FaceIcon.click();
		
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(profileItem));
		
		profileItem.click();
		
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(profileChangePassword));
	
		profileChangePassword.click();
	}

}
