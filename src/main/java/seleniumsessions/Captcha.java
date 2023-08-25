package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captcha {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("NaveenTTAuto");
		
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Naveen");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Naveen@gmail.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9898989898");
		driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.id("Form_getForm_action_submitForm")).click();
		
		

//		JavascriptExecutor js = (JavascriptExecutor)(driver);
//		js.executeScript("document.querySelector(\"#recaptcha-anchor > div.recaptcha-checkbox-border\").click()");

	}

}











//driver.get("https://www.google.com/recaptcha/api2/demo");

//driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("NaveenTAuto");
//
//driver.findElement(By.id("Form_getForm_Name")).sendKeys("Naveen");
//driver.findElement(By.id("Form_getForm_Email")).sendKeys("Naveen@gmail.com");
//driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9898989898");
//driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");

//driver.switchTo().defaultContent();
//Thread.sleep(5000);
//
//driver.findElement(By.id("Form_getForm_action_submitForm")).click();