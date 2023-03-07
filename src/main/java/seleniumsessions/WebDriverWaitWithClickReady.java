package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithClickReady {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By freeTrial = By.cssSelector("a[title='Free Trial']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(freeTrial)).click();
		
		
		
		
	}

}
