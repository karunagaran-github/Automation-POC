package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CategoriesAndBrands;
import pageFactory.HomePageFactory;

public class CategoriesAndBrandSteps {

	static WebDriver driver;

	HomePageFactory home;
	CategoriesAndBrands categories;

	public CategoriesAndBrandSteps() {
        this.driver = LoginSteps.driver;
    }

	@When("user verify that categories are visible on left side bar")
	public void user_verify_that_categories_are_visible_on_left_side_bar() {
		categories= new CategoriesAndBrands(driver);
		categories.getCategoryTxt();	
	}

	@When("Click on Women category")
	public void click_on_women_category() {
		categories.clickWomen();
	}

	@When("Click on any category link under Women category, for example: Dress")
	public void click_on_any_category_link_under_women_category_for_example_dress() {
		categories.clickDress();
	}

	@When("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
	public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {
		categories.getWomensDressPageTitle();
	}

	@When("On left side bar, click on any sub-category link of Men category")
	public void on_left_side_bar_click_on_any_sub_category_link_of_men_category() {
		categories.clickmens();
		categories.clickTshirts();
	}

	@Then("Verify that user is navigated to that category page")
	public void verify_that_user_is_navigated_to_that_category_page() {
		categories.getmensDressPageTitle();
	}

}
