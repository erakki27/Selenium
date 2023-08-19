package pom.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String BaseUrl = "https://demo.guru99.com/v4/";
	public String username = "mngr521523";
	public String password = "sEvYgYq";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
