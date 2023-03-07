package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Downloads/AgileDevOps.jpeg");
		
		//<tag type="file"> -- this is mandatory attribute
		
		//autoIT/Sikuli/Robot -- not recommended
		
		
		
	}
	
	
	
	
	
	

}
