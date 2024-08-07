package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class SearchedProductsCart {

	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public SearchedProductsCart() {
        this.driver = LoginSteps.driver;
    }
	
	
	
	
	@When("add searched product to cart")
	public void add_searched_product_to_cart() {
	    all = new AllProductsPageFactory(driver);
	    home = new HomePageFactory(driver);

	    all.clickSearchedItem1();
	    all.clickContinueShopping();
	    all.clickSearchedItem2();
	    all.clickContinueShopping();
	    home.clickCartIcon();
	    
	}

	@And("click Cart button and verify that products are visible in cart")
	public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
		all.productNameList();
	}

	@And("click Signup \\/ Login button and submit login details")
	public void click_signup_login_button_and_submit_login_details() {
	    home = new HomePageFactory(driver);
	    home.clickSignup();
	    home.enterLoginEmail();
	    home.enterLoginPwd();
	    home.clickLoginSubmit();
	}

	@Then("go to Cart page")
	public void go_to_cart_page() {
	    home.clickCartIcon();
	}

	@And("verify that those products are visible in cart after login as well")
	public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
		all.productNameList();
	}

}
