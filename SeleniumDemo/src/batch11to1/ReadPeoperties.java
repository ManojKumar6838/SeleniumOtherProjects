package batch11to1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPeoperties {

	public static void main(String[] args) throws Throwable {
		FileInputStream path=new FileInputStream("./Data/shopper.properties");
		Properties pObj=new Properties();
		pObj.load(path);
		String url=pObj.getProperty("url");
		System.out.println(url);
		String un = pObj.getProperty("username");
		System.out.println(un);
		String pwd=pObj.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
}
