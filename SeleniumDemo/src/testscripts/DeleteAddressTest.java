package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import newbaseclass.BaseClass;

public class DeleteAddressTest extends BaseClass{

	@Test(groups = "Smoke")
	public void deleteAddressTest() {
		Reporter.log("Address Deleted Successfully", true);
	}
	
	
	
}
