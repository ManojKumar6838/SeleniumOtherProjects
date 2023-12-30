package batch9to1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginButton = driver.findElement(By.partialLinkText("Log in"));
		System.out.println(loginButton);
		
		String text = loginButton.getText();
	
	}
}
