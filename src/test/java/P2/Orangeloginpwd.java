package P2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import P1.OrangeB;

public class Orangeloginpwd extends OrangeB {
	
	OrangeB ob= new OrangeB();
//	public Orangeloginpwd(WebDriver driver){
//		this.driver=driver;
//	}
	@Test(priority=1)
	public void login(String uname ,String pwd) {
		driver.findElement(By.name("username")).sendKeys(ob.username1());
		 driver.findElement(By.name("password")).sendKeys(ob.password1());
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Test(priority=2)
	public void logout() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
	driver.findElement(By.xpath("a[text()='Logout']"));
	}
	@Test(priority=3)
public void resetpassword(String uname) {
	driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
	driver.findElement(By.name("username")).sendKeys(ob.username1());
	WebElement e=driver.findElement(By.xpath("//button[text()=' Reset Password ']"));
			e.click();
			String expectedelement ="Reset Password link sent successfully";
			String actualelement=e.getText();
	Assert.assertEquals(actualelement, expectedelement);
}
}
