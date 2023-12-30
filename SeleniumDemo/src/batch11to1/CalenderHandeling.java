package batch11to1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/datePick/disabled?sublist=1");
		
		driver.findElement(By.xpath("(//*[name()='svg' and @stroke='currentColor'])[1]")).click();
		Thread.sleep(2000);
		boolean res=true;
		while (res) {
			String text=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
			if(text.contains("February 1998")) {
				driver.findElement(By.xpath("//div[text()='14']")).click();
				res=false;
			}
			else {
				driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
			}
		}
	}
}
