import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
//import com.aventstack.extentreports.util.Assert;
import com.page.BottomLink;
import com.page.TitleVerification;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BottomLinkTest {
	private WebDriver driver;
	private BottomLink obj= new BottomLink(driver);
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
	public void link() {
		obj= new BottomLink(driver);
		obj.scoll();
		obj.TandC();
		String actual=driver.getTitle();
		String explected="BestBuy.com Terms and Conditions";
		Assert.assertEquals(actual,explected);
		System.out.println("Verification done"+actual);
	
}
}
