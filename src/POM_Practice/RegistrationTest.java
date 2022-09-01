package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiva\\Desktop\\Automation\\chrome\\chromedriver-104.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FaceBookRegistrationPageTest() {
		
		RegistrationPage rgpage = new RegistrationPage(driver);    //Object==>constructor
		
		rgpage.clickFacebookLoginPageSignupLink();
		rgpage.verifyFacebookRegistrationPageFblogo();
		rgpage.verifyFacebookRegistrationPageAlreadyAccount();
		rgpage.setFacebookRegistrationPageFirstName("Sujata");
		rgpage.setFacebookRegistrationPageLastName("Patil");
		rgpage.setFacebookRegistrationPageMobileEmail();
		rgpage.setFacebookRegistrationPagePassword();
		rgpage.setFacebookRegistrationPageBirthDay();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthYear();
		rgpage.setFacebookRegistrationPageGender("female");
		rgpage.clickFacebookRegistrationPageSubmitBtn();
		
	}
	

}
