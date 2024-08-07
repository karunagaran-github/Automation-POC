package pageFactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageFactory {

	WebDriver driver;
	
	@FindBy (xpath="//ul[@class='nav nav-tabs']")
	WebElement reviewProduct;
	
	@FindBy (id="name")
	WebElement reviewerName;
	
	@FindBy (id="email")
	WebElement reviewerEmail;
	
	@FindBy (name="review")
	WebElement review;
	
	@FindBy (id="button-review")
	WebElement reviewSubmit;
	
	@FindBy (partialLinkText ="Thank you for your review")
	WebElement reviewSuccess;
	

	
	public void enterReview() {
		review.sendKeys("The qyality of the product is good");		
	}
	
	public void enterReviewerName() {
		reviewerName.sendKeys("Karunagaran");		
	}
	
	public void enterReviewerEmail() {
		reviewerEmail.sendKeys("ashwinshre@gmail.com");		
	}
	
	public void reviewHeading() {
		if(reviewProduct.isDisplayed()) {
			String reviewTXT= reviewProduct.getText();
			System.out.println(reviewTXT);
		}
	}
	
	public void clickReviewerSubmit() {
		reviewSubmit.click();	
			}
	public void getSuccessMsgTxt() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(reviewSuccess));
		String success= reviewSuccess.getText();
		System.out.println(success);

	}
		
	public  ProductPageFactory (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
}
