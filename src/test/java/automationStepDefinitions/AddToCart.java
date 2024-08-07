package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class AddToCart {
	
	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public AddToCart() {
        this.driver = LoginSteps.driver;
    }
	
	
	@When("user click Products button")
	public void user_click_products_button() {
	    home= new HomePageFactory(driver);
	    home.clickProducts();
	}

	@And("Hover over first product and click Add to cart")
	public void hover_over_first_product_and_click_add_to_cart() {
	    all= new AllProductsPageFactory(driver);
	    all.clickfirstAddtoCart();
	    
	}

	@And("click Continue Shopping button")
	public void click_continue_shopping_button() {
		all.clickContinueShopping();
	}

	@And("hover over second product and click Add to cart")
	public void hover_over_second_product_and_click_add_to_cart() {
		all= new AllProductsPageFactory(driver);
		all.clickSecondAddtoCart();
	}

	@And("click View Cart button")
	public void click_view_cart_button() {
	    all= new AllProductsPageFactory(driver);
	   all.clickViewCart();
	}

	@Then("verify both products are added to Cart")
	public void verify_both_products_are_added_to_cart() {
	    System.out.println("Products added to cart");
	}

	@And("verify their prices quantity and total price")
	public void verify_their_prices_quantity_and_total_price() {
	    all.priceList();
	    all.quantityList();
	    all.totalPticeList();
	}

}
