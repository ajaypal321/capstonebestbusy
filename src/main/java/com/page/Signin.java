package com.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	private WebDriver driver;// driver
	public Signin (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}


	// locating an object
	@FindBy(xpath="//img[@alt='United States']")
	WebElement home;
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement accountbtn ;
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	//@FindBy(xpath="//a[@data-lid='ubr_mby_signin_b']")
	WebElement signinbtn;
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement signinemail;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement signinpassword;
	
	@FindBy(xpath="//button[@data-track='Sign In']")
	WebElement signinsubmitbtn;
	@FindBy(xpath="//button[@data-track='Customer Data Confirmation Page - Skip']")
	WebElement skipbtn;
	
	@FindBy(xpath="//button[contains(.,'Continue Anyway')]")
	WebElement cont;
	
	
	// method to perfome action
		public void ClickHome() {
			home.click();
		}
		public void ClickAccountbtn() {
			accountbtn.click();
		}
		public void SigninBtN() {
			signinbtn.click();
		}
		public void SigninEmail(String signemail) {
			signinemail.sendKeys(signemail);
		}
		public void SigninPassword(String signpwd) {
			signinpassword.sendKeys(signpwd);
		}
		public void SigninSubmit() {
			signinsubmitbtn.click();
		}
		public void alert() {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			alert.accept();
		}
//		@FindBy(xpath="//button[@data-track='Customer Data Confirmation Page - Skip']")
//		WebElement skipbtn;
//		public void Skipbtn() {
//			skipbtn.click();
//		}
		public void SkipBtn() {
			skipbtn.click();
		}
		public void Conti() {
			cont.click();
		}
}
