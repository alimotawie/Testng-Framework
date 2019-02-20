package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resourses.Base;

public class Settings_page extends Base {
	
	WebDriver driver;
	public Settings_page (WebDriver driver){ 
       this.driver=driver; 
       PageFactory.initElements(driver, this);
}
	
	
	@FindBy(id="item_4296") WebElement SideMenuSettingsIcon ;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/ul/li[3]/a") WebElement AuthTab;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/ul/li[2]/a") WebElement SkinTab;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[4]/div[1]/div/div[1]/form/div/div/div[1]/a") WebElement addSkinButton;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[4]/div[1]/div/div[1]/form/div/div/table/tbody/tr[4]/td[1]/input") WebElement SkinTitle;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[4]/div[1]/div/div[1]/form/div/div/table/tbody/tr[4]/td[3]/input") WebElement SkinBody;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[4]/div/button[1]") WebElement SaveSkin;
	@FindBy(xpath="//div[@ng-click='portalSettingsCtrl.uploadCSSFile(theme)']") WebElement uploadButton;

	
	
	@FindBy(xpath="//input[@name='blockUser']") WebElement blockUser;
	
	@FindBy(xpath="//input[@name='minimumLength']") WebElement minimumLength;
	@FindBy(xpath="//input[@name='acceptRepeated']") WebElement acceptRepeated;
	@FindBy(xpath="//input[@name='maximumLength']") WebElement maximumLength;
	
	@FindBy(xpath="//input[@name='expiredPeriod']") WebElement expiredPeriod;
	@FindBy(xpath="//input[@name='repeatedCharactersLength']") WebElement repeatedCharactersLength;
	@FindBy(xpath="//input[@name='sequenceLength']") WebElement sequenceLength;

	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/form/div[14]/div/button[2]") WebElement restButton;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/form/div[14]/div/button[1]") WebElement saveButton;
	@FindBy(xpath="//div[3]/span[3]") WebElement ConfirmMessage;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[1]/div/span[2]/label") WebElement LangMandatoryLabel;
	
	
	@FindBy(xpath="//input[@type='search']") WebElement SearchLang;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[2]/div/div/div[1]/span/span[2]/span") WebElement PriLangMenu;
	@FindBy(xpath="//*[@id='ui-select-choices-row-1-2']/span/div") WebElement SelectPriLang;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[3]/div/div/div[1]/span/span[2]/span") WebElement SecLangMenu;
	@FindBy(xpath="//*[@id='ui-select-choices-row-2-2']/span/div") WebElement SelectSecLang;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[1]/div/div/div[1]/span/span/span[1]") List<WebElement> LangBar;
	
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[4]/div/button[1]") WebElement SaveLang;
	

	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[1]/div/div/div[1]/span/span[1]/span/span[1]") WebElement RemoveLang;


		
	public boolean checkConfirm()
	{
		return ConfirmMessage.isDisplayed();
	}
	
	public void ChangeLang() throws InterruptedException
	{
		Thread.sleep(1000);
		SideMenuSettingsIcon.click();
		
		SearchLang.sendKeys("french"+Keys.ENTER);
		
		PriLangMenu.click();
		SelectPriLang.click();
		SecLangMenu.click();
		SelectSecLang.click();
	
		SaveLang.click();
		
	}
	
	public WebElement MandatoryLang() throws InterruptedException
	{
		
		Thread.sleep(1000);
		SideMenuSettingsIcon.click();
		int langbarSize= LangBar.size();
		
		for(int i=langbarSize ; i >=1 ;i--)
		{
			//remove language
			driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[1]/div/div/div[1]/span/span["+i+"]/span/span[1]")).click();		
		}

		//save 
		driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div/div[2]/div/ul/li/div/div/div/div/div/div/div/div[1]/div/div[1]/form/div[4]/div/button[1]")).click();
		return LangMandatoryLabel;
	}
		
	
	public void ChangeSettings() throws InterruptedException
	{
		Thread.sleep(1000);
		SideMenuSettingsIcon.click();
		AuthTab.click();
		
		ClearData();
	
		blockUser.sendKeys("10");
		minimumLength.sendKeys("10");
		acceptRepeated.sendKeys("10");
		maximumLength.sendKeys("12");
		expiredPeriod.sendKeys("30");
		repeatedCharactersLength.sendKeys("10");	
		sequenceLength.sendKeys("10");
		saveButton.click();
		
	}

	
	public void AddNewSkin() throws InterruptedException
	{
		Thread.sleep(1000);
		SideMenuSettingsIcon.click();
		SkinTab.click();
		Thread.sleep(1000);
		addSkinButton.click();
		SkinTitle.sendKeys("new skin 2019");
		SkinBody.sendKeys("black and white");
		uploadButton.click();	
		
		//uploadButton.sendKeys("C:/Users/amotawei/Downloads/dark-theme.css");
		
		SaveSkin.click();
		
	}
	
	public void ClearData()
	{
		blockUser.clear();
		minimumLength.clear();
		acceptRepeated.clear();
		sequenceLength.clear();
		repeatedCharactersLength.clear();
		expiredPeriod.clear();
		maximumLength.clear();
	}
	
	public void restSettings() {
		
		restButton.click();
	}
}
