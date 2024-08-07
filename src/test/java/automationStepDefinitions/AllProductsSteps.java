package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class AllProductsSteps {
	
	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public AllProductsSteps() {
        this.driver = LoginSteps.driver;
    }
	
	
	@When("user clicks product option")
	public void user_clicks_product_option() {
	    home = new HomePageFactory(driver);
	    home.clickProducts();
	}

	@And("verify all product page")
	public void verify_all_product_page() {
	    all = new AllProductsPageFactory(driver);
	    all.verifyAllProducts();
	}

	@And("verify list of products")
	public void verify_list_of_products() {
	    System.out.println("List of products are shown");
	}

	@And("click first product")
	public void click_first_product() {
	    all.clickViewProduct();
	}

	@Then("verify the product name category price availability brand and conditiona")
	public void verify_the_product_name_category_price_availability_brand_and_conditiona() {
	   
		all.getProductName();
		all.getProductCategory();
		all.getProductPrice();
		all.getProductAvailability();
		all.getProductCondition();
		all.getProductBrand();
	}


}
