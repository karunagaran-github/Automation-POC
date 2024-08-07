package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageFactory.HomePageFactory;

public class LogoutSteps {
	
	static WebDriver driver;
	HomePageFactory home;
	
	public LogoutSteps() {
        this.driver = LoginSteps.driver;
    }
	
	@Then("user click Logout button")
	public void user_click_logout_button() {
	    home= new HomePageFactory(driver);
	    home.clickLogout();
	}


}
