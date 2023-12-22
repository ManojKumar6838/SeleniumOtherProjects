package batch4to6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		String homeHandle=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String handle:allHandles) {
			if(!(handle.equals(homeHandle))) {
				driver.switchTo().window(handle);
				String title=driver.getTitle();
				if(!(title.contains("Facebook"))) {
					driver.close();
				}
			}

		}
		
		driver.switchTo().window(homeHandle);
		driver.close();
		
		
		//driver.quit();
		
	}
}
