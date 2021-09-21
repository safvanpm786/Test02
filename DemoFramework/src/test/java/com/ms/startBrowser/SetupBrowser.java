package com.ms.startBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupBrowser  {


	public static WebDriver driver;

	public static void initialization() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Sel\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}




}


