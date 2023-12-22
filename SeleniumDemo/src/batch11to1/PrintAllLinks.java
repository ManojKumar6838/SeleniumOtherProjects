package batch11to1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class PrintAllLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Options opt = driver.manage();
		Timeouts times = opt.timeouts();
		times.implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {
			//System.out.println(link.getAttribute("href"));
		}
		
		driver.quit();
		
		
	}
}
