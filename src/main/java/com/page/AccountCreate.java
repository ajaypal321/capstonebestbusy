package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreate {
	private WebDriver driver;// driver
	public AccountCreate (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	// locating an object
	@FindBy(xpath="//img[@alt='United States']")
	WebElement home;
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement accountbtn ;

	//@FindBy(xpath="//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	@FindBy(xpath="//a[.='Create Account']")
	WebElement createaccountbtn ;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;

	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement confpassword;

	@FindBy(xpath="//input[@id='phone']")
	WebElement mobilenumber;

	
	
	@FindBy(xpath="//input[@name='recoveryPhone']")
	WebElement recoverynumber;
	
	@FindBy(xpath="//input[@id='is-recovery-phone']")
	WebElement recoverybtn;

	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbtn;

	@FindBy(xpath="//button[@data-track='Google - createAccount Button']")
	WebElement signwithgoogle;

	// method to perfome action
	public void ClickHome() {
		home.click();
	}
	public void ClickAccountbtn() {
		accountbtn.click();
	}
	public void ClickCreateAccountbtn() {
		createaccountbtn.click();
	}
	public void Firstname(String FName) {
		firstname.sendKeys(FName);
	}
	public void Lastname(String LName) {
		lastname.sendKeys(LName);
	}
	public void Email(String useremail) {
		email.sendKeys( useremail);
	}
	public void Password(String pwd) {
		password.sendKeys(pwd);
	}
	public void ConfPassword(String confpwd) {
		confpassword.sendKeys(confpwd);
	}
	public void MobileNumber(String Mnumber) {//Q here i am try to make integer but it showing error
		mobilenumber.sendKeys(Mnumber);
	}
	public void RecoveryBtn() {
		recoverybtn.click();
	}
	public void RecoverNumber(String Rnumber) {
		recoverynumber.sendKeys(Rnumber);
	}
	public void  Submitbtn() {
		 submitbtn.click();
	}
	public void SignwithGoogle() {
		signwithgoogle.click();
	}


}
