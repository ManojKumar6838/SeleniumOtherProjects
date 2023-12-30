package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptt {

	public static void main(String[] args) throws Throwable {
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.abplive.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
	}
}
