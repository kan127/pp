package Objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestScenario.LoginPageBy;

public class HRM {
	public WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	LoginPageBy o1=new LoginPageBy(driver);
	
	}
	@Test
	void testlogin() {
		LoginPageBy  o1=new LoginPageBy(driver);
	o1.username("Admin");
	o1.password("admin123");
	o1.clicklogin();
	
	}
	@AfterClass
	void close() {
		driver.close();
	}




}



