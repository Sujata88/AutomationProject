package PracticeOnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnotationPractice {
	  
	@BeforeClass
	public void login() {
		System.out.println("Logged in to the application");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test (priority=1)
	public void HomePageTest() {
		System.out.println("validate Home Page ");
	}
	
	@Test (priority=3)
	public void NotificationPageTest() {
		System.out.println("Validate Notification Page");
	}
	
	@Test (priority=2)
	public void ProfilePageTest() {
		System.out.println("Validate Profile Page");
	}

}
