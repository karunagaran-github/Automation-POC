package automationStepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class ScrollUpArrow {
	
	static WebDriver driver;
	
	HomePageFactory home;
	
	public ScrollUpArrow() {
        this.driver = LoginSteps.driver;
    }
	
	@When("user Scroll down page to bottom")
	public void user_scroll_down_page_to_bottom() throws InterruptedException {
	    home = new HomePageFactory(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); 
        Thread.sleep(2000);    
	}

	@And("verify SUBSCRIPTION is visible")
	public void verify_subscription_is_visible() {
	    home.subscriptionTitle();
	}

	@And("click on arrow at bottom right side to move upward")
	public void click_on_arrow_at_bottom_right_side_to_move_upward() {
	    home.clickUparrow();
	}

	@Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
	public void verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
	    home.findAutomationExTitle();
	}


}
