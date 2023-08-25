package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {
	
	

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//id
		// #id
		// #input-firstname -- css
		//input[@id='input-firstname'] -- xpath
		By fn = By.cssSelector("#input-firstname");
		
		//tag#id
		// input#input-firstname
		
		//class
		// .class
		// .form-control
		// .login-email
		
		// tag.class
		// input.form-control
		// input.login-email
		// button.login-submit
		
		//.c1.c2.c3...cn
		// .form-control.private-form__control.login-email
		//tag.c1.c2.c3...cn
		// input.form-control.private-form__control.login-email
		
		// input.login-email.form-control
		
		//tag#id.class
		// input#username.login-email
		//tag.class#id
		// input.login-email#username
		//#id.class
		// #username.login-email
		//.class#id
		//.login-email#username
		
		//tag.c1.c2.c3...cn#id
		//input#username.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email#username
		//input.form-control#username.private-form__control.login-email
		
		
		//other attr:
		// tag[attr='value']
		// input[type='text'] -- css
		//input[@type='text'] -- xpath
		// input[placeholder='First Name']
		
		// input[id='input-firstname']
		
		// input[class='login-email'] --- css --0
		//input[@class='login-email'] -- xpath --0
		
		//input[contains(@class,'login-email')] -- 1 -- xpath
		
		// input[class='form-control private-form__control login-email']
		
		
		//multiple attr:
		// tag[attr1='value'][attr2='value'][attr3='value']
		// input[type='text'][name='firstname']
		// input[type='text'][name='firstname'][placeholder='First Name'] -- css
		//input[@type='text' and @name='firstname' and @placeholder='First Name'] --xpath
		
		//tag#id[attr='value']
		// input#input-firstname[placeholder='First Name'][type='text']
		// input#input-firstname[placeholder='First Name'][type='text'].form-control
		// input[placeholder='First Name'][type='text'].form-control#input-firstname
		
		//h1[text()='Register Account']
		//text is not supported in CSS
		
		//contains:
		// tag[attr*='value']
		// input[id*='firstname']
		// input[class*='login-email']
		
		//starts-with:
		// tag[attr^='value']
		// input[placeholder^='First']
		
		// input[id^='naveen_']
		
		//ends-with:
		// tag[attr$='value']
		// input[placeholder$='Name']
		
		
		//parent to child:
		// parent tag child tag
		// parent tag > child tag > child tag
		
		// form#Form_getForm > select -- 0 --> direct child element
		// form#Form_getForm select -- 1 --> indirect + direct child elements
		
		// form#hs-login > div -- 8
		// form#hs-login div --20
		
		
		//child to parent: backward traversing -- not available
					
		
		//or - comma in css:
		// input#username,button#loginBtn,input#password,button#ssoBtn -- 4
		// FEs(css).size() --> 4
		int impFieldsCount = 
				driver.findElements(By.cssSelector("input#username,button#loginBtn,input#password,button#ssoBtn")).size();
		
		if(impFieldsCount == 4) {
			System.out.println("PASS");
		}
		
		
		//not in css:
//		form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search'], input[name='firstname'])
		
		
		//indexing:		
//		select#Form_getForm_Country > option:first-child
//		select#Form_getForm_Country > option:last-child
//		
//		select#Form_getForm_Country > option:first-of-type
//		select#Form_getForm_Country > option:last-of-type
//		
//		
//		select#Form_getForm_Country > :first-child
//		select#Form_getForm_Country > :first-of-type
//		
//		select#Form_getForm_Country > option:nth-of-type(12)
//		select#Form_getForm_Country > :nth-of-type(12)
		
		
		                   //xpath          vs           css:
		//1. syntax:       complex                       simple
		//2. text():         yes                         no
		//3. AND:            yes							yes
		//4. OR              yes							yes, comma
		//5. forward:        yes							yes
		//6. backwards: 	 yes							no
		//7. forward sibling: yes							yes	
		//8. backward sibling: yes							no
		//9. not: 				no							yes
		//10. index: 			yes							yes
		//11. capture grp:     yes							no
		//12. performance:     good							good
		//13. starts-wtih		yes							yes
		//14. contains			yes							yes
		//15. ends-with: 		no							yes
		//16. webtable: 		easy						limited
		
		
		//sibling in css:
		//label[for='input-email'] + input[name='email'] -- 1 immediate sibling
		//div.private-form__label-wrapper ~ div --> all forward siblings
		
		//SVG
		//shadowDOM
		//Graphs
		
		
		
		
		
	}

}
