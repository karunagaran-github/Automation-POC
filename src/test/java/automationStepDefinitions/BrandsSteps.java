package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CategoriesAndBrands;
import pageFactory.HomePageFactory;

public class BrandsSteps {

	static WebDriver driver;

	HomePageFactory home;
	CategoriesAndBrands categories;

	public BrandsSteps() {
        this.driver = LoginSteps.driver;
    }

	
	@When("verify that Brands are visible on left side bar")
	public void verify_that_brands_are_visible_on_left_side_bar() {
	    categories = new CategoriesAndBrands(driver);
	    categories.getBrandNames();    
	}

	@And("click on any brand name")
	public void click_on_any_brand_name() {
	   categories.clickPolo();
	}

	@Then("Verify that user is navigated to brand page and brand products are displayed")
	public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
	    categories.getBrandsPageTitle();
	}

	@And("On left side bar, click on any other brand link")
	public void on_left_side_bar_click_on_any_other_brand_link() {
	    categories.clickBiba();
	}

	@And("Verify that user is navigated to that brand page and can see products")
	public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
	    categories.getBrandsPageTitle();

	}

}
