package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");				
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Popular items this season']"));
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		//jsUtil.scrollIntoView(ele);
		
		//click -- UI -- click on middle of the ele
		//actions click -- move to element -- click on middle of the element
		//js click -- click from DOM
		
		WebElement registry = driver.findElement(By.linkText("Registry"));
		jsUtil.clickElementByJS(registry);
		
		
	}

}
