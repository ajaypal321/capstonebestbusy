package com.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitleVerification {
	private WebDriver driver;// driver
	public  TitleVerification(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	

		// locating an object
		@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
		WebElement menubtn ;
		
		@FindBy(xpath="//span[text()='Back to School']")
		WebElement backtoschool ;
		//@FindBy(xpath="//button[@data-id='node-31']")
		//WebElement deal;
		
		@FindBy(xpath="//a[text()='Top Deals']")
		WebElement topdeals ;
		
		@FindBy(xpath="//a[text()='Deal of the Day']")
		WebElement dealoftheday;
		
		@FindBy(xpath="//a[@data-lid='hdr_my_best_buy_memberships']")
		WebElement memeberships ;
		
		@FindBy(xpath="//a[@data-lid='hdr_crd']")
		WebElement creditcard ;
		
		@FindBy(xpath="//span[contains(.,'More')]")
		WebElement more;
		
		@FindBy(xpath="//span[contains(.,'Recently Viewed')]")
		WebElement recentlyviewed;
		
		@FindBy(xpath="//span[contains(.,'Order Status')]")
		WebElement orderstatus;
		
		@FindBy(xpath="//span[contains(.,'Saved Items')]")
		WebElement saveditems;
	
		
		// method to perfome 


				public void Menubt() {
				menubtn.click();
		
				}
				public void School() {
					 backtoschool.click();
				}
				public void TopDeal() {
					topdeals.click();
				}
				public void Membership() {
					memeberships.click();
				}
				public void DealofDay() {
					dealoftheday.click();
				}
				public void CreditCard() {
					creditcard.click();
				}
				public void More() {
				more.click();
				}
				public void RecentlyViewed() {
					recentlyviewed.click();
				}
				public void OrderStatus() {
					orderstatus.click();
				}
				public void saveditems() {
					saveditems.click();
				}
		
}

