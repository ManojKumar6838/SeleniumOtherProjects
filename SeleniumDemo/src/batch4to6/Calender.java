package batch4to6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/datePick/disabled");
		
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		
		WebElement calenderIcon = driver.findElement(By.xpath("(//*[name()='svg' and @stroke='currentColor'])[1]"));
		
		calenderIcon.click();
		Thread.sleep(2000);
		WebElement previousMonth = driver.findElement(By.xpath("//button[@aria-label='Previous Month']"));
		WebElement monthText = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
		boolean res=true;
		
		
		while(res) {
		monthText=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
		previousMonth=driver.findElement(By.xpath("//button[@aria-label='Previous Month']"));
		String text=monthText.getText();
		System.out.println(text);
		if(text.contains("September 1998")) {
			driver.findElement(By.xpath("//div[text()='19']")).click();
			res=false;
		}
		else {
			previousMonth.click();
			//System.out.println("clicked");
		}
		}
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
