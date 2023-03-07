package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropNestedFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);		


		driver.get("https://codepen.io/rjsmer/full/vvewWp");
		Thread.sleep(3000);
		driver.switchTo().frame("result");
		//Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.className("dragFrame")));
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='drag frame element 5']"));
		//Action action1 = act.clickAndHold(ele1).build();
		//action1.perform();
		//driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();

		

		//driver.switchTo().frame(driver.findElement(By.className("dropFrame")));
		//Thread.sleep(3000);

		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.className("dropFrame")));
//		String text = driver.findElement(By.xpath("//div[normalize-space()='DROP INTO THIS FRAME']")).getText();
//		System.out.println(text);
		WebElement ele2 = driver.findElement(By.className("dropFrameBody"));
		//act.moveToElement(ele2).release().build();
		//act.release(ele2).build();
		//action1 = act.build();
		
		//action1.perform();
		
		act.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
		
		//act.dragAndDrop(ele1, ele2).build().perform();
		
		
	}

}
