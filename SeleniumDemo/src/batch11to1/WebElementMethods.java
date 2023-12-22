package batch11to1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).submit();
		
		Thread.sleep(5000);
				
		
		driver.quit();
		
		
		
	}
}
