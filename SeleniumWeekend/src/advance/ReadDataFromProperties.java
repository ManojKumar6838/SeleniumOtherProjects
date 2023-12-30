package advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromProperties {
	
	public static void main(String[] args) throws Throwable {
		//FileInputStream fis=new FileInputStream("E:\\Demo Folders\\demo.properties");
		Properties pObj=new Properties();
		pObj.load(new FileInputStream("E:\\Demo Folders\\demo.properties"));
		//pObj.load(fis);
		String name = pObj.getProperty("name");
		System.out.println(name);
		
	
	}

}
