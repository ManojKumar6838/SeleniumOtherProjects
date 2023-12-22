package batch4to6;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	//	driver.findElement(By.id("small-sehterms")).click();
//		WebElement login = driver.findElement(By.partialLinkText("Log in"));
//		SearchContext shadow = login.getShadowRoot();
		System.out.println("Executed");
		System.out.println(driver.getTitle());
		
		
		
		
		driver.quit();
	}
}
