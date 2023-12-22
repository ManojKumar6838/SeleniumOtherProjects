package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.id("hide-textbox")).click();
	WebElement hidden=driver.findElement(By.id("displayed-text"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].value='Hey';", hidden);
	driver.findElement(By.id("show-textbox")).click();
	
	
	Thread.sleep(5000);
	
	System.out.println(driver.getTitle());
	System.out.println(hidden.getAttribute("value"));
	
	driver.quit();
	
	
}
}
