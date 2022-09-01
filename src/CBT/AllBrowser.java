package CBT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AllBrowser {
	
	WebDriver driver;
	@Parameters("browser")
	
	@Test(priority = 1)
	public void crossBrowserTesting(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiva\\Desktop\\Automation\\chrome\\chromedriver-104.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shiva\\Desktop\\Automation\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void verifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test (priority = 3)
	public void verifyPageTititle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}

	@Test (priority = 4)
	public void verifyUsernamefield() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("Sujata");
		
	}	
	
		@Test (priority = 5)
		public void verifypasswordfield() {
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			Assert.assertTrue(password.isEnabled());
			password.sendKeys("lamanianseinaoinfd");
	}
		
		@Test (priority = 6)
		public void clickLoginButton() {
			WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
			Assert.assertTrue(loginbtn.isEnabled());
			loginbtn.click();
	
	}
}
