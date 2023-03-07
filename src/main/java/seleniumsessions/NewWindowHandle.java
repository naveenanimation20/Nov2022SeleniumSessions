package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String PWID = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);//sel 4.x
		
		driver.get("https://www.google.com");
		System.out.println("child window title: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(PWID);
		System.out.println("parent window title : " + driver.getTitle());

		
		//random pop up: cant be handled -- PROD
		//QA/Stage/test -- block these pop ups
		
		
	}

}
