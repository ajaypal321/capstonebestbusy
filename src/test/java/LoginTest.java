import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.page.AccountCreate;
import com.page.Signin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public class AccountTest {
		private WebDriver driver;
		private Signin Logobj= new Signin(driver);

		@ BeforeTest
		public void beforetest() {
			System.setProperty("Webdriver-http-factory","jdk-http-client");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.bestbuy.com/");
			//driver.switchTo().alert().accept();
		}
		@Test
		public void CreateAccountTest() throws InterruptedException {
			Logobj= new Signin(driver);
			Logobj.ClickHome();
			Thread.sleep(8);
			Logobj.ClickAccountbtn();
			Thread.sleep(5);
			Logobj.SigninBtN();
			Logobj.SigninEmail("Ramji@gmail.com");
			Logobj.SigninPassword("Ramji@123"); 
			Logobj.SigninSubmit();
			Thread.sleep(5);
			Logobj.alert();
			//driver.switchTo().alert().accept();
			Logobj.SkipBtn();
			Logobj.Conti();
			
		}


	}
}

