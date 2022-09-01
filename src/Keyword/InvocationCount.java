package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
	
	//InvocationCount:-when we use this the test case is run acc. to invocation count
	
	@BeforeClass
	public void BrowserOpen() {
		System.out.println("The Browser is Open");
	}
	
	@AfterClass
	public void BrowserClose() {
		System.out.println("The Browser is Closed");
	}
	
	@BeforeMethod
	public void LoginPage() {
		System.out.println("The application logged in succesfully");
	}
	@AfterMethod
	public void LogoutPage() {
		System.out.println("The Application is closed");
	}
	
	@Test(priority=1,invocationCount=5)
	public void HomePage() {
		System.out.println("HomePage is unstable");
	}
	
	@Test
	public void NotificationPage() {
		System.out.println("NotificationPage is stable");
	}
	
	
	
	
	
	
	

}
