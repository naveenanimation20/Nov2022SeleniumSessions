package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		
		Thread.sleep(3000);
		
		By googleSuggListLocator = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		
		doSearch(googleSuggListLocator, "naveen automation labs github");
	}
	
	
	public static void doSearch(By suggListLocator, String suggName) {
		List<WebElement> suggList = driver.findElements(suggListLocator);
		System.out.println(suggList.size());
		
		for(WebElement e : suggList) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(text);

			}
				if(text.contains(suggName)) {
					e.click();
					break;
				}
		}
	}
	
	
	

}
