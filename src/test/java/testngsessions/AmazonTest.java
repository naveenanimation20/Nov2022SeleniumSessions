package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

	// Not valid format
//	@Test
//	public void amazonPageTest() {
//		System.out.println("checking title....");
//		String title = driver.getTitle();
//		System.out.println("page title:" + title);
//		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
//		
//		
//		
//		System.out.println("checking search....");
//		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		Assert.assertTrue(flag);
//		
//		
//		
//		System.out.println("checking help....");
//		boolean flag1 = driver.findElement(By.linkText("Help")).isDisplayed();
//		Assert.assertTrue(flag1);
//
//
//
//	}

	// tcs should be independent
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
