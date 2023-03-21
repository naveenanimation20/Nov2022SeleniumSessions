package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// 1. open browser: chrome, ff, safari, edge
		// ChromeDriver driver = new ChromeDriver();		
	
		

		String browser = "chrome";
		WebDriver driver = null;

		// cross browser logic
		if (browser.equals("chrome")) {
			ChromeOptions co = new ChromeOptions();
			driver = new ChromeDriver(co);
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("plz pass the right browser...." + browser);
		}

		// 2. enter url:
		driver.get("https://google.com");

		// 3. get the title:
		String actTitle = driver.getTitle();
		System.out.println("page title : " + actTitle);

		// validation point/checkpoint:
		if (actTitle.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Automation steps (selenium code) + validation/assertions = Automation Testing

		driver.quit();// close the browser

	}

}
