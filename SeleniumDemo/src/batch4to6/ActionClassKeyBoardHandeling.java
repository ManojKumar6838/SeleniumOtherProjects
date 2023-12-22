package batch4to6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassKeyBoardHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		WebElement email = driver.findElement(By.id("Email"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(email, "manu123@gmail.com").perform();
		act.keyUp(Keys.CONTROL).sendKeys(email, "manu123@gmail.com").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		Thread.sleep(2000);
		act.keyUp(Keys.CONTROL).sendKeys("a").perform();
	}
	
}
