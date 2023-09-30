package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopByBrand {
	private WebDriver driver;// driver
	public ShopByBrand (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	// locating an object
		@FindBy(xpath="//button[@aria-label='Menu']")
		WebElement menubtn ;
		@FindBy(xpath="//button[@data-id='node-86']")
		WebElement brandbtn;
		
		@FindBy(xpath="//a[@data-lid='ubr_shp_yardbird']")
		WebElement choosebrand;
		
		@FindBy(xpath="//a[@data-track='[context:widgetType=flex,linkContent=Eden,linkRegion=ImageNav2,linkPlacement=c1w1]']")
		WebElement chooseeden ;
		
		@FindBy(xpath="//button[@data-sku-id='6493950']")
		WebElement productaddtocart;
		
//		@FindBy(xpath="")
//		WebElement ;
		
		
		public void MenuBtN() {
			menubtn.click();
		}
		public void BrandBtn() {
			brandbtn.click();
		}
		public void ChooseBrand() {
			choosebrand.click();
		}
		public void ChooseEden() {
			chooseeden.click();
		}
		// in this site mostly show unavailable product or sold, so can't add to card
		public void DirectAddToCart() {
			productaddtocart.click();
		}
		
}
