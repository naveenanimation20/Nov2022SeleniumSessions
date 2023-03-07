package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitylWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		//global wait: 10 secs
		//it will be applied for all the element by default
		//FE -- imp wait will be applied automatically
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email11")).sendKeys("naveen@gmail.com");//10 - 5 = 5
		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");//10 - 2 = 8
		driver.findElement(By.xpath("//input[@value='Login']")).click();//10-6 = 4
		//e4 -- 10 
		//e5 -- 10 
		//e6 -- 10
		
		//home page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sel 4.x
		//global wait: 20 secs
		//e7 e8 e9 -- 20 secs
		
		//login page: 20 secs --> 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x

		//register: 5 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x

		//login:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x

		//forgotpwd: 0 secs -- nullify of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x

		
		//only for web element: svg, iframe, WEs
		//it does not support non web elements: title, url, alerts-js
		
		//cy/pw -- auto wait
		//cy vs selenium
		
		
	}

}
