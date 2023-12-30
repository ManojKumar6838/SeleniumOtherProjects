package batch9to1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysKeyboard {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/datePick/disabled?sublist=1");
		driver.findElement(By.xpath("//*[name()='svg' and @stroke='currentColor']")).click();
		
		Thread.sleep(2000);
		
		boolean res=true;
		while(res) {
			String monthText=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
			if(monthText.contains("June 1996")) {
				driver.findElement(By.xpath("(//div[text()='3'])[1]")).click();
				res=false;
			}
			else
			{
				driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
			}
		}
		
		
		//driver.quit();
		
	}
}
