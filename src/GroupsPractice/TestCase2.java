package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass
	public void OpenBrowser() {
	    System.out.println("The browser is opend");	
	}
	
	@AfterClass
	public void CloseBrowser() {
	    System.out.println("The browser is closed");	
	}   
	
	@Test(groups="Smoke")
	public void Test4() {
		System.out.println("this is Test4");
	}
	
	@Test(groups="Functional")
	public void Test5() {
		System.out.println("this is Test5");
	}
	
	@Test(groups= {"Functional", "Regrassion"})
	public void Test6() {
		System.out.println("this is Test6");
	}

}
