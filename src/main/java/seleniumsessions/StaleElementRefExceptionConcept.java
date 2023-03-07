package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM v1 -- 100
	
		WebElement fn = driver.findElement(By.id("input-email"));//v1
		

		fn.sendKeys("naveen@gmail.com");//v1

		driver.navigate().refresh(); //DOM v2 -- 100/90
		
		fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("gurjeet@gmail.com");

	}
	
	//click, back, forward, refresh

}

