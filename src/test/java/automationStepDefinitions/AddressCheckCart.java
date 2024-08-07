package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class AddressCheckCart {

	static WebDriver driver;
	
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public AddressCheckCart() {
        this.driver = LoginSteps.driver;
    }
	

@When("add products to cart")
public void add_products_to_cart() {
    all = new AllProductsPageFactory(driver);
    home =  new HomePageFactory(driver);
    home.clickProducts();
    all.clickfirstAddtoCart();
    all.clickContinueShopping();
}

@And("verify that cart page is displayed")
public void verify_that_cart_page_is_displayed() {
    all.productNameList();
}

@Then("verify that the delivery address is same address filled at the time registration of account")
public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() throws InterruptedException {
    Thread.sleep(3000);
	home.verifyDeliveryAddress();
}

@And("verify that the billing address is same address filled at the time registration of account")
public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() throws InterruptedException {
    Thread.sleep(3000);
	home.verifyBillingAddress();
}

}
