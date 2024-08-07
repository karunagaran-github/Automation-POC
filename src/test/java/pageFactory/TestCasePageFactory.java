package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasePageFactory {
	
	WebDriver driver;

	@FindBy(xpath = "(//b[contains(text(),'Cases')])[1]")
	WebElement testCasePage;

	public void verifyTestCasePage() {
		if(testCasePage.isDisplayed()){
			System.out.println("Test case page is verified");
		}
	}
	
	public TestCasePageFactory (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
}
