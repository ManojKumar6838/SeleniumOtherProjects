package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import newbaseclass.BaseClass;

public class UpdateAddressTest extends BaseClass{

	@Test(groups = "Regression")
	public void updateAddressTest() {
		Reporter.log("Address Updated Successfully", true);
	}
}
