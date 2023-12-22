package batch11to1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement dropdown = driver.findElement(By.name("country"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", dropdown);
		WebElement multipleDropdown = driver.findElement(By.name("Month"));
		Select sel=new Select(multipleDropdown);
		//System.out.println(sel.isMultiple());
		System.out.println(sel.isMultiple());
		
		sel.selectByVisibleText("May");
		sel.selectByVisibleText("June");
		sel.selectByVisibleText("July");
		Thread.sleep(2000);
		sel.deselectAll();
		
		
//		List<WebElement> allSelected = sel.getAllSelectedOptions();
//		for(WebElement selected:allSelected) {
//			System.out.println(selected.getText());
//		}
//		
//		Thread.sleep(1000);
//		sel.selectByIndex(4);
//		Thread.sleep(1000);
//		sel.selectByVisibleText("July");
//		Thread.sleep(1000);
//		WebElement firstSelected = sel.getFirstSelectedOption();
//		System.out.println(firstSelected.getText());
		Thread.sleep(2000);
		driver.quit();
	}
}
