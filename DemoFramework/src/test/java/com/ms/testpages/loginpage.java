package com.ms.testpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ms.startBrowser.SetupBrowser;

public class loginpage extends SetupBrowser {


	// TODO Auto-generated method stub

	By username = By.name("txtUsername");
	By password = By.name("txtPassword");
	By loginbutton = By.name("Submit");


	//Create a constructor

	public loginpage( WebDriver driver)
	{
		this.driver=driver;  

	}
	public void enterusername()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void enterpassword()
	{
		driver.findElement(password).sendKeys("admin123");
	}
	public void clickloginbutton()
	{
		driver.findElement(loginbutton).click();
	}

}



// what is use of this key word, what is constructor ??
