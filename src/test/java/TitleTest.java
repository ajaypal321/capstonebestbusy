
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.TitleVerification;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TitleTest {
	private WebDriver driver;
	private TitleVerification Titleobj= new TitleVerification (driver);
	@ BeforeTest
	public void beforetest() {
		System.setProperty("Webdriver-http-factory","jdk-http-client");
		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.bestbuy.com/");
		driver.get("https://www.bestbuy.com/?intl=nosplash");

	}
	@Test(priority =  0)
	public void titlt() {
		String actual=driver.getTitle();
		String explected="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actual, explected);
		System.out.println(actual);}
	
//	@Test(priority =  0)
//	public void titlt() {
//		String actual=driver.getTitle();
//		String explected="Best Buy | Official Online Store | Shop Now & Save";
//		Assert.assertEquals(actual, explected);
//		System.out.println(actual);
//
//	}
	@Test(priority =  1)
	public void Menu() {
		Titleobj= new TitleVerification (driver);
		Titleobj.Menubt();
		String actual=driver.getTitle();
		String explected="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actual, explected);
		System.out.println(actual);
		//driver.navigate().back();
	}
	@Test (priority =  2)
	public void Schoolverification() {
		Titleobj= new TitleVerification (driver);
		Titleobj.School();
		String actual=driver.getTitle();
		String explected="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actual, explected);
		System.out.println(actual);
	}
	@Test (priority =  3)
	public void Topdealverification() {
		Titleobj= new TitleVerification (driver);
		Titleobj.TopDeal();
		String actual=driver.getTitle();
		String explected="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actual, explected);
		System.out.println(actual);
	}
	@Test (priority =4  )
	public void Memebershipverification() {
		Titleobj= new TitleVerification (driver);
		Titleobj.Membership();
		String actual=driver.getTitle();
		String explected="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actual, explected);
		System.out.println(actual);
	}
	@Test (priority =  3)
	public void Dealofdayverification() {
		Titleobj= new TitleVerification (driver);
		Titleobj.DealofDay();
		String actual=driver.getTitle();
		String explected="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actual, explected);
		System.out.println(actual);
	}
	@AfterTest
	public void end() {
		driver.close();
	}

}
