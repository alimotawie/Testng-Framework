package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

	//add Shortcuts
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[2]/div/div[1]/div/div/div") WebElement SiteLayoutMenu ;
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[2]/div/div[2]/div/div/ul/li[1]") WebElement headerItem ;
	@FindBy(xpath="//ul[@class='nav nav-tabs']/li[2]") WebElement HeaderConfigTab ;

	@FindBy(xpath="//div[@class='null-section-content']/button") WebElement FirstAddShortcut ;
	@FindBy(xpath="//div[@class='col-md-6 m-b-10']/button") WebElement AddShortcut ;

	//position open menu and selection 
	@FindBy(xpath="//table/tbody/tr/td[1]") WebElement positionMenu ;
	@FindBy(xpath="//div[@class='scrollable-content']/div[1]") WebElement VPositionSelection ;
	@FindBy(xpath="//div[@class='scrollable-content']/div[2]") WebElement HPositionSelection ;

	//Title Config open menu and selection 
	@FindBy(xpath="//table/tbody/tr/td[2]") WebElement TitleConfigMenu ;
	@FindAll(@FindBy(xpath="//div[@class='scrollable-content']/div")) List<WebElement> ConfigSelection  ;


	//Title icon  open menu and selection 
	@FindBy(xpath="//div[@class='row']/div/a[@class='text-center']") WebElement iconButton ;
	@FindBy(xpath="//modal-container/div/div/page-icon-list/div[2]/div/perfect-scrollbar/div/div[1]/div/ul/li[2]/a/span") WebElement iconSelection ;
	
	//Navigate to open menu and selection 
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/app-composer/div/div/app-page/div/app-page-content/div/app-gridster/gridster/gridster-item/app-widget/div/div/app-dynamic-component/site-header-layout-widget/form/div[1]/tabset/div/tab[2]/perfect-scrollbar/div/div[1]/div[5]/div[2]/div[2]/table/tbody/tr/td[4]/div/div[2]/div/a/i") WebElement navButton ;
	@FindBy(xpath="//modal-container/div/div/shortcut-type-modal/div[2]/div[2]/perfect-scrollbar/div/div[1]/div/div/div/tabset/div/tab/div/div/div/div/div[2]") WebElement navSelection ;
	@FindBy(xpath="//modal-container/div/div/shortcut-type-modal/div[3]/div/button[1]") WebElement navConfirm ;
	
	//save button 
	@FindBy(xpath="	//site-header-layout-widget/form/div[2]/div/div/button[1]") WebElement ShortCutSave ;
	
	@FindBy(xpath="//div[@class='overlay-container']/div/div/div") WebElement Notification;



	
	

	// working with multiple items inside a locator  
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[2]/div/div[1]/div")
	public WebElement SiteLayoutTab ;

	@FindBy(xpath="	//*[@id='page-wrapper']/div[2]/app-composer/div/app-composer-site-menu/div[2]/div/perfect-scrollbar/div/div[1]/accordion/accordion-group[1]/div/div[1]/div/div/span")
	public WebElement SiteMapTab ;

	@FindAll(@FindBy (xpath="//*[@role='tabpanel']/div/div/ul/li"))
	public List<WebElement> SiteLayoutitems;

	@FindAll(@FindBy (xpath="//*[@class='dd-list first-node']/li/div/div"))
	public List<WebElement> SiteMapitems;
	
	


	public void AddShortCut() throws InterruptedException, AWTException
	{
		openComposeSite();
		Thread.sleep(1000);
		SiteLayoutMenu.click();
		headerItem.click();
		HeaderConfigTab.click();

		Robot robot = null;
		robot = new Robot();
		robot.mouseMove(500, 550);
		robot.mouseWheel(1000);

		if(FirstAddShortcut.isDisplayed())
		{
			FirstAddShortcut.click();
		}else
		{
			AddShortcut.click();
		}

		positionMenu.click();
		HPositionSelection.click();
		TitleConfigMenu.click();
		ConfigSelection.get(1).click();

		iconButton.click();
		iconSelection.click();

		Thread.sleep(1000);
		navButton.click();
		
		navSelection.click();
		Thread.sleep(1000);
		navConfirm.click();
		Thread.sleep(1000);
		ShortCutSave.click();
		
		
		


	}


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

	public boolean checkShortCutConfirmMsg()
	{
		return Notification.isDisplayed();
	}

	public String checkMsgtext()
	{
		return ConfirmMessage.getText();
	}





}
