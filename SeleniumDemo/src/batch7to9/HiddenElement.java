package batch7to9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		jse.executeScript("arguments[0].scrollIntoView(true);", hideButton);
		
		hideButton.click();
		Thread.sleep(3000);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		jse.executeScript("arguments[0].value='Hello';", textBox);
		
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
