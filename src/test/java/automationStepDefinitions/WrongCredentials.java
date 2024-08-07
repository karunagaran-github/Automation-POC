package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;

public class WrongCredentials {

	static WebDriver driver;
	HomePageFactory home;
	
	public WrongCredentials() {
        this.driver = LoginSteps.driver;
    }
	
	@When("enter wrong email address and password")
	public void enter_wrong_email_address_and_password() {
		home = new HomePageFactory(driver);
	    home.enterWrongLoginEmail();
	    home.enterWrongLoginPwd();
	}

	@Then("verify that error message is shown")
	public void verify_that_error_message_is_shown() {
	  home.loginFailmsg(); 
	}


}
