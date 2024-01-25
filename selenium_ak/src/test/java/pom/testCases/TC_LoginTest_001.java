package pom.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(BaseUrl);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.loginClick();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			
		}else {
			Assert.assertTrue(false);
		}
	}

}
