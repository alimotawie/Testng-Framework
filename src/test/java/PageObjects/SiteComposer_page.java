package PageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resourses.Base;

public class SiteComposer_page extends Base {
	
	WebDriver driver;
	Properties dataFile;
	
	

	public SiteComposer_page (WebDriver driver){
		
//       this.driver=driver;   
//       PageFactory.initElements(driver, this);
//       
//       this.dataFile = (Properties) dataFile;
       
       this.driver = super.driver;
       this.dataFile = super.dataFile;

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
	
	
	
	public void openComposeSite() throws InterruptedException
	{
		SideMenuSiteIcon.click();
		Thread.sleep(1000);
		ComposeIcon.click();
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
		
		WebElement element = super.wait.until(ExpectedConditions.elementToBeClickable(FinishButton));
		
		FinishButton.click();
		
	
	}
	
//	public boolean checkConfirm()
//	{
//		return ConfirmMessage.isDisplayed();
//	}
//	
//	
	
	
	
}
