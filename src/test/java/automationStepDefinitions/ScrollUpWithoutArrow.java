package automationStepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;

public class ScrollUpWithoutArrow {
	static WebDriver driver;
	HomePageFactory home;
	
	public ScrollUpWithoutArrow() {
        this.driver = LoginSteps.driver;
    }
	
	@When("Scroll up page to top")
	public void scroll_up_page_to_top()  {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");


	}


}
