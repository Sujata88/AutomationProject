package TestAnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnotation3 {
	
	@BeforeTest
	public void OpenDB() {
		System.out.println("Logged in to the Database");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("Logged out from the Database");
	}
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("The Browser is Opened");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("The Browser is Closed");
	}
	
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}


}
