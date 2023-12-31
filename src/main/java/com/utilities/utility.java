package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utility {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop=new Properties();
		String propath= System.getProperty("use.dir"+"\\src\\main\\java\\com\\resource\\DataProperties");
		FileInputStream fis= new FileInputStream(propath);
		prop.load(fis);
		
		String browsername= "chrome";
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();	
		}else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else if(browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			
			driver= new EdgeDriver();
		}else if (browsername.equals("Safari")) {
			WebDriverManager.safaridriver().setup();
			
			driver= new SafariDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
	public static void SwitchWindow() {
		String parentwindow=driver.getWindowHandle();
		Set<String>windowhandles=driver.getWindowHandles();
		windowhandles.size();
		for(String childwindow:windowhandles) {
			if(childwindow.contentEquals(parentwindow)) {
				driver.switchTo().window(childwindow);
				break;
			}
		}
	}
}
