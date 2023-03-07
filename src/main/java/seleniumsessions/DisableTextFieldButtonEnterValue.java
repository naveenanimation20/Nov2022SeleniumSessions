package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldButtonEnterValue {

	public static void main(String[] args) throws InterruptedException {

		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//
//		WebElement pwd = driver.findElement(By.id("pass"));//this is disabled
//		pwd.sendKeys("test@123");
//		//ElementNotInteractableException: element not interactable
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		Thread.sleep(5000);
		
		WebElement submit_btn = driver.findElement(By.id("submitButton"));
		
		String disableText = submit_btn.getAttribute("disabled");
		System.out.println(disableText);
		
		submit_btn.click();//ElementClickInterceptedException
		
		
	}

}
