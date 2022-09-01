package Keyword;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test(priority=1)
	public void OpenURL() {
		System.out.println("url is open ");
	}
	
	@Test(priority=2, dependsOnMethods="OpenURL")
	public void LoginPage() {
		System.out.println("Logged in to the application");
	}
	
	@Test(priority=3)
	public void LogoutPage() {
		System.out.println("Logged out to the application");
	}


}
