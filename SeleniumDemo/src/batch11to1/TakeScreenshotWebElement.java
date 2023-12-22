package batch11to1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotWebElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement image=driver.findElement(By.xpath("(//a[@class='nivo-imageLink'])[1]"));
		
		
		File path=new File("./Screenshots/DWS.jpg");
		File ss =image.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, path);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
