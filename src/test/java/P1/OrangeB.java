package P1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OrangeB {
	public WebDriver driver;
	Properties prop;
	
	@BeforeMethod
	public void setup() throws FileNotFoundException {
	readConfig();
	driver =new ChromeDriver();
	driver.get(prop.getProperty("url"));
	}
	public String username1() {
		prop.getProperty("username");
		return username1();
	}
	public String password1() {
	prop.getProperty("password");
		return password1();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	public void readConfig() throws FileNotFoundException {
		String projectPath=System.getProperty("user.dir");
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream(projectPath+"C:\\Automation\\eclipse-selenium\\POM\\properties\\pp.properties");
		try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}
