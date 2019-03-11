package steps;


import PageObjects.Login_page;
import Resourses.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class UserRegister extends Base {

	Login_page loginObj;

	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() throws Throwable {
	
		loginObj = new Login_page();
		
	}

	@When("^I click on register link$")
	public void i_click_on_register_link()  {
		loginObj.clickLogin();
	}

	/*@When("^I entered the user data$")
	public void i_entered_the_user_data()  {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("Moataz", "Nabil", "moataz@test.com", "12345678");
	}*/

	@When("^I entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) {
		loginObj.clickLogin();
	}

	@Then("^The registration page displayed successfully$")
	public void the_registration_page_displayed_successfully()  {
		
	}
}
