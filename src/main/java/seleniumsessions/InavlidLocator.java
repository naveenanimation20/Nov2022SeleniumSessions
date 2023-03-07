package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InavlidLocator {

	public static void main(String[] args) {

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//driver.findElement(By.xpath("/////input[@@@id=@'name']")).sendKeys("testing");
		//InvalidSelectorException
		
		
		driver.findElement(By.xpath("//input[@id='namenaveen']")).sendKeys("testing");
		//NoSuchElementException
		
		//NoAlertException
		
		
		
		
		
		
	}

}
