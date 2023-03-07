package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		//SID - session id
		
		WebDriver driver = new ChromeDriver();//123
		driver.get("https://www.google.com");//123
		String title = driver.getTitle();//123
		System.out.println(title);//Google
		
		System.out.println(driver.getCurrentUrl());//123
		
		driver.quit();//123
		//sid = null

		//driver.close();//123
		//NoSuchSessionException: invalid session id
		//sid = 123 -- invalid
		
//		driver = new ChromeDriver();//sid = 456
//		driver.get("https://www.google.com");//456
//
		System.out.println(driver.getTitle());//null
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
		
	}

}
