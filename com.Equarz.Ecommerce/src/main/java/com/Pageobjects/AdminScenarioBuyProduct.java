package com.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chromium.ChromiumDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Utils.Utils;
import com.base.Testbase;

public class AdminScenarioBuyProduct  extends Testbase{
	String ID ="";
	String status ="";
	Utils ul = new Utils();
	
	@FindBy(xpath = "//span[text()='Home & Kitchen']")
	WebElement HomeKitchen;
	@FindBy(xpath="//span[text()='Kitchen storage & Containers']")
	WebElement Kitchen;
	@FindBy(xpath="//a[text()='Water Bottles']")
	WebElement WaterBottles;
	@FindBy(xpath="//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64942a950a520.png']")
	WebElement product;
	@FindBy (xpath="//span[text()='Add to cart']")
	WebElement cart;
	@FindBy (xpath="//i[@class='navbar-tool-icon czi-cart']")
	WebElement cartarrow;
	@FindBy (xpath="//a[@href='http://e-quarz.com/checkout-details']")
	WebElement checkout;
	@FindBy(xpath="//select[@class='form-control']")
	WebElement shipping;
	@FindBy(xpath="//a[@class='btn btn--primary pull-right']")
	WebElement chectout2;
	@FindBy(id="same_as_shipping_address")
	WebElement sameaddress;
	@FindBy(xpath="//span[text()='Proceed payment']")
	WebElement payment;
	@FindBy(xpath="//img[@src='http://e-quarz.com/public/assets/front-end/img/cod.png']")
	WebElement COD;
	@FindBy (xpath="//a[@class='btn btn-secondary pull-right']")
	WebElement checkorder;
	@FindBy(xpath="//span[@class='d-block spandHeadO ']")
	WebElement orderid;
	@FindBy (xpath="//input[@placeholder='Search here ...']")
	WebElement SearchBox;
	@FindBy(xpath="//i[@class='czi-search text-white']")
	WebElement SearchButton;
	@FindBy (xpath="//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-6495732132c28.png']")
	WebElement Product1;
	@FindBy (xpath="//span[text()='Buy now']")
	WebElement BuynowButton;
	@FindBy(xpath="//input[@placeholder='email@address.com']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='8+ characters required']")
	WebElement password;
	@FindBy (xpath="//button[text()='Sign in']")
	WebElement Signin;
	@FindBy (xpath="//a[@title='Orders']")
	WebElement Orders;
	@FindBy (xpath="//a[@title='Pending']")
	WebElement Pending;
	@FindBy (id="datatableSearch_")
	WebElement pendingsearch;
	@FindBy (xpath="//button[text()='Search']")
	WebElement pendingsearchbutton;
	@FindBy (xpath="//select[@name='order_status']")
	WebElement orderstatus;
	@FindBy (xpath="//button[@class='swal2-confirm swal2-styled']")
	WebElement stautsconfirm_popup;
	
	public AdminScenarioBuyProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void AdminProduct() throws Throwable {
		Actions ac = new Actions(driver);
		ac.moveToElement(HomeKitchen).build().perform();	
		ac.moveToElement(Kitchen).build().perform();
		WaterBottles.click();
		product.click();
		cart.click();
		Thread.sleep(2000);
		ac.moveToElement(cartarrow).build().perform();
		checkout.click();
		Select sc = new Select(shipping);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		chectout2.click();
		sameaddress.click();
		payment.click();
		Thread.sleep(3000);
		COD.click();
		checkorder.click();
		String id = orderid.getText();
		//System.out.println(id);
		String[] idnum = id.split(" ");
		for(int i = 0; i < idnum.length;i++) {
			//System.out.println(idnum[1]);
			ID = idnum[1];
			
			}
		//System.out.println(ID);
		//Actions action = new Actions(driver);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://e-quarz.com/admin/auth/login");
		username.sendKeys(props.getProperty("adminusername"));
		password.sendKeys(props.getProperty("adminpassword"));	
		Thread.sleep(15000);
		Signin.click();
		Orders.click();
		Pending.click();
		pendingsearch.sendKeys(ID);
		pendingsearchbutton.click();
		String beforexpath ="//a[text()='";
		String afterxpath ="']";
		String orderidxpath = beforexpath + ID + afterxpath;
		driver.findElement(By.xpath(orderidxpath)).click();
		ul.dropdown(orderstatus, "confirmed");
		Thread.sleep(2000);
		stautsconfirm_popup.click();
		String window1 = driver.getWindowHandle();
		ul.Windowhandless(window1);
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
