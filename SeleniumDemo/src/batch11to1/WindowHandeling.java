package batch11to1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		String mainPageHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			
			if(!(id.equals(mainPageHandle))) {
				driver.switchTo().window(id);
				String title=driver.getTitle();
				if(title.contains("YouTube")) {
					System.out.println(title);
				}
				else {
					driver.close();
				}
			}
			
		}
		driver.switchTo().window(mainPageHandle);
		driver.close();
		
		
		
	}
}
