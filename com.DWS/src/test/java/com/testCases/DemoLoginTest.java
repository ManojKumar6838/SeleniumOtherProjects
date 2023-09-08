package com.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLib.Base_Class;

public class DemoLoginTest extends com.GenericLib.Base_Class {
	@Test
	public void Login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manugowda123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	
	
}
