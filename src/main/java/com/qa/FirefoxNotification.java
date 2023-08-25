package com.qa;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirefoxNotification {

	public static void main(String[] args) {

		
		ChromeOptions co = new ChromeOptions();
//		HashMap<String, String> prefMap = new HashMap<String, String>();
//		prefMap.put("profile.default_content_setting_values.notifications", "2");
//		co.setExperimentalOption("prefs", prefMap);
		
		
        //co.addArguments("--disable-notifications");
        co.setExperimentalOption("prefs", "{\"profile.default_content_setting_values.notifications\": 1}");

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.reddit.com");
		
		
	}

}
