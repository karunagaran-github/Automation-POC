package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class CartQuantityCheck {
	
	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public CartQuantityCheck() {
        this.driver = LoginSteps.driver;
    }
	
	
	@When("user click View Product for any product on home page")
	public void user_click_view_product_for_any_product_on_home_page() {
	    all = new AllProductsPageFactory(driver);
	    all.clickViewProduct();
	}

	@And("verify product detail is opened")
	public void verify_product_detail_is_opened() {
	    System.out.println("user is on the view product page");
		
	}

	@And("increase quantity to {int}")
	public void increase_quantity_to(Integer int1) {
	    all.enterQuantity();
	}

	@And("click Add to cart button")
	public void click_add_to_cart_button() {
	    all.clickViewAddToCart();
	}
	
	@Then("verify that product is displayed in cart page with exact quantity")
	public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
	    all.quantityList();
	}



}
