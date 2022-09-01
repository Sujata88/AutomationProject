package TestAnotationPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnotation1 {
	
	@BeforeTest
	public void OpenDB() {
		System.out.println("Logged in to the Database");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("Logged out from the Database");
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
