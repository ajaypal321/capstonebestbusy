import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.page.TitleVerification;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest {
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
	@Test
	public void urlll() {
		 String URL = driver.getCurrentUrl();
	        Assert.assertEquals(URL, "https://www.bestbuy.com/?intl=nosplash");
	        System.out.println("**************************");
	}
}
