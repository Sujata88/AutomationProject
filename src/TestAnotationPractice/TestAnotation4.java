package TestAnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAnotation4 {
	
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("The Browser is Opened");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("The Browser is Closed");
	}
	
	@Test
	public void m4() {
		System.out.println("This is method m4");
	}
	
	@Test
	public void m5() {
		System.out.println("This is method m5");
	}
	
	@Test
	public void m6() {
		System.out.println("This is method m6");
	}

}
