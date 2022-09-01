package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableFalse {
	
	//enabled=false:-when we don't want to run perticular test case.
	
	
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
	
	@Test(invocationCount=5)
	public void HomePageTest() {
		System.out.println("HomePage is unstable");
	}
	
	@Test(invocationCount=2, enabled= false)
	public void NotificationPageTest() {
		System.out.println("NotificationPage is stable");
	}

}
