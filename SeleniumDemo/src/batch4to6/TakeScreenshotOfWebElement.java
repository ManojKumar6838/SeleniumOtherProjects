package batch4to6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement dwsLogo = driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']"));
		File src=dwsLogo.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/DWSLogo.png");
		FileHandler.copy(src, path);
		driver.quit();
		
	}
}
