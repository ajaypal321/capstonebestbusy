package com.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BottomLink {
	private WebDriver driver;// driver
	public BottomLink(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
}
	
		// locating an object
		@FindBy(xpath="//a[@data-track='ft_legal_terms_conditions']")
		WebElement tandc ;
		public void scoll() {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", tandc);
		}
		public void TandC() {
		tandc.click();
//			
		}
		
	
	
}
