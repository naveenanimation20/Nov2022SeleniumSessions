package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. browser specific: can not be used for the cross browser
//		ChromeDriver driver = new ChromeDriver();//ch
//		FirefoxDriver driver1 = new FirefoxDriver();//ff
		
		
		//2. WD = new CD - valid top casting - recommended - local execution
		//WebDriver driver = new ChromeDriver();
		
		//3. SC = new CD() - valid but not recommended
		//SearchContext driver = new ChromeDriver();
		
		//4. RWD = new CD(); - valid top casting - recommended - local 
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. WD = new RWD(); - valid top casting - recommended -- GRID - used for remote execution
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. SC = new RWD(); - valid but not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//WebDriver driver = new WebDriver();
		
		
	}

}
