package automationStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;

public class LoginSteps {

	static WebDriver driver;
	HomePageFactory home;

	@Given("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		home = new HomePageFactory(driver);
		home.findHomePage();
	}

	@When("user click on Signup \\/ Login button")
	public void user_click_on_signup_login_button() {
		home.clickSignup();
	}

	@And("verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
		home.findLoginTitle();
	}

	@And("enter correct email address and password")
	public void enter_correct_email_address_and_password() {
		home.enterLoginEmail();
		home.enterLoginPwd();
	}

	@And("click login button")
	public void click_login_button() {
		home.clickLoginSubmit();
	}

	@Then("verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
		home.checkLoggerName();
	}

	@And("click Delete Account button")
	public void click_delete_account_button() {
		home.clickDelete();
	}

	@And("verify that ACCOUNT DELETED! is visible")
	public void verify_that_account_deleted_is_visible() {
		home.verifyDeletion();
	}

}
