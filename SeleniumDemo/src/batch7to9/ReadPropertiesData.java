package batch7to9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesData {

	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("./TestData/DemoWebShop.properties");
		Properties pObj=new Properties();
		pObj.load(file);
		String url = pObj.getProperty("url");
		String un=pObj.getProperty("uresrname");
		//driver.fi.sendKeys(un)
		System.out.println(url);

	}

}
