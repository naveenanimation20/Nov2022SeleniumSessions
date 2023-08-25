package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

	
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
