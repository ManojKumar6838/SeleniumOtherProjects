package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestonsHandeling {

	public static void main(String[] args) throws Throwable {
		//p[contains(@class,'AutoSuggeststyles__MainTxt-sc-1xb3zd-4 fvzcbc')]
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/cars/");
		Thread.sleep(2000);
		driver.findElement(By.id("downshift-1-input")).sendKeys("Vela");
		Thread.sleep(2000);
		List<WebElement> allSuggs = driver.findElements(By.xpath("//p[contains(@class,'AutoSuggeststyles__MainTxt-sc-1xb3zd-4 fvzcbc')]"));
		for(WebElement sugg:allSuggs) {
			String text=sugg.getText();
			if(text.contains("Chennai")) {
				sugg.click();
				break;
			}
		}
		System.out.println(driver.getTitle());
		System.out.println(" exceuted");
		driver.quit();
		
	}

}
