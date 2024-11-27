package TestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class LoginPageBy {
		public WebDriver driver;
				public LoginPageBy(WebDriver driver)
				{
					this.driver=driver;
					PageFactory.initElements(driver,this);
					}
				@FindBy(name="username")
				WebElement uname;
				@FindBy(name="password")
				WebElement pwd;
				@FindBy(xpath="//button[text()=' Login ']")
				WebElement login;
				public void username (String user)
				{
					uname.sendKeys(user);
			}
				public void password (String pw)
				{
					pwd.sendKeys(pw);
			}
				public void clicklogin() {
					login.click();
				}

		


}


