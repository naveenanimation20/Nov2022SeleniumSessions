package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {

		String browserName = "firefox";

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String title = brUtil.getPageTitle();
		System.out.println(title);

		// by locators: OR
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(firstName, "Amrita");
		eleUtil.doSendKeys(lastName, "Singh");
		eleUtil.doSendKeys(email, "Amrita@gmail.com");
		eleUtil.doSendKeys(telephone, "9876543456");
		eleUtil.doSendKeys(password, "Amrita@123");
		eleUtil.doSendKeys(confirmPassword, "Amrita@123");

	}

}
