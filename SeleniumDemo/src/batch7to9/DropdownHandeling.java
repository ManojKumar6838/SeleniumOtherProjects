package batch7to9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandeling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/manug/OneDrive/Desktop/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropdown = driver.findElement(By.id("multiple_cars"));
		
		
		Select sel=new Select(dropdown);
		
		sel.selectByIndex(3);
		sel.selectByIndex(5);
		sel.selectByIndex(1);
		sel.selectByIndex(6);
		
		
		
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println("============");
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		for(WebElement selected:allSelected) {
			System.out.println(selected.getText());
		}
		
		
		
		driver.quit();
		
		
	}
}
