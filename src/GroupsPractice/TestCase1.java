package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void OpenDB() {
	    System.out.println("The DB is opend");	
	}
	
	@AfterTest
	public void CloseDB() {
	    System.out.println("The DB is closed");
	}    
	
	@BeforeClass
	public void OpenBrowser() {
	    System.out.println("The browser is opend");	
	}
	
	@AfterClass
	public void CloseBrowser() {
	    System.out.println("The browser is closed");	
	}

	@Test(groups="Smoke")
	public void Test1() {
		System.out.println("this is Test1");
	}
	
	@Test(groups="Functional")
	public void Test2() {
		System.out.println("this is Test2");
	}
	
	@Test(groups = {"Functional","Regrassion"})
	public void Test3() {
		System.out.println("this is Test3");
	}
	

}
