package batch9to1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement textBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		jse.executeScript("arguments[0].value='Hello';", textBox);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
