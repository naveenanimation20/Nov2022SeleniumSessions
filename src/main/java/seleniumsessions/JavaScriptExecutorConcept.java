package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		js.executeScript("alert('hi this is alert');");
		
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
		//jsUtil.generateAlert("this is my js alert...we are on amazon home page");
		//jsUtil.generateConfirmPopUp("are you sure???");
		
		//jsUtil.refreshBrowserByJS();
		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		
//		if(pageText.contains("Deal Pipeline")) System.out.println(true);
//		if(pageText.contains("UNLIMITED CAMPAIGNS")) System.out.println(true);
		
		//WebElement un = driver.findElement(By.name("username"));
//		WebElement form = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(form);
		
//		jsUtil.flash(un);
//		un.sendKeys("naveen@gmail.com");
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDownMiddlepage();
//		
//		String text = driver.findElement(By.tagName("html")).getText();
//		System.out.println(text);
		
		String title1 = driver.findElement(By.xpath("//title")).getText();
		System.out.println(title1);
		
		
		
	}

}
