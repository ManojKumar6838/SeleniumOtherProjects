package batch7to9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/datePick/disabled?sublist=1");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Default Date picker ( Normal )']/../div[1]")).click();
		Thread.sleep(3000);
		
		boolean value=true;
		while(value) {
			String text=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
			if(text.contains("June 2023")) {
				driver.findElement(By.xpath("//div[text()='21']")).click();
				value=false;
			}
			else {
				driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']")).click();
			}
			
		}
		
		//driver.quit();
		
		
	}
}
