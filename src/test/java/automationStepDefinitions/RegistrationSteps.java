package automationStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;

public class RegistrationSteps {
	public static WebDriver driver;
	HomePageFactory home;
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		home= new HomePageFactory(driver);
		home.findHomePage();		
	}

	@When("user click on Signup \\/ Login Button")
	public void user_click_on_signup_login_button() {
	   home.clickSignup();
	}

	@And("user verify New User Signup is visible")
	public void user_verify_new_user_signup_is_visible() {
	    home.findNewUserSignup();
	}

	@And("user enter name and email address")
	public void user_enter_name_and_email_address() throws InterruptedException {
	    home.enterNewUserName();
	    Thread.sleep(3000);
	    home.enterNewUserEmail();
	}

	@And("user click Signup Button")
	public void user_click_signup_button() throws InterruptedException {
		home.clickSignupButton();
	    Thread.sleep(3000);


	}

	@And("user verify that ENTER ACCOUNT INFORMATION is visible")
	public void user_verify_that_enter_account_information_is_visible() {
		home.findEnterDetails();
	   
	}

	@And("user fill Title Name Email Password Date of birth")
	public void user_fill_title_name_email_password_date_of_birth() {
	   home.clickGender();
	   home.enterPwd();
	   home.enterDOB();
	}

	@And("user select checkbox Sign up for our newsletter")
	public void user_select_checkbox_sign_up_for_our_newsletter() {
		home.clickNewsLetter();
		
	   
	}

	@And("user select checkbox Receive special offers from our partners")
	public void user_select_checkbox_receive_special_offers_from_our_partners() {
		home.clickCheckBox2();
	}

	@And("user fill First name Last name Company Address Address2 Country State City Zipcode  Mobile Number")
	public void user_fill_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
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
	}

	@And("user click Create Account button")
	public void user_click_create_account_button() throws InterruptedException {
	  home.clickSubmitData();
	  Thread.sleep(3000);

	}

	@Then("user Verify that ACCOUNT CREATED is visible")
	public void user_verify_that_account_created_is_visible() {
	   home.verifyAccountCreated();
	}

	@And("user click Continue Button")
	public void user_click_continue_button() {
	    home.clickContinue1();
	}

	@And("user Verify that Logged in as username is visible")
	public void user_verify_that_logged_in_as_username_is_visible() {
	   home.checkLoggerName();
	}

	@And("user vlick Delete Account Button")
	public void user_vlick_delete_account_button() {
	   //home.clickDelete();
	}

	@And("user verify that ACCOUNT DELETED is visible and click Continue Button")
	public void user_verify_that_account_deleted_is_visible_and_click_continue_button() {
	  // home.verifyDeletion();
	  // home.clickContinue2();
		
	}


}
