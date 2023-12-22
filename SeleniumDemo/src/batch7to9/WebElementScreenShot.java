package batch7to9;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement img=driver.findElement(By.xpath("(//a[@class='nivo-imageLink'])[1]"));
		File src = img.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshots/img.jpg");
		FileHandler.copy(src, trg);
		
		driver.quit();
		

	}

}
