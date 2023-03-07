package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {

		
		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\Users\\naveenautomationlabs\\Downloads\\chromedriver.exe");

		
		//mac:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//4.5.3
		//Exception in thread "main" java.lang.IllegalStateException: 
		//The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property; 

		
//		106 -- .exe 106
//		108 -- .exe 108
//		chrome 109 -- .exe 109
//		chrome 110 -- .exe 110
		
		//selenium manager - 4.6.0
		//webdrivermanager - bonigarcia
		
		//109 chrome --> win.mac/linux -- .exe 109
		//109 chrome --> win.mac/linux -- .exe 108 --> 109
		//110 chrome --> win.mac/linux -- .exe 109 --> 110
		//115 chrome --> .exe 110 --> 115
		

		
		
		
		
		
	}

}
