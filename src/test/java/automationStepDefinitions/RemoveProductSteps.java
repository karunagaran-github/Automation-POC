package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class RemoveProductSteps {
	static WebDriver driver;
	
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public RemoveProductSteps() {
        this.driver = LoginSteps.driver;
    }
	
	
	
	@When("Click X button corresponding to particular product")
	public void click_x_button_corresponding_to_particular_product() {
	    all = new AllProductsPageFactory(driver);
	    all.clickRemoveItem();
	}

	@Then("Verify that product is removed from the cart")
	public void verify_that_product_is_removed_from_the_cart() {
	   all.productNameList();
	}

}
