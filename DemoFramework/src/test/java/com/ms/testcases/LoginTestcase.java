package com.ms.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ms.startBrowser.SetupBrowser;
import com.ms.testpages.loginpage;

public class LoginTestcase extends SetupBrowser {

	
	public LoginTestcase() throws IOException {
		
		
	}

	@BeforeMethod
	
	public void startbr() throws InterruptedException
	{
		initialization();
	}
	
	@Test
	
	public void logininapplcation()
	{
		loginpage l = new loginpage(driver);
		l.enterusername();
		l.enterpassword();
		l.clickloginbutton();
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
