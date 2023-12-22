package batch7to9;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriverScreenshot {

	public static void main(String[] args) throws Throwable   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trgt=new File("./Screenshots/Demo.jpg");
		FileHandler.copy(src, trgt);
		
				
		
		
		
		
		driver.quit();
		

	}

}
