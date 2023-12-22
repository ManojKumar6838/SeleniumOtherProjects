package batch4to6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import batch7to9.WebelementMethods;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		WebElement firstFrame=driver.findElement(By.name("iframe_a"));
		driver.switchTo().frame(firstFrame);
		
		WebElement freeMock = driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]"));
		System.out.println(freeMock.getText());
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//a[@href='https://selenium08.blogspot.com/']")).getText());
		driver.quit();
	}
}
