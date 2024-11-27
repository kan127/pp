package TestScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;

public class Facebook {
WebDriver driver=null;
	@BeforeTest
	public void beforeTest()  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		}
	@Test
	public void login() {
		GoogleSearch page=new GoogleSearch(driver);
		page.search("facebook");
		}
	@Test(priority=1)
	public void login1() {
		GoogleSearch page=new GoogleSearch(driver);
		page.clickFacebook();
		}
	@AfterTest
	public void a() {
		System.out.println("close");
		
	}
}
