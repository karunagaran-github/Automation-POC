package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.TestCasePageFactory;

public class TestCaseSteps {
	
	static WebDriver driver;
	HomePageFactory home;
	TestCasePageFactory testcase;
	public TestCaseSteps() {
        this.driver = LoginSteps.driver;
    }
	
	@When("user clicks the Test case button")
	public void user_clicks_the_test_case_button() {
	    home= new HomePageFactory(driver);
	    home.clickTestCases();
	}

	@Then("verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {
	    testcase= new TestCasePageFactory(driver);
	    testcase.verifyTestCasePage();
	}

}
