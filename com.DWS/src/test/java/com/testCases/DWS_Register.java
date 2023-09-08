package com.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLib.Base_Class;

public class DWS_Register extends com.GenericLib.Base_Class{

	@Test
	public void register() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aman1");
		driver.findElement(By.id("LastName")).sendKeys("Singh");
		driver.findElement(By.id("Email")).sendKeys("Aman1Singh123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Aman@123");
		driver.findElement(By.id("register-button")).click();
		
	}
	
}
