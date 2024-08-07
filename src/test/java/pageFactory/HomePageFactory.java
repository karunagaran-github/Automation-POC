package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageFactory {
	WebDriver driver;
	
	@FindBy(xpath = "//i[@class='fa fa-angle-up']")
	WebElement upArrow;
	
	@FindBy (xpath="(//div[@class='col-sm-6']/h2)[1]")
	WebElement AutomationEx;
	
	@FindBy(xpath = "//a[contains(text(),' Cart')]")
	WebElement cartIcon;
	
	@FindBy(xpath = "//div[@class='alert-success alert']")
	WebElement subscriptionAlert;
	//div[@class='alert-success alert']
	@FindBy(xpath = "//button[@id='subscribe']")
	WebElement subscriptionEnter;

	@FindBy(xpath = "//input[@id='susbscribe_email']")
	WebElement subscriptionEmail;

	@FindBy(xpath = "//h2[contains(text(),'Subscription')]")
	WebElement subscription;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeIcon;

	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
	WebElement loginORsignupIcon;

	@FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
	WebElement newUserIcon;
	
	@FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
	WebElement loginTitle;
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement loginemail;
	
	@FindBy(xpath = "(//input[@name='password'])")
	WebElement loginpassword;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement loginSubmit;

	@FindBy(xpath="//a[contains(text(),' Logout')]")
	WebElement logoutButton;



	@FindBy(xpath = "//input[@data-qa='signup-name']")
	WebElement newUserName;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement newUserEmail;

	@FindBy(xpath = "//button[contains(text(),'Signup')]")
	WebElement signupButton;

	@FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
	WebElement enterDetails;

	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement gender;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pwdNewUser;

	@FindBy(xpath = "//select[@id='days']")
	WebElement days;

	@FindBy(xpath = "//select[@id='months']")
	WebElement months;

	@FindBy(xpath = "//select[@id='years']")
	WebElement years;

	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement newsLetter;

	@FindBy(xpath = "//input[@id='optin']")
	WebElement optionsCheckbox;

	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "last_name")
	WebElement lastName;

	@FindBy(id = "company")
	WebElement company;

	@FindBy(id = "address1")
	WebElement address;

	@FindBy(id = "address2")
	WebElement address2;

	@FindBy(xpath = "//select[@id='country']")
	WebElement country;

	@FindBy(xpath = "//input[@id='state']")
	WebElement state;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipCode;

	@FindBy(id = "mobile_number")
	WebElement mobileNumber;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement submitData;

	@FindBy(xpath = "//b[contains(text(),'Account Created!')]")
	WebElement accountCreated;

	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement continueButton;

	@FindBy(partialLinkText = "Logged in as")
	WebElement loggerName;

	@FindBy(xpath = "//a[contains(text(),'Delete Account')]")
	WebElement deleteAcc;

	@FindBy(tagName = "b")
	WebElement accountDeleted;
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement continueButton2;
	
	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	WebElement loginError;
	
	@FindBy(xpath = "//p[contains(text(),'Email Address already exist!')]")
	WebElement signupError;

	@FindBy(xpath = "//a[contains(text(),' Contact us')]")
	WebElement contactUs;
	
	@FindBy(xpath="(//button[contains(text(),'Test Cases')])[1]")
	WebElement testCases;
	
	@FindBy (xpath="(//a[contains(text(),'Product')])[1]")
	WebElement products;
	
	@FindBy (xpath="(//li[@class='address_address1 address_address2'])[2]")
	WebElement deliveryAddress;
	
	@FindBy (xpath="(//li[@class='address_address1 address_address2'])[5]")
	WebElement billingAddress;
	
	
	public void verifyBillingAddress() {
		String billingAdd= billingAddress.getText();
		
		if(billingAdd.equals(addressTxt)) {
			System.out.println(billingAdd);		
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public void verifyDeliveryAddress() {
		String deliveryAdd= deliveryAddress.getText();

		if(deliveryAdd.equals(addressTxt)) {
			System.out.println(deliveryAdd);}
		
			else {
				System.out.println("Fail");
			}
		
	}
	
	public void clickUparrow() {
		upArrow.click();
	}
	
	public void clickSubscriptionEnter() {
		subscriptionEnter.click();
	}
	
	
	public void verifySubscriptionAlert() {
		if(subscriptionAlert.isDisplayed()) {
			String salert= subscriptionAlert.getText();
			System.out.println(salert);
		}
	}
	public void subscriptionTitle() {
		if(subscription.isDisplayed()) {
			System.out.println("Subscription title is visible");
		}
	}
	
	public void enterSubscriptionEmail() {
		subscriptionEmail.sendKeys("ashwinshre@gmail.com");
	}
	public void clickProducts() {
		products.click();
	}
	
	public void clickTestCases() {
		testCases.click();
	}
	
	
	public void findHomePage() {
		if(homeIcon.isDisplayed()) {
			System.out.println("User is on the HomePage");
		}
	}
	
	public void clickSignup() {
		loginORsignupIcon.click();
	}
	
	public void findNewUserSignup() {
		newUserIcon.click();
	}
	
	public void findLoginTitle() {
		if(loginTitle.isDisplayed()) {
			System.out.println("User is on the loginpage");
		}
	}
	
	public void findAutomationExTitle() {
		if(AutomationEx.isDisplayed()) {
			String Ex= AutomationEx.getText();
			System.out.println(Ex);
		}
	}
	
	public void enterLoginEmail() {
		loginemail.sendKeys("ashwinshre@gmail.com");
	}
	
	public void enterWrongLoginEmail() {
		loginemail.sendKeys("Ashwinshre@gmail.com");
	}
	
	public void clickCartIcon() {
		cartIcon.click();
	}

	
	public void enterLoginPwd() {
		loginpassword.sendKeys("Ashwin@99");
	}
	
	public void enterWrongLoginPwd() {
		loginpassword.sendKeys("shwin@99");
	}
	
	public void clickLoginSubmit() {
		loginSubmit.click();
	}
	
	public void loginFailmsg() {
		if(loginError.isDisplayed()) {
			System.out.println("invalid email and password");
		}
	}
	
	public void signupFailmsg() {
		if(signupError.isDisplayed()) {
			System.out.println("Email alraedy registered");
		}
	}
	
	public void enterNewUserName() {
		newUserName.sendKeys("Ashwin");
	}
	
	public void enterNewUserEmail() {
		newUserEmail.sendKeys("ashwinshre@gmail.com");
	}
	
	public void enterExistingNewUserEmail() {
		newUserEmail.sendKeys("karunagaranelamgo@gmail.com");
	}
	
	public void clickSignupButton() {
		signupButton.click();
	}
	
	public void findEnterDetails() {
		if(enterDetails.isDisplayed()) {
			System.out.println("Account information title is visible");
		};
	}
	
	public void clickGender() {
		gender.click();
	}
	
	public void enterPwd() {
		pwdNewUser.sendKeys("Ashwin@99");
	}
	
	public void enterDOB() {
		Select day = new Select(days);
		day.selectByValue("1");
		
		Select month = new Select(months);
		month.selectByValue("1");
		
		Select year = new Select(years);
		year.selectByValue("1999");			
	}
	
	public void clickNewsLetter() {
		newsLetter.click();
	}
	
	public void clickCheckBox2() {
		optionsCheckbox.click();
	}
	
	public void enterFirstName() {
		firstName.sendKeys("Ashwin");
	}
	
	public void enterLastName() {
		lastName.sendKeys("Ashwin");
	}
	
	public void enterCompany() {
		company.sendKeys("Solytics");
	}
	
	String addressTxt = "No.25, EB road, vellore";
	public void enterAddress1() {
		address.sendKeys(addressTxt);
	}
	
	public void enterAddress2() {
		address2.sendKeys(addressTxt);
	}
	
	public void selectCountry() {
		Select Country = new Select(country);
		Country.selectByValue("India");			
	}
	
	public void enterState() {
		state.sendKeys("TamilNadu");
	}
	
	public void enterCity() {
		city.sendKeys("vellore");
	}
	
	public void enterZipcode() {
		zipCode.sendKeys("632311");
	}
	
	public void enterMobileNumber() {
		mobileNumber.sendKeys("6369993012");
	}
	
	public void clickSubmitData() {
		submitData.click();
	}
	public void verifyAccountCreated() {
		if(accountCreated.isDisplayed()) {
			System.out.println("Account created successfully");
		}
	}
	
	public void clickContinue1() {
		continueButton.click();
	}
	public void checkLoggerName() {
		if(loggerName.isDisplayed()) {
			String log= loggerName.getText();
			System.out.println(log);
		}
	}
	
	public void clickDelete() {
		deleteAcc.click();
	}
	
	public void verifyDeletion() {
		if(accountDeleted.isDisplayed()){
			System.out.println("Account deleted");
		}
	}
	
	public void clickContinue2() {
		continueButton2.click();
	}
	
	public void clickLogout() {
		logoutButton.click();
	}
	
	public void clickContactUs() {
		contactUs.click();
	}
	
	
	
	
	public HomePageFactory (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}	
	
	

	

	
	
	
	
}
