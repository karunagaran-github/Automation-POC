package automationStepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.AllProductsPageFactory;
import pageFactory.HomePageFactory;

public class RecommendedItems {

	static WebDriver driver;
	HomePageFactory home;
	AllProductsPageFactory all;

	public RecommendedItems() {
		this.driver = LoginSteps.driver;
	}

	@When("user scroll to bottom of page")
	public void user_scroll_to_bottom_of_page() throws InterruptedException {
		home = new HomePageFactory(driver);

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);

	}

	@And("verify RECOMMENDED ITEMS are visible")
	public void verify_recommended_items_are_visible() {
		all = new AllProductsPageFactory(driver);
		all.recomendedItemList();
	}

	@And("click on Add To Cart on Recommended product")
	public void click_on_add_to_cart_on_recommended_product() {
		all.clickRecItem1();
	}

	@And("click on View Cart button")
	public void click_on_view_cart_button() {
		all.clickViewCart();
	}

	@Then("Verify that product is displayed in cart page")
	public void verify_that_product_is_displayed_in_cart_page() {
		all.productNameList();
	}

}
