package testngsessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {

	public void createUser() {
		System.out.println("create user");
	}

	public void getUser(int userId) {
		System.out.println("get user: " + userId);
	}

	public void updateUser(int userId) {

	}

	public void deleteUser(int userId) {

	}
	
	
	@Test
	public void createUserTest() {
		createUser();
	}
	
	@Test
	public void getUserTest() {
		createUser();//post -- 123
		getUser(123);//get
	}
	
	@Test
	public void updateUserTest() {
		createUser();//post -- 123
		getUser(123);//get
		updateUser(123);//put
		getUser(123);//get
	}
	
	@Test
	public void deleteUserTest() {
		createUser();//post
		getUser(123);//get
		deleteUser(123);//delete
		getUser(123);//get
	}
	
	
	@Test
	public void getUserTesting() {
		int userId = 123;//hard coded user id
		//QA --> stage --> dev --> UAT -- PROD
		getUser(userId);
		//assert
		
	}
	
	
	
	

}
