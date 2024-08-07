package automationStepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ContactUsPageFactory;
import pageFactory.HomePageFactory;

public class ContactUsForm {
	
	static WebDriver driver;
	HomePageFactory home;
	ContactUsPageFactory contact;
	
	public ContactUsForm() {
        this.driver = LoginSteps.driver;
    }
	
	@When("user click on Contact Us button")
	public void user_click_on_contact_us_button() {
	    home= new HomePageFactory(driver);
	    home.clickContactUs();
	}

	@And("user verify GET IN TOUCH is visible")
	public void user_verify_get_in_touch_is_visible() {
	    contact = new ContactUsPageFactory(driver);
	    contact.verifyGetInTouch();
	}

	@And("user enter name, email, subject and message")
	public void user_enter_name_email_subject_and_message() {
	   contact.enterContactUsName();
	   contact.enterContactUsEmail();
	   contact.enterContactUsSubject();
	   contact.enterContactUsMessage();
	}

	@And("user upload file")
	public void user_upload_file() throws InterruptedException {
	   contact.fileUploading();
	    Thread.sleep(5000);

	}

	@And("user click Submit button")
	public void user_click_submit_button() throws InterruptedException {
	    contact.contactUsSubmit();
	    Thread.sleep(3000);

	}

	@Then("user click OK button")
	public void user_click_ok_button() throws InterruptedException {
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(3000);
		
		alert.accept();  //clicking on ok button
	}

	@And("user verify success message Success! Your details have been submitted successfully. is visible")
	public void user_verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
	   contact.verifyContactUsSuccessMsg();
	}

	@And("user click Home button and verify that landed to home page successfully")
	public void user_click_home_button_and_verify_that_landed_to_home_page_successfully() {
	    contact.clickContactUsHome();
	    home.findHomePage();
	}


}
