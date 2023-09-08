package com.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base_Class {
	public ChromeDriver driver;
	
	@BeforeClass
	public void browser_Setup() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void browser_Close() {
		driver.close();
		
	}
	
	
}
