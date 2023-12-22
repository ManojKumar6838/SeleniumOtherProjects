package batch7to9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act=new Actions(driver);
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobileAcc=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.clickAndHold(mobileCharger).moveToElement(mobileAcc).release().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
