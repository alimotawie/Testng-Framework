package automation.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SiteComposer_page;
import Resourses.Base;

public class SiteCompose_test extends Base {

	
	SiteComposer_page ObjComposers;

	@Test
	public void checkAddPage() throws InterruptedException 
	{
		SiteComposer_page ObjComposers = PageFactory.initElements(driver, SiteComposer_page.class);
	
		ObjComposers.AddNewPAge();
		Thread.sleep(1000);
//		Assert.assertTrue(ObjCompsers.checkConfirm());
	}

}
