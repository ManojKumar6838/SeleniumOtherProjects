package newbaseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import genericutility.ReadProperty;

public class BaseClass {

	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openBrowser(String browser) throws Throwable {
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
	//	driver=new ChromeDriver();
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
		String username=read.fetchProperty("username");
		driver.findElement(By.id("Email")).sendKeys(username);
		String password=read.fetchProperty("password");
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("Logged in Successfully", true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
		driver.findElement(By.xpath("//ul[@role='menu']/li[7]")).click();
		Reporter.log("Logged out Successfully", true);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser closed Successfully", true);
	}
	
}
