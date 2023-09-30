package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLink {
	private WebDriver driver;// driver
	public  BrokenLink(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	

//		// locating an object
//		@FindBy(xpath="")
//		WebElement ;
}
