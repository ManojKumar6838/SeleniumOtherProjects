package batch4to6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad=1&gclid=CjwKCAiA3aeqBhBzEiwAxFiOBsTXrpU71mFE0eXvznWMspuxDZIuxpILQvgyMvA_YCZlMU3KbrXCgRoCZjEQAvD_BwE&gclsrc=aw.ds");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(5000);
		StringSelection path=new StringSelection("C:\\Users\\manug\\OneDrive\\Desktop\\Manoj Kumar Resume.docx");
		
		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path, null);
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
}
