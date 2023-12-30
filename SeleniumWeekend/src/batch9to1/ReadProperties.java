package batch9to1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadProperties {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream path=new FileInputStream("./Data/shoperstack.properties");
		Properties pObj=new Properties();
		pObj.load(path);
		String url=pObj.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		WebElement login=driver.findElement(By.id("loginBtn"));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(login));
//		login.click();
		String un=pObj.getProperty("username");
		driver.findElement(By.id("Email")).sendKeys(un);
		String pwd=pObj.getProperty("passowrd");
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		//System.out.println(un);
	}
}
