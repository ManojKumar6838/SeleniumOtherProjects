package batch11to1;

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
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQiA35urBhDCARIsAOU7Qwkd8m9ntw0xfaGElMWXMxNBE141atLpjb6K6REF3qP0SMeSRZSKp44aAvOoEALw_wcB&gclsrc=aw.ds");
		
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
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
