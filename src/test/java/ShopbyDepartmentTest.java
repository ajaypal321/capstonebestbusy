import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.ShopbyDepartment;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopbyDepartmentTest {
	private WebDriver driver;
	private ShopbyDepartment obj= new ShopbyDepartment(driver);
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
	public void AddProductbyDepartment() {
		obj= new ShopbyDepartment(driver);
		obj.MenuBtN();
		obj.AudioBtN();
		obj.Caraudio();
		obj.AllAudio();
		obj.StereoReceivers();
		obj.SonyAudio();
		obj.AddToCart();
		obj.GoToCart();
	}
	@Test
	public void checkout() {
		obj= new ShopbyDepartment(driver);
		obj.Email("ramji@123");
		obj.Password("Ramji@123");
		obj.SignIn();
		obj.CheckOut();
		obj.Firstname("Ram");
		obj.Lastname("ji");
		obj.Address("Mumbai");
		obj.City("Bomby");
		//obj.State();
		obj.Zipcode("400000");
		obj.Radiobtn();
		//obj.Applly();
	}
}
