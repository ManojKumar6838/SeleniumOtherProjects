package batch4to6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("mul"));
		Select sel=new Select(dropdown);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("France");
		sel.selectByVisibleText("Canada");
		sel.selectByVisibleText("Japan");
		
//		List<WebElement> allSel = sel.getAllSelectedOptions();
//		
//		for(WebElement opt:allSel) {
//			System.out.println(opt.getText());
//		}

		
//		driver.quit();
		
	
	}
	
}
