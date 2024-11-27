package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	public WebDriver driver;

	public  GoogleSearch(WebDriver driver) {
		this.driver=driver;
	}
	public void search(String name) {
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@name='btnK'][1]")).click();
		}
	public void clickFacebook() {
		driver.findElement(By.xpath("//a//h3[text()='Facebook - log in or sign up']")).click();
	}
}
