package batch7to9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textBox = driver.findElement(By.id("small-searchterms"));
		Point location = textBox.getLocation();
		int xAxis = location.getX();
		int yAxis=location.getY();
		System.out.println(xAxis);
		System.out.println(yAxis);
//		Thread.sleep(2000);
//		textBox.clear();
//		Thread.sleep(2000);
		driver.quit();
		
	}
}
