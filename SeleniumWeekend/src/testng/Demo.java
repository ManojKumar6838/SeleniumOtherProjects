package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test(enabled = false)
	public void register() {
		Reporter.log("Registered Successfully", true);
	}
	
	@Test(priority = 3)
	public void login() {
		Reporter.log("Logged in Successfully", true);
	}
	
	@Test(priority = 1)
	public void openBrowser() {
		Reporter.log("Browser opened Successfully", true);
	}
	
}
