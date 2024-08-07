package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesAndBrands {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='brands-name']/ul/li")
	List<WebElement> brands;
	
	@FindBy(xpath = "//h4[@class='panel-title']")
	List<WebElement> category;
	
	@FindBy(xpath = "(//span[@class='badge pull-right'])[1]")
	WebElement womenCategory;
	
	@FindBy(xpath = "(//span[@class='badge pull-right'])[2]")
	WebElement mensCategory;
	
	@FindBy(xpath = "//h2[@class='title text-center']")
	WebElement brandsPage;
	
	
	@FindBy(xpath = "//h2[@class='title text-center']")
	WebElement dressPageWomens;
	
	@FindBy(xpath = "//h2[@class='title text-center']")
	WebElement dressPagemens;
	
	@FindBy(xpath = "(//a[contains(text(),'Dress')])[1]")
	WebElement dress;
	
	@FindBy(xpath = "//a[contains(text(),'Tshirts')]")
	WebElement tshirts;
	
	@FindBy(xpath="(//div[@class='brands-name']/ul/li)[1]")
	WebElement polo;
	
	@FindBy(xpath="(//div[@class='brands-name']/ul/li)[8]")
	WebElement biba;


	public void getCategoryTxt() {
		for (WebElement categoryName : category) {
			String categoryTitles = categoryName.getText();
			System.out.println(categoryTitles);
		}
	}
	
	public void getBrandNames() {
		for (WebElement brandNames : brands) {
			String Brands = brandNames.getText();
			System.out.println(Brands);
		}
	}
	
	public void clickPolo() {
		polo.click();
	}
	
	public void clickWomen() {
		womenCategory.click();
	}
	
	public void clickmens() {
		mensCategory.click();
	}
	
	public void clickDress() {
		dress.click();
	}
	
	public void clickTshirts() {
		tshirts.click();
	}
	
	public void clickBiba() {
		biba.click();
	}
	
	public void getWomensDressPageTitle() {
		if(dressPageWomens.isDisplayed()) {
		System.out.println(dressPageWomens.getText());
		}
	}
	
	public void getmensDressPageTitle() {
		if(dressPagemens.isDisplayed()) {
		System.out.println(dressPagemens.getText());
		}
	}
	
	public void getBrandsPageTitle() {
		if(brandsPage.isDisplayed()) {
		System.out.println(brandsPage.getText());
		}
	}

	public CategoriesAndBrands(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
