package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import newbaseclass.BaseClass;

public class AddAddressTest extends BaseClass {

	@Test(groups = "Smoke")
	public void addAddressTest() {
		//CLick on icon
		////click on My Profile
		Reporter.log("Address Added Successfylly", true);
		
	}
}
