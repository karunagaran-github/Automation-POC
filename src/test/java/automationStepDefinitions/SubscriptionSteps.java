package automationStepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class SubscriptionSteps {
	static WebDriver driver;
	HomePageFactory home;
	
	public SubscriptionSteps() {
        this.driver = LoginSteps.driver;
    }
	
	
	@When("Scroll down to footer")
	public void scroll_down_to_footer() throws InterruptedException {
	    home = new HomePageFactory(driver);

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); 
        Thread.sleep(2000);
	}

	@And("Verify text SUBSCRIPTION")
	public void verify_text_subscription() {
	    home.subscriptionTitle();
	}

	@And("Enter email address in input and click arrow button")
	public void enter_email_address_in_input_and_click_arrow_button() throws InterruptedException {
		home.enterSubscriptionEmail();
		Thread.sleep(3000);
	    home.clickSubscriptionEnter();

	}

	@Then("Verify success message You have been successfully subscribed! is visible")
	public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
	    home.verifySubscriptionAlert();

	}


}
