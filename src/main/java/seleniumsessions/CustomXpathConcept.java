package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomXpathConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//xpath: address of the element in html dom
		//1. absolute xpath: /html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/h4/a
		//2. relative xpath: custom xpath
		
		
		//tag[@attr='value']
		//input[@id='input-email']
		//input[@placeholder='E-Mail Address']
		
		//tag[@attr1='value' and @attr2='value']
		//input[@type='text' and @name='email']
		//input[@type='text' and @name='email' and @id='input-email']
		
		//tag
		//input
		//a -- 81
		//img
		//input[@type='text' or @type='email']
		
		//xpath with text():
		//text is not an attribute, its the text content of the element
		//dont use @text....we use text() function
		//tag[text()='value']
		//h2[text()='Returning Customer']
		//h2[text()='New Customer']
		
		By newCus = By.xpath("//h2[text()='New Customer']");
		
		//check My Account links is present on the page -- two times
		By myAcc = By.xpath("//a[text()='My Account']");
		int myAccCount = driver.findElements(myAcc).size();
		if(myAccCount == 2) {
			System.out.println("PASS");
		}
		
		//text() with attribute:
		//tag[@attr='value' and text()='value']
		//h1[@class='h0-80' and text()='Love your software']
		//a[@class='list-group-item' and text()='Register']
		//a[text()='Register' and @class='list-group-item']
		
		//tag[@attr1='value' and @attr2='value' and text()='value']
		//a[text()='Register' and @class='list-group-item' and @href]
		//a[@href]
		
		//p[text()='Freshworks makes ridiculously easy-to-use marketing, sales, support and IT solutions.']
		
		//contains() with attribute:
		//tag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		
		//input[contains(@id,'email')]
		//input[@id='input-email']
		
		//contains() with one attribute and use another attribute without contains():
		//tag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		//input[contains(@placeholder,'E-Mail') and @name='email' and @type='text']
		
		//dynamic id/attribute:
//		<input id=firstname_123>
//		<input id=firstname_456>
//		<input id=firstname_989>
		
		//By.id("firstname_123");//not the right xpath
		//input[contains(@id,'firstname_')] -- right
		
		//contains() with text():
		//tag[contains(text(),'value')]
		//p[contains(text(),'marketing, sales, support')]
		//h2[contains(text(),'50,000 companies')]
		//a[contains(text(),'Amazon')]
		
		//contains() with text() and contains() with attribute:
		//tag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Science') and contains(@href,'amazon.science')]
		
		//contains() with text() and attribute with contains():
		//tag[contains(text(),'value') and @attr='value']
		//a[contains(text(),'Science') and @class='nav_a']
		
		//starts-with():
		//tag[starts-with(text(),'value')]
		//a[starts-with(text(),'Amazon')]
		//small[starts-with(text(),'Free CRM has powerful call tracking')]
		
		//input[starts-with(@aria-labelledby,'UIFormControl') and @type='email']
		//a[starts-with(@href,'https://naveenautomationlabs.com/')]
		
		
		//ends-with() in xpath??? -- NA
		
		
		//position/index in xpath:
		// (//input[@class='form-control'])[2]
		By.xpath("(//input[@class='form-control'])[1]");
		// (//input[@class='form-control'])[position()=1]
		
		// (//input[@class='form-control'])[6]
		
		// (//input[@class='form-control'])[last()]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
		
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]")).getText();
		
		
		//class in locator: className, xpath, css
		
		//input[@class='form-control private-form__control login-email'] -- valid
		//input[@class='login-email'] -- not valid
		By.className("form-control private-form__control login-email"); //not valid -- only one class is allowed
		By.className("login-email"); //valid
		By.xpath("//input[contains(@class,'login-email')]"); //--valid
		
		
		//parent to child:
			
//		parent/child --> direct
//		parent//child --> direct+indirect
		
		//child to parent: backward traversing in xpath
		//input[@id='input-email']/../../../../../../../../../..
		
		//siblings:
		//input[@id='input-email']/preceding-sibling::label
		driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label")).getText();
		
		//label[@for='input-email']/following-sibling::input[@name='email']
				
		
		//a[contains(text(),'Ali khan')]/../preceding-sibling::td/input[@type='checkbox']
		//a[text()='Romi singh']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='deepti gupta']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		// (//a[text()='Ali khan']/parent::td/following-sibling::td)[position()=1]/a
		
		//a[text()='Ali khan']/parent::td/following-sibling::td/span
		
		//span[text()='Jordan Hermann']/../../../following-sibling::td//span
		//span[text()='Jordan Hermann']/ancestor::td/following-sibling::td//span
		// (//span[text()='Jordan Hermann']/ancestor::td/following-sibling::td//span)[2]
		
		
		
//		Naveen Automation Labs OpenCart : https://naveenautomationlabs.com/opencart/
//
//			Automation Book Store: https://automationbookstore.dev/
//
//			Automation Test Store: https://automationteststore.com/
//
//			DemoBlaze: https://www.demoblaze.com/
//
//			DemoQA: https://demoqa.com/
//
//			ParaBank: https://parabank.parasoft.com/parabank/index.htm
//
//			SelectorsHub: https://selectorshub.com/xpath-practice-page/
//
//			Selenium Test Pages: https://testpages.herokuapp.com/styled/index.html
//
//			Swag Labs: https://www.saucedemo.com/
//
//			The Internet: https://the-internet.herokuapp.com/
//
//			UI Test Automation Playground: http://uitestingplayground.com/
//
//			XYZ Bank: https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
		
		//groupautomation/Selenium@12345
		//newautomation/Selenium@12345
		
		
		
//		for(int i=0; i<countrylist.size(); i++) {
//			countrylist.get(i).click();
//			
//			stateList = driver.findElements(statelocator);
//			for(WebElement e : stateList) {
//				System.out.println(e.getText());
//			}
//		}
		
		
		//*[@id='input-firstname'] --> 100 --> 
		//input[@id='input-firstname']---> 100 --> 10 --> 1
		
		
		
		
		
	}

}
