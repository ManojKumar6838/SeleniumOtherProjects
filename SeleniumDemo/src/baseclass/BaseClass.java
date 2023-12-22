package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericutility.ReadProperty;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		ReadProperty read=new ReadProperty();
		String url=read.fetchProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("Navigated to Application Successfully", true);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws Throwable {
		ReadProperty read=new ReadProperty();
		String userName=read.fetchProperty("username");
		driver.findElement(By.id("Email")).sendKeys(userName);
		String password=read.fetchProperty("password");
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("Logged in SUccessfully", true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("Logged out Successfully", true);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		//driver.quit();
		Reporter.log("Browser Closed Successfully", true);
	}
}
