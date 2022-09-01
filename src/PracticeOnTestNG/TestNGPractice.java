package PracticeOnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	// test ng ==> main method is not present
	
		// Annotation :- @ Test ==> This annotation will replace to the main method.
		// before writing important validation or testcase you have to use this annotation
		
		// Open url ==> Login ==> Logout  ==> 3 method.
		
		@Test (priority = 1)
		public void openUrl() {
			System.out.println("browser is launched and url hitted");
			Reporter.log("browser is launched and url hitted");
		}

		@Test(priority = 2)
		public void login() {
			System.out.println("Logged in to the application sucessfully");
			Reporter.log("Logged in to the application sucessfully");
		}
		
		@Test(priority = 3)
		public void logout() {
			System.out.println("Logged out from the application");
			Reporter.log("Logged out from the application");
		}
		
		// output :- 1. regular output ==> console tab  2.Testng console   3. output ==> report => a. emailable
		               //b. index.html
		
		// by default execution :- in alphabetical order.
		// control the sequence of execution :- keyword ==> Priority  ==> numbers
}
