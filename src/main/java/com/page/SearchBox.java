package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	private WebDriver driver;// driver
	public SearchBox (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	// locating an object
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement search ;
	@FindBy(xpath="//button[@title='submit search']")
	WebElement submitsearch;

	@FindBy(xpath="//img[@alt='Motorola - Moto G Power (2022) with 128GB (Unlocked) - Ice Blue - Front_Zoom']")
	WebElement choosephone;


	//@FindBy(xpath="//button[contains(.,'Add to Cart')]")
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addtocart;
	
	

	public void Search(String items) {
		search.clear();
		search.sendKeys(items);
		
	}
	public void SubmitSearch() {
		submitsearch.click();
	}
	
	public void ChoosePhone() {
		choosephone.click();
	
	}
	public void AddtoCart() {
		addtocart.click();
	}
}

