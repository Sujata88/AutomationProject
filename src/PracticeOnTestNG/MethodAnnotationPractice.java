package PracticeOnTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotationPractice {
	
	@BeforeMethod
	public void login() {
		System.out.println("logged in to the application page");
	} 
	
	@AfterMethod
	public void logout() {
		System.out.println("logged out from the application page");
	}
	
	@Test
	public void HomepageTest() {
		System.out.println("validate Home page");
	}	
	
	
	@Test
	public void NotificationPageTest() {
		System.out.println("validate Notification page");
	}
	
	@Test
	public void ProfilePageTest() {
		System.out.println("validate Profile page");
	}
	

}
