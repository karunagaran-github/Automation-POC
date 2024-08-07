package automationStepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageFactory.AllProductsPageFactory;
import pageFactory.CheckOutPageFactory;
import pageFactory.HomePageFactory;

public class DownloadInvoice {
	
static WebDriver driver;
	
	HomePageFactory home;
	AllProductsPageFactory all;
	CheckOutPageFactory checkout;
	
	public DownloadInvoice() {
        this.driver = LoginSteps.driver;
    }
	
	@Then("click Download Invoice button and verify invoice is downloaded successfully.")
	public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
	   checkout = new CheckOutPageFactory(driver);
	   checkout.clickDownload();
	}

	@And("click Continue button")
	public void click_continue_button() {
	    checkout.clickContinue3();
	}


}
