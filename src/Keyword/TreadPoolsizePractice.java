package Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TreadPoolsizePractice {
	
	//threadPoolSize:-
	
	@Test(invocationCount=4, threadPoolSize=4)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiva\\Desktop\\Automation\\chrome\\chromedriver-104.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  System.out.println("The title is:-"+ driver.getTitle());
		  
		  driver.close();
		  
		  
	}
	
	

}
