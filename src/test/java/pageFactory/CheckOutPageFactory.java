package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPageFactory {
	
	WebDriver driver;
	
	@FindBy (xpath="//a[contains(text(),'Download Invoice')]")
	WebElement downloadInvoice;
	
	@FindBy (name="expiry_month")
	WebElement expiryMonth;
	
	@FindBy (xpath="(//p)[1]")
	WebElement orderSuccess;
	
	@FindBy (id="submit")
	WebElement conformOrder;
	
	@FindBy (name="expiry_year")
	WebElement expiryYear;
	
	@FindBy (name="cvc")
	WebElement cvc;
	
	@FindBy (name="name_on_card")
	WebElement nameOnCard;
	
	@FindBy (name="card_number")
	WebElement cardNumber;
	
	@FindBy (xpath="//h2[contains(text(),'Address Details')]")
	WebElement verifyAddress;
	
	@FindBy (xpath="//h2[contains(text(),'Review Your Order')]")
	WebElement reviewOrder;
	
	@FindBy (xpath="//a[contains(text(),'Place Order')]")
	WebElement placeOrder;
	
	@FindBy (xpath="//a[contains(text(),'Continue')]")
	WebElement continue3;
	

	public void clickDownload() {
		downloadInvoice.click();
	}
	
	public void clickContinue3() {
		continue3.click();
	}
	
	public void enterCardNumber() {
		cardNumber.sendKeys("9876543212345678");
	}
	
	public void enterExpYear() {
		expiryYear.sendKeys("2028");
	}
	
	public void enterCvc() {
		cvc.sendKeys("667");
	}
	
	public void enterEXPmonth() {
		expiryMonth.sendKeys("12");
	}
	
	public void enterNameOnCard() {
		nameOnCard.sendKeys("Ashwin");
	}
	
	public void checkoutAddress() {
		if(verifyAddress.isDisplayed()) {
			System.out.println("Address verified");
		}
	}
	
	public void verifyOrderSuccess() {
		if(orderSuccess.isDisplayed()) {
			String orderSuccessMsg= orderSuccess.getText();
			System.out.println(orderSuccessMsg);
		}
	}
	
	public void verifyOrderReview() {
		if(reviewOrder.isDisplayed()) {
			System.out.println("Review order is verified");
		}
	}
	
	public void clickPlaceOrder() {
		placeOrder.click();
	}
	
	public void clickConformOrder() {
		conformOrder.click();
	}
	

	
	
	
	public CheckOutPageFactory (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}	

}
