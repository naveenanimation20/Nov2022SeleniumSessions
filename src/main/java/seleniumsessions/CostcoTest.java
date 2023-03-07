package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CostcoTest {

	static WebDriver driver;

	// 2. multi level menu items
	
	

	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> myList1 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry"));
		Collections.reverse(myList1);
		System.out.println(myList1);
		
		
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5, "Apple"));
		System.out.println(myList.size());
		System.out.println(myList);

		
		int p[] = {1,4,5,2,3,22,31, 2};
		
		int q[] = new int[p.length-1];
		
		int count=0;
		for(int e : p) {
			if(!(e==22)) {
				q[count] = e;
				count++;
			}
		}
		System.out.println(Arrays.toString(q));



		driver = new ChromeDriver();
		Thread.sleep(5000);

		driver.get("https://www.costco.com/");
		
		By shopByCat = By.id("navigation-dropdown");
		multiLevelMenuHandling(shopByCat, "Baby", "Baby Care & Safety", "Baby Monitors");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void multiLevelMenuHandling(By parentMenu, String l1, String l2, String l3)
			throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).build().perform();

		WebElement l2Ele = driver.findElement(By.xpath("//a[text()='Baby']/parent::li"));
		Action action = act.moveToElement(l2Ele).build();
		action.perform();

		Thread.sleep(1500);

		Action action1 = act.moveToElement(driver.findElement(By.xpath("//a[text()='Baby Care & Safety']/parent::li")))
				.build();
		action1.perform();

		Thread.sleep(1500);

		driver.findElement(By.linkText(l3)).click();
	}

}
