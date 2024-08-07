package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageFactory {

	WebDriver driver;

	@FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
	WebElement getInTouch;
	
	@FindBy(name = "name")
	WebElement contactUsName;
	
	@FindBy(name = "email")
	WebElement contactUsEmail;
	
	@FindBy(name = "subject")
	WebElement contactUsSubject;
	
	@FindBy(id = "message")
	WebElement contactUsMessage;
	
	@FindBy(name="upload_file")
	WebElement uploadFile;
	
	String filePath= "C:\\Users\\DELL\\eclipse-workspace\\AutomationEx\\src\\test\\resources\\SampleFiles\\Screenshot AC.png";
	
	@FindBy(name = "submit")
	WebElement contactUsSubmit;
	
	@FindBy(xpath="//div[@class='status alert alert-success']")
	WebElement contactUsSuccessMsg;
	
	@FindBy(xpath="//span[contains(text(),' Home')]")
	WebElement contactUsHome;
	
	public void clickContactUsHome() {
		contactUsHome.click();
	}

	public void verifyContactUsSuccessMsg() {
		String Cmsg= contactUsSuccessMsg.getText();
		System.out.println(Cmsg);
	}
	
	public void contactUsSubmit() {
		contactUsSubmit.click();
	}

	
	public void fileUploading() {
		uploadFile.sendKeys(filePath);
	}
	
	
	public void enterContactUsMessage() {
		contactUsMessage.sendKeys("Requesting for service");
	}
	
	public void enterContactUsSubject() {
		contactUsSubject.sendKeys("Requesting for service");
	}
	
	public void enterContactUsEmail() {
		contactUsEmail.sendKeys("ashwinshre@gmail.com");
	}
	
	public void enterContactUsName() {
		contactUsName.sendKeys("Ashwin");
	}
	
	public void verifyGetInTouch() {
		if(getInTouch.isDisplayed()) {
			System.out.println("GetInTouch is displayed");
		}
	}

	
	
	
	
	
	
	
	public ContactUsPageFactory (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}	

}
