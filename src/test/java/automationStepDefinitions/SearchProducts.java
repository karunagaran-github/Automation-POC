package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class SearchProducts {

	
	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;
	
	public SearchProducts() {
        this.driver = LoginSteps.driver;
    }
	
	@When("enter product name in search input and click search button")
	public void enter_product_name_in_search_input_and_click_search_button() throws InterruptedException {
	    all = new AllProductsPageFactory(driver);
	    all.enterSearchProduct();
	    Thread.sleep(2000);
	    all.clickSearchBox();
	    Thread.sleep(2000);
	}

	@Then("verify SEARCHED PRODUCTS is visible")
	public void verify_searched_products_is_visible() {
	    all.verifySearchedProducts();
	}

	@And("verify all the products related to search are visible")
	public void verify_all_the_products_related_to_search_are_visible() {
	   System.out.println("All searched products are visible");
	   all.searchList();
	}

}
