package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;
import pageFactory.ProductPageFactory;

public class ReviewProducts {

	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;
	ProductPageFactory product;

	public ReviewProducts() {
		this.driver = LoginSteps.driver;
	}

	@When("verify Write Your Review is visible")
	public void verify_write_your_review_is_visible() {
		product = new ProductPageFactory(driver);
		product.reviewHeading();

	}

	@And("enter name, email and review")
	public void enter_name_email_and_review() {
		product.enterReviewerEmail();
		product.enterReviewerName();
		product.enterReview();
	}

	@And("click Submit button")
	public void click_submit_button() {
		product.clickReviewerSubmit();
		}

	@Then("verify success message Thank you for your review")
	public void verify_success_message_thank_you_for_your_review() {
		product.getSuccessMsgTxt();
		System.out.println("review success text is printed above");
	}

}
