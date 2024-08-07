package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.CheckOutPageFactory;
import pageFactory.HomePageFactory;

public class PlaceOrderSteps {
	static WebDriver driver;
	
	HomePageFactory home;
	AllProductsPageFactory all;
	CheckOutPageFactory checkout;
	
	public PlaceOrderSteps() {
        this.driver = LoginSteps.driver;
    }
	
	@When("click Proceed To Checkout")
	public void click_proceed_to_checkout() {
	    all= new AllProductsPageFactory(driver);
	    all.clickCheckOut();
	}

	@And("click Register \\/ Login button")
	public void click_register_login_button() {
	    all.clickCartLogin();
	}

	@And("Fill all details in Signup and create account")
	public void fill_all_details_in_signup_and_create_account() {
	    home = new HomePageFactory(driver);
	    home.enterNewUserName();
	    home.enterNewUserEmail();
	    home.clickSignupButton();
	    home.findEnterDetails();
	    home.clickGender();
	    home.enterPwd();
	    home.enterDOB();
	    home.clickNewsLetter();
		home.clickCheckBox2();
		home.enterFirstName();
	    home.enterLastName();
	    home.enterCompany();
	    home.enterAddress1();
	    home.enterAddress2();
	    home.selectCountry();
	    home.enterState();
	    home.enterCity();
	    home.enterZipcode();
	    home.enterMobileNumber();
		home.clickSubmitData();

	}

	@And("verify ACCOUNT CREATED and click Continue button")
	public void verify_account_created_and_click_continue_button() {
	    home.verifyAccountCreated();
	    home.clickContinue1();
	}

	@And("verify Logged in as username at top")
	public void verify_logged_in_as_username_at_top() {
		home.checkLoggerName();

	}

	@And("click Cart button")
	public void click_cart_button() {
		home = new HomePageFactory(driver);
	    home.clickCartIcon();
	}

	@And("click Proceed To Checkout button")
	public void click_proceed_to_checkout_button() {
	    all.clickCheckOut();
	}

	@And("Address Details and Review Your Order")
	public void address_details_and_review_your_order() {
		checkout= new CheckOutPageFactory(driver);
		checkout.checkoutAddress();
		checkout.verifyOrderReview();   
	}

	@And("description in comment text area and click Place Order")
	public void description_in_comment_text_area_and_click_place_order() {
	    checkout.clickPlaceOrder();
	}

	@And("payment details: Name on Card Card Number CVC Expiration date")
	public void payment_details_name_on_card_card_number_cvc_expiration_date() {
	   checkout.enterNameOnCard(); 
	   checkout.enterCardNumber();
	   checkout.enterCvc();
	   checkout.enterEXPmonth();
	   checkout.enterExpYear();
	}

	@Then("Pay and Confirm Order button")
	public void pay_and_confirm_order_button() {
	    checkout.clickConformOrder();
	}

	@And("success message Your order has been placed successfully!")
	public void success_message_your_order_has_been_placed_successfully() {
	   checkout.verifyOrderSuccess();
	}

	@And("Verify ACCOUNT DELETED! and click Continue button")
	public void verify_account_deleted_and_click_continue_button() {
	    home.verifyDeletion();
	    home.clickContinue2();
	}

	

}
