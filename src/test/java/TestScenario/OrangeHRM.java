package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {
	static WebDriver driver;
	  public OrangeHRM(WebDriver d){
		driver =d;
	}
	public  void username(String uname) {
		driver.findElement(By.name("username")).sendKeys(uname);
		}
	public void password(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
		}
	public  void login() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}






}

