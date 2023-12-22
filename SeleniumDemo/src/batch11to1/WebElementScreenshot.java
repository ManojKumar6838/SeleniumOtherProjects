package batch11to1;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		
		File path=new File("./Screenshots/Register.jpg");
		File src = registerLink.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, path);
		
		
	}
	
}
