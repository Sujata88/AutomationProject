package GroupsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeClass
	public void OpenBrowser() {
	    System.out.println("The browser is opend");	
	}
	
	@AfterClass
	public void CloseBrowser() {
	    System.out.println("The browser is closed");
	    
	}
	
	
	@Test(groups="Smoke")
	public void Test7() {
		System.out.println("this is Test7");
	}
	
	@Test(groups="Functional")
	public void Test8() {
		System.out.println("this is Test8");
	}
	
	@Test(groups= {"Functional", "Regrassion"})
	public void Test9() {
		System.out.println("this is Test9");
	}

}
