package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	// global pre conditions
	// pre condition
	// test cases --> test steps --> act vs exp result -- Assertion
	// post steps
	// post global steps
	
	
//	BS - startDBConnection
//	BT - createUser
//	BC -- launchBrowser
	
//	BM -- loginToApp
//	homePageSearchTest -- t1
//	AM -- logout
	
//	BM -- loginToApp
//	homePageTitleTest -- t2
//	AM -- logout
	
//	BM -- loginToApp
//	homePageURLTest -- t3
//	AM -- logout
	
//	AC -- closeBrowser
//	AT -- deleteUser
//	AS -- disconnectWithDB

	

	//1
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS - startDBConnection");
	}

	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT - createUser");
	}

	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}

	//4 7 10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}

	//8
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}

	//11
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}

	//5
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}

	//6 9 12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}

	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}

	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}

}
