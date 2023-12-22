package batch11to1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerButton = driver.findElement(By.xpath("//a[text()='Register']"));
		String text = registerButton.getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
