package com.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLib.Base_Class;

public class SearchTest extends com.GenericLib.Base_Class {

	@Test
	public void search() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
