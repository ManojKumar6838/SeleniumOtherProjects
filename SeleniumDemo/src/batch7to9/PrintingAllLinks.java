package batch7to9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/cars/");
		
		driver.findElement(By.id("downshift-1-input")).sendKeys("vela");
		Thread.sleep(2000);
		List<WebElement> allSuggs = driver.findElements(By.xpath("//p[contains(@class,'AutoSuggeststyles__MainTxt-sc-1xb3zd-4 fvzcbc')]"));
		
		System.out.println(allSuggs.size());
		for(WebElement sugg:allSuggs) {
			String text=sugg.getText();
			if(text.contains("Chennai")) {
				sugg.click();
				break;
			}
		}
		
		//driver.quit();
	
	}
}
