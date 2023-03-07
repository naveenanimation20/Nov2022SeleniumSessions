package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		System.out.println(langLinks.size());

		for (WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("मराठी")) {
				e.click();
				break;
			}
		}

	}

	//1. m1 - click on a specific lang link
	//2. m2 - return the list of lang links
	//3. m3 - capture the list of google footer links
	
	
}
