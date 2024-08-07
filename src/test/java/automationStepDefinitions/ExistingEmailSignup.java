package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;

public class ExistingEmailSignup {
	
	static WebDriver driver;
	HomePageFactory home;
	
	public ExistingEmailSignup() {
        this.driver = RegistrationSteps.driver;
    }
	
	
	@When("user enter name and existing email address")
	public void user_enter_name_and_existing_email_address() {
	    home = new HomePageFactory(driver);
	    home.enterNewUserName();
	    home.enterExistingNewUserEmail();
	}

	@Then("user is able to see error message")
	public void user_is_able_to_see_error_message() {
	   home.signupFailmsg(); 
	}


}
