package seleniumsessions;

public class WaitInSelenium {

	public static void main(String[] args) {

		//script   ---sync--->    app
		//script   -------> slow/fast/very slow
		
		//types of wait:
		//1. static wait: Thread.sleep(10000) -- pause 10 secs
		//2. dynamic wait: 10 secs --> 2 secs ---> 8 secs will be ignored
			//2.a: Implicitly Wait: global wait for all the elements
			//2.b: Explicit Wait: on a specific element + polling/interval time + non web elements
					//i. WebDriverWait
					//ii. FluentWait
		
		
		//WebDriverWait(c) --> FluentWait(c) --> Wait(I) : until();
								//until(){}
								//other methods{}
		
		
		
		
	}

}
