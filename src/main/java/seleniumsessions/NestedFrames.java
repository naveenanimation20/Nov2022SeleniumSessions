package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("crush1");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("crush2");
		
		driver.switchTo().parentFrame();//valid
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("inp_val")).clear();
		driver.findElement(By.id("inp_val")).sendKeys("crush1-update");
		
		
		
		

		
	}

}
