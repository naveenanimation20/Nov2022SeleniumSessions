package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement fn = driver.findElement(By.id("input-firstname"));
		fn.sendKeys("naveenautomationlabs");
		
		String name = fn.getAttribute("value");
		System.out.println(name);
		
		
		WebElement ln = driver.findElement(By.id("input-lastname"));
		ln.sendKeys(null);//java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		
		
	}

}
