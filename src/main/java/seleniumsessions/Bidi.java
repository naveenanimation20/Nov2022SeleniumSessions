package seleniumsessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Bidi {

	public static void main(String[] args) throws FindFailed {

		
//		WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/basic_auth");

		// Create a new SikuliX instance
		 Screen screen = null;
		    try {
		      screen = new Screen();
		    } catch (Exception e) {
		    }
		// Wait for the authentication popup to appear
		Pattern usernameField = new Pattern("/Users/naveenautomationlabs/Documents/workspace1/Nov2022SeleniumSessions/userid.png");
		try {
			screen.wait(usernameField, 10);
		} catch (FindFailed e) {
			e.printStackTrace();
		}

		// Type the username and password into the authentication popup
		screen.type(usernameField, "admin");


		

//		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("the-internet.herokuapp.com");
//
//		((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
	}

}
