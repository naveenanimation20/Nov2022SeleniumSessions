package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementConcept {

	public static void main(String[] args) {

		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"), '::before').getPropertyValue('content')

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";

		
		String mand_field = js.executeScript(script).toString();
		
		System.out.println(mand_field);
		
		if(mand_field.contains("*")) {
			System.out.println("this is a mandatory field");
		}
		
	}

}
