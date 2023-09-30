import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.page.AccountCreate;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountTest {
	private WebDriver driver;
	private AccountCreate Accountobj= new AccountCreate(driver);

@ BeforeTest
public void beforetest() {
	System.setProperty("Webdriver-http-factory","jdk-http-client");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bestbuy.com/");
}
@Test
public void CreateAccountTest() throws InterruptedException {
	Accountobj= new AccountCreate(driver);
	Accountobj.ClickHome();
	Thread.sleep(8);
	Accountobj.ClickAccountbtn();
	Thread.sleep(5);
	Accountobj.ClickCreateAccountbtn();
	Thread.sleep(5);
	Accountobj.Firstname("Ram");
	Accountobj.Lastname("Ji");
	Accountobj.Email("ramji@gamil.com");
	Accountobj.Password("Ramji@123");
	Accountobj.ConfPassword("Ramji@123");
	
	Accountobj.MobileNumber("9988776655");
	//Accountobj.RecoveryBtn();
	//Accountobj.RecoverNumber("8855522444");
	Accountobj.Submitbtn();
	
	//Accountobj.SignwithGoogle();
}


}