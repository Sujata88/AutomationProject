package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimesOuts {
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
	
	//thread.sleep is always less than timeout,if it is greater than that then error occure.
	
	@Test(timeOut=5000)
	public void HomePage() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("HomePage is unstable");
	}
	
	@Test(invocationCount=2)
	public void NotificationPage() {
		System.out.println("NotificationPage is stable");
	}

}
