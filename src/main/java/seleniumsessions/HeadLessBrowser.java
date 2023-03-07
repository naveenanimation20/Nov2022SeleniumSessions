package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		
		//browser is not visible
		//headless - testing is happening behind the scene
		//faster than the normal mode
		
		//sanity test cases
		//for the complex html dom - it might not work
		
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		co.addArguments("--headless");
		//co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		//driver.quit();//123
		driver.close();//123
		
		
	}

}
