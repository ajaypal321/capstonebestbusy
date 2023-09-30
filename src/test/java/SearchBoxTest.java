import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.SearchBox;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchBoxTest {
	private WebDriver driver;
	private SearchBox obj= new SearchBox(driver);
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
	public void FindProduct() {
		obj= new SearchBox(driver);
		obj.Search("Phone");
		obj.SubmitSearch();

		obj.ChoosePhone();
		obj.AddtoCart();
	}

}
