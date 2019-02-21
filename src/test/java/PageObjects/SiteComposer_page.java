package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Resourses.Base;

public class SiteComposer_page extends Base {
	
	WebDriver driver;
	Properties dataFile;
	WebDriverWait wait;
	

	public SiteComposer_page (){
		
       this.driver = super.driver;
       this.dataFile = super.dataFile;
       this.wait = super.wait;

}

	
	@FindBy(id="item_4284") WebElement SideMenuSiteIcon ;
	@FindBy(xpath="//div[6]/div/div/i[@id='0_compose']") WebElement ComposeIcon ;
	@FindBy(xpath="	//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[1]/div/div[2]/div/div/div[1]/button\r\n") WebElement AddPageButton ;
	
	@FindBy(xpath="//*[@id='pageName']") WebElement PageName;
	@FindBy(xpath="//*[@id='pageTitle']") WebElement PageTitle;
	@FindBy(xpath="//*[@id='menuName']") WebElement MenuName;
	@FindBy(xpath="//div[4]/div/span[2]/div/input") WebElement CheckboxShowinMenu;
	
	@FindBy(xpath="//modal-container/div/div/app-admin-pge-settings/div[2]/page-settings/form/div[2]/button[1]") WebElement NextButton;
	@FindBy(xpath="//modal-container/div/div/app-admin-pge-settings/div[2]/page-configuration/div[2]/div/button[1]") WebElement FinishButton;
	
	@FindBy(xpath="//div[2]/page-settings/form/div[1]/perfect-scrollbar/div/div[1]/div[4]/div/span[1]/ui-switch") WebElement ToggleType;
	@FindBy(xpath="//*[@id='toast-container']/div/div") WebElement ConfirmMessage ;
	
	
	// working with multiple items inside a locator  
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[2]/div/div[1]/div")
	public WebElement SiteLayoutTab ;
	
	@FindBy(xpath="	//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[1]/div/div[1]/div/div/span")
	public WebElement SiteMapTab ;
	
	@FindAll(@FindBy (xpath="//*[@role='tabpanel']/div/div/ul/li"))
	public List<WebElement> SiteLayoutitems;
	
	@FindAll(@FindBy (xpath="//*[@class='dd-list first-node']/li/div/div"))
	public List<WebElement> SiteMapitems;
	
	
	
	public void openComposeSite() throws InterruptedException
	{
		SideMenuSiteIcon.click();
		Thread.sleep(1000);
		ComposeIcon.click();
	}
	
	public void openSiteLayoutMenu() throws InterruptedException
	{
		SiteLayoutTab.click();
		
	}
	
	public void openSiteMapMenu() throws InterruptedException
	{
		SiteMapTab.click();
		
	}
	
	
	
	public void AddNewPAge() throws InterruptedException
	{
		openComposeSite();
		
		AddPageButton.click();
		
		PageName.sendKeys( dataFile.getProperty("PageName") );
		PageTitle.sendKeys(dataFile.getProperty("PageTitle") );
		MenuName.sendKeys(dataFile.getProperty("MenuName") );
		
		ToggleType.click();
		//CheckboxShowinMenu.click();
		NextButton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(FinishButton));
		
		FinishButton.click();
		
	
	}
	
	public void AddNewExtraPAge() throws InterruptedException
	{
		
		AddPageButton.click();
		
		PageName.sendKeys( dataFile.getProperty("PageName") );
		PageTitle.sendKeys(dataFile.getProperty("PageTitle") );
		MenuName.sendKeys(dataFile.getProperty("MenuName") );
		
		ToggleType.click();
		//CheckboxShowinMenu.click();
		NextButton.click();
		
	
	}
	
	
	
	
	public boolean checkConfirmMsg()
	{
		return ConfirmMessage.isDisplayed();
	}
	
	public String checkMsgtext()
	{
		return ConfirmMessage.getText();
	}
	
	
	
	
	
}
