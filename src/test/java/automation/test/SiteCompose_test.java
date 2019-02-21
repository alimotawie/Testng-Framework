package automation.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SiteComposer_page;
import Resourses.Base;

public class SiteCompose_test extends Base {

	SiteComposer_page ObjComposers;	
	@Test(groups= {"UI_Test"})
	
	public void checkSiteLayoutCount() throws InterruptedException
	{
		
		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
		ObjComposers.openComposeSite();
		ObjComposers.SiteLayoutTab.click();
		int ActualNoItems=  ObjComposers.SiteLayoutitems.size();
		System.out.println(ActualNoItems);
		Assert.assertEquals(ActualNoItems, 4);
	}
	
	public void checkSiteMapCount() throws InterruptedException
	{
		
		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
		ObjComposers.openComposeSite();
		ObjComposers.SiteMapTab.click();
		int ActualNoItems=  ObjComposers.SiteMapitems.size();
		System.out.println(ActualNoItems);
		Assert.assertEquals(ActualNoItems, 4);
		
	}
	
	
	@Test(groups= {"UI_Test"})
	public void checkSiteLayoutitems() throws InterruptedException
	{
		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
	
		int ActualNoItems=  ObjComposers.SiteLayoutitems.size();
		String [] myMenu = {"Header","Footer","Skin","General Settings"};
		for (int i = 0 ; i < ActualNoItems ; i++ )
		{
			System.out.println("Actual " + ObjComposers.SiteLayoutitems.get(i).getText());
			System.out.println("Expected " + myMenu[i]);
			
			Assert.assertEquals(ObjComposers.SiteLayoutitems.get(i).getText(), myMenu[i]);
		}
		
	}
	
	@Test(groups= {"UI_Test"})
	public void checkSiteMapitems() throws InterruptedException
	{
		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
		
		ObjComposers.SiteMapTab.click();
	
		int ActualNoItems=  ObjComposers.SiteMapitems.size();
		
		//create page name
		String [] myPages = {"asdsad", "fdsfdsdfs" , "test" , "asddsad"};
		for (int i = 0 ; i < ActualNoItems ; i++ )
		{
			System.out.println("Actual " + ObjComposers.SiteMapitems.get(i).getText());
			System.out.println("Expected " + myPages[i]);
			
			Assert.assertEquals(ObjComposers.SiteMapitems.get(i).getText(), myPages[i] );
		}
		
	}

//	@Test (priority = 1)
//	public void checkAddPage() throws InterruptedException 
//	{
//		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
//	
//		ObjComposers.AddNewPAge();
//		Thread.sleep(1000);
//		Assert.assertTrue(ObjComposers.checkConfirmMsg());
//	}
//	
//	@Test (priority = 2)
//	public void checkAddExistingPage() throws InterruptedException 
//	{
//		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
//	
//		ObjComposers.AddNewExtraPAge();
//		Thread.sleep(1000);
//		Assert.assertTrue(ObjComposers.checkMsgtext().contains("Page URL already exists"));
//	}

}
