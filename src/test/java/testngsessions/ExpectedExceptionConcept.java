package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	@Test(expectedExceptions = NullPointerException.class)
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	

}
