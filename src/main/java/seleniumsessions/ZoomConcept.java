package seleniumsessions;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//String zoomChrome = "document.body.style.zoom = '400.0%'";//edge, safari, chrome
//		
//		String zoomFirefox = "document.body.style.MozTransform = 'scale(0.5)'; ";//firefox
//		
//		js.executeScript(zoomFirefox);
		
		//zoomFirefox("0.5");
		zoomChromeEdge("300.0");
		
		
        
	}

	
	/**
	 * example: "document.body.style.zoom = '400.0%'"
	 * @param zoomPercentage
	 */
	public static void zoomChromeEdge(String zoomPercentage) {
		String zoom = "document.body.style.zoom = '"+zoomPercentage+"%'";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(zoom);

	}
	
	/**
	 * example: "document.body.style.MozTransform = 'scale(0.5)'; ";
	 * @param zoomPercentage
	 */
	public static void zoomFirefox(String zoomPercentage) {
		String zoom = "document.body.style.MozTransform = 'scale("+zoomPercentage+")'";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(zoom);

	}
	
	
	

}
