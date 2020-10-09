package TestNG;

import org.testng.annotations.Test;

public class s03_describeRunTimesAndTimeoutTest extends aBase {
		
	@Test(description = "we are opening the facebookpage")
	public void methodA(){
		driver.get("https://www.facebook.com/");
	}
	
	@Test(invocationCount = 2)
	public void methodB(){
		driver.get("https://www.walmart.com/");
	}
	
	@Test(timeOut = 3000)
	public void methodC(){
		driver.get("https://www.amazon.com/");
	}
	
	
}
