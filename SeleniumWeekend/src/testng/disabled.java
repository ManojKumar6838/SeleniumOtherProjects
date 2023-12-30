package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class disabled {

	@Test
	public void disabled() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement disabled = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(disabled);
		jse.executeScript("arguments[0].value='Hello';", disabled);
		driver.quit();
		//1c62dbc823c9b613d0705c69fff2363b
		//e380fadaa536195183bc674f0652d13a
	}
}
