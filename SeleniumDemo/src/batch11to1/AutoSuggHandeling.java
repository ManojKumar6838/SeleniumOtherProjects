package batch11to1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/datePick?sublist=0");
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).sendKeys("01/01/2023");
		
	}
	
	
}
