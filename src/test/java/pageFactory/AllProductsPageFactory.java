package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductsPageFactory {
	
	WebDriver driver;
	
	@FindBy (xpath="//div[@id='recommended-item-carousel']/div//div[@class='col-sm-4']")
	List<WebElement> recomendedItems;
	
	@FindBy (xpath="(//div[@id='recommended-item-carousel']/div/div//a[contains(text(),'Add to cart')])[1]")
	WebElement recomendedItem1;
	
	@FindBy (xpath="(//i[@class='fa fa-times'])[1]")
	WebElement removeItem;
	
	
	@FindBy (xpath="//a[contains(text(),'Proceed To Checkout')]")
	WebElement checkOut;
	
	@FindBy (xpath="//u[contains(text(),'Register / Login')]")
	WebElement cartLogin;

	
	@FindBy (xpath="//button[@type='button']")
	WebElement viewAddToCart;
	
	@FindBy (xpath="//input[@id='quantity']")
	WebElement viewCartQuantity;
	
	@FindBy (xpath="//u[contains(text(),'View Cart')]")
	WebElement viewCart;
	
	@FindBy (xpath="//a[@data-product-id='1']")
	WebElement firstAddtoCart;
	
	@FindBy (xpath="//a[@data-product-id='2']")
	WebElement secondAddtoCart;
	
	@FindBy (xpath="(//a[contains(text(),'Add to cart')])[1]")
	WebElement searchedItem1;
	
	@FindBy (xpath="(//a[contains(text(),'Add to cart')])[3]")
	WebElement searchedItem2;
	
	
	
	@FindBy (xpath="//button[contains(text(),'Continue Shopping')]")
	WebElement continueShopping;

	
	@FindBy (xpath="//h2[contains(text(),'All Products')]")
	WebElement allProducts;
	
	@FindBy (xpath="(//a[contains(text(),'View Product')])[1]")
	WebElement firstProduct;
	
	@FindBy (xpath="(//h2)[3]")
	WebElement firstProductName;
	
	@FindBy (xpath="//div[@class='product-information']//p[contains(text(),'Category')]")
	WebElement firstProductCategory;
	
	@FindBy (xpath="(//span)[13]")
	WebElement firstProductPrice;
	
	@FindBy (xpath="//p[contains(text(),' In Stock')]")
	WebElement firstProductAvailability;
	
	@FindBy (xpath="(//p)[5]")
	WebElement firstProductCondition;
	
	@FindBy (xpath="(//p)[6]")
	WebElement firstProductBrand;
	
	@FindBy (id="search_product")
	WebElement searchBox;
	
	@FindBy (xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchButton;
	
	@FindBy (xpath="//h2[@class='title text-center']")
	WebElement searchedProducts;
	
	@FindBy (css=".cart_description .product_name")
	WebElement availableItems;
	
	
	public void enterQuantity() {
		viewCartQuantity.click();
		viewCartQuantity.clear();
		viewCartQuantity.sendKeys("4");
	}
	public void clickViewCart() {
		viewCart.click();
	}
	
	public void clickfirstAddtoCart() {
		firstAddtoCart.click();
	}
	
	public void clickSecondAddtoCart() {
		secondAddtoCart.click();
	}
	
	public void clickContinueShopping() {
		continueShopping.click();
	}
	
	public void clickRemoveItem() {
		removeItem.click();
	}
	
	public void enterSearchProduct() {
		searchBox.sendKeys("jeans");
	}
	
	public void clickSearchBox() {
		searchButton.click();
	}
	
	public void clickSearchedItem1() {
		searchedItem1.click();
	}
	
	public void clickSearchedItem2() {
		searchedItem2.click();
	}
	
	
	
	public void clickViewAddToCart() {
		viewAddToCart.click();
	}

	public void verifySearchedProducts() {
		if(searchedProducts.isDisplayed()) {
			System.out.println("User is on the searched products page");
		}
	}
	public void verifyCheckOut() {
		if(checkOut.isDisplayed()) {
			System.out.println("User is on the cart page");
		}
	}
	
	public void clickCheckOut() {
		checkOut.click();
	}
	
	
	
	public void verifyAllProducts() {
		if(allProducts.isDisplayed()) {
			System.out.println("User is on the all products page");
		}
	}
	
	public void clickViewProduct() {
		firstProduct.click();
	}
	
	public void clickCartLogin() {
		cartLogin.click();
	}
	
	public void clickRecItem1() {
		recomendedItem1.click();
	}
	
	public void getProductName() {
		String Product_name=firstProductName.getText();
		System.out.println(Product_name);
	}
	
	public void getProductCategory() {
		String Product_category=firstProductCategory.getText();
		System.out.println(Product_category);
	}
	
	public void getProductPrice() {
		String Product_price=firstProductPrice.getText();
		System.out.println(Product_price);
	}
	
	public void getProductAvailability() {
		String Product_availability=firstProductAvailability.getText();
		System.out.println(Product_availability);
	}
	
	public void getProductCondition() {
		String Product_condition=firstProductCondition.getText();
		System.out.println(Product_condition);
	}
	
	public void getProductBrand() {
		String Product_brand=firstProductBrand.getText();
		System.out.println(Product_brand);
	}
	
	public void searchList() {
		List<WebElement> productNames = driver.findElements(By.cssSelector(".productinfo.text-center p"));
        
        // Extract and print the names of the products
        for (WebElement productName : productNames) {
            System.out.println(productName.getText());
        }
	}
	
	public void priceList() {
		List<WebElement> priceList = driver.findElements(By.xpath("//td[@class='cart_price']"));
		for(WebElement price: priceList) {
            System.out.println(price.getText());
		}
	}
	
	public void quantityList() {
		List<WebElement> quantityList = driver.findElements(By.xpath("//td[@class='cart_quantity']"));
		for(WebElement quantity: quantityList) {
            System.out.println(quantity.getText());
		}
	}
	public void totalPticeList() {
		List<WebElement> totalPriceList = driver.findElements(By.xpath("//td[@class='cart_total']"));
		for(WebElement totalPrice: totalPriceList) {
            System.out.println(totalPrice.getText());
		}
	}
	
	public void productNameList() {
		List<WebElement> productList = driver.findElements(By.xpath("//td/h4/a"));
		for(WebElement productName: productList) {
            System.out.println(productName.getText());
            System.out.println("Cart page is verified");
		}
	}
	
	public void recomendedItemList() {
		
		for(WebElement recomendedItemName: recomendedItems) {
            System.out.println(recomendedItemName.getText());
		}
	}
	
	
	

	
	public  AllProductsPageFactory (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
}
