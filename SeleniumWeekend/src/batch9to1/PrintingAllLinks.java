package batch9to1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintingAllLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds) {
			if(!(id.equals(mainId))) {
				driver.switchTo().window(id);
				String title=driver.getTitle();
				if(title.contains("Facebook")) {
					System.out.println(title);
				}
				else {
					driver.close();
				}
			}
		}
		driver.switchTo().window(mainId);
		driver.close();
		
		
		
	}
}
