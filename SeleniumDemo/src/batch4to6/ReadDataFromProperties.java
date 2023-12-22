package batch4to6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./TestData/ShopperStack.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String un = pObj.getProperty("username");
		//System.out.println(browser);
		
	}
}
