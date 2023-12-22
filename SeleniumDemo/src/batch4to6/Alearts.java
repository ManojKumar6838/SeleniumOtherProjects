package batch4to6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alearts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		By exple = By.xpath("//button[text()='Click for JS Prompt']");
		
		driver.findElement(exple).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("yes");
		Thread.sleep(5000);
		alt.accept();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
