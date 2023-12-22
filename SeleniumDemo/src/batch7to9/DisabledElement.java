package batch7to9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement disabled = driver.findElement(By.xpath("//input[@class='form-control']"));
		//disabled.
		jse.executeScript("arguments[0].value='Hello';", disabled);
		Thread.sleep(4000);
		//driver.quit();
	}
}
