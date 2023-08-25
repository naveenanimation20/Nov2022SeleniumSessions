package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/new-zealand-in-india-2022-23-1348633/india-vs-new-zealand-3rd-t20i-1348651/full-scorecard");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Rahul Tripathi']"));
		
		String wk = driver.findElement(with(By.cssSelector(".ds-flex.ds-cursor-pointer.ds-items-center")).toRightOf(ele)).getText();
		System.out.println(wk);
		

	}

}
