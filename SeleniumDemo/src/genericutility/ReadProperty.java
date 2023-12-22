package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperty {

	public String fetchProperty(String key) throws Throwable {
		FileInputStream path=new FileInputStream("./Data/shop.properties");
		Properties pObj=new Properties();
		pObj.load(path);
		String data = pObj.getProperty(key);
		return data;
	}
	
	
	
}
