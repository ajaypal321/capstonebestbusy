package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopbyDepartment {
	private WebDriver driver;// driver
	public ShopbyDepartment (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	// locating an object
	@FindBy(xpath="//button[@aria-label='Menu']")
	WebElement menubtn ;

	@FindBy(xpath="//button[@data-id='node-525']")
	WebElement audiobtn ;

	@FindBy(xpath="//button[@data-id='node-512']")
	WebElement caraudio  ;

	@FindBy(xpath="//a[@data-lid='ubr_au_car_all']")
	WebElement allaudio ;

	@FindBy(xpath="//a[@data-track='[context:widgetType=flex,linkContent=Car stereo receivers,linkRegion=Body,linkPlacement=c2w1]']")
	WebElement  stereoreceivers;

	@FindBy(xpath="//img[@alt='Sony - 6.2\" - Apple® CarPlay™ - Built-in Bluetooth - In-Dash Digital Media Receiver - Black - Front_Zoom']")
	WebElement sony;

	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
	WebElement addtocart ;

	@FindBy(xpath="//a[@data-track='Attach Modal: Go to cart']")
	//a[@data-track='Attach Modal: Go to cart']
	//class="c-button-link go-to-cart"
	WebElement gotocart;

	//Checkout***********************************************************************
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement email;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//button[@data-track='Sign In']")
	WebElement signin;

	@FindBy(xpath="//button[@data-track='Checkout - Top']")
	WebElement checkout;

	@FindBy(xpath="//button[@data-track='Checkout - Top']")
	WebElement firstname;

	@FindBy(xpath="(//input[@id='lastName'])[1]")
	WebElement lastname ;

	@FindBy(xpath="(//input[@name='street'])[1]")
	WebElement address;

	@FindBy(xpath="(//input[@id='city'])[1]")
	WebElement city;

	@FindBy(xpath="(//select[@id='state'])[1]")//******?
	WebElement state;

	@FindBy(xpath="(//input[@id='zipcode'])[1]")
	WebElement zipcode;

	@FindBy(xpath="(//input[@id='save-for-billing-address-Map {}'])[1]")
	WebElement radiobtn;

	@FindBy(xpath="(//button[@data-track='Shipping: Save shipping address'])[1]")
	WebElement applly;

	public void MenuBtN() {
		menubtn.click();
	}
	public void AudioBtN() {
		audiobtn.click();
	}
	public void Caraudio() {
		caraudio.click();
	}
	public void AllAudio() {
		allaudio.click();
	}
	public void StereoReceivers(){
		stereoreceivers.click();
	}
	public void SonyAudio() {
		sony.click();
	}
	public void AddToCart() {
		addtocart.click();
	}
	public void GoToCart() {
		driver.switchTo().frame(3);
		gotocart.click();
	}
	//checkout***************************************************
	public void Email(String emai) {
		email.sendKeys(emai);
	}
	public void Password(String pswd) {
		password.sendKeys(pswd);
	}
	public void SignIn() {
		signin.click();
	}

	public void CheckOut() {
		checkout.click();
	}
	public void Firstname(String name) {
		firstname.sendKeys(name);
	}
	public void Lastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void Address(String addr) {
		address.sendKeys(addr);
	}
	public void City(String cit) {
		city.sendKeys(cit);
	}
	public void State() {
		state.click();
	}
	public void Zipcode(String zip) {
		zipcode.sendKeys("zin");
	}
	public void Radiobtn() {
		radiobtn.click();
	}
	public void Applly() {
		applly.click();
	}
}
