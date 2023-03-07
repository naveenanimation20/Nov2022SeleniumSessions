package testngsessions;

import org.testng.annotations.Test;

public class TestDependency {

	@Test
	public void searchTest() {
		System.out.println("searchTest");
		//int i = 9/0;
	}

	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("addToCart");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "addToCart")
	public void makePayment() {
		System.out.println("makePayment");

	}

}
