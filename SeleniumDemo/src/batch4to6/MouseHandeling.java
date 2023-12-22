package batch4to6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick");
		Actions act=new Actions(driver);
		
		WebElement rightClick=driver.findElement(By.xpath("//p[contains(text(),'1. Are y')]/../button[1]"));
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
