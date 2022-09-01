package POM_Practice;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
	
	//1.Declaration  2.initialization 3. Usage
	//Object Repository
	
	//1.Declaration
	
	@FindBy (xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy (xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
	@FindBy (xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy (xpath="//input[@name='firstname']") private WebElement firstname;
	@FindBy (xpath="//input[@name='lastname']") private WebElement lastname;
	@FindBy (xpath="//input[@name='reg_email__']") private WebElement mob_email;
	@FindBy (xpath="//input[@name='reg_passwd__']") private WebElement password;
	@FindBy (xpath="//select[@id='day']") private WebElement birthday;
	@FindBy (xpath="//select[@id='month']") private WebElement birthmonth ;
	@FindBy (xpath="//select[@id='year']") private WebElement birthyear;
	@FindBy (xpath="//label[text()='Male']") private WebElement gender_male;
	@FindBy (xpath="//label[text()='Female']") private WebElement gender_female;
	@FindBy (xpath="//button[@name='websubmit']") private WebElement submitbtn;
	
	//2.initialization
	//constructor creation
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.Usage
	
	public void clickFacebookLoginPageSignupLink() {
		signuplink.click();
	}
	
    public void verifyFacebookRegistrationPageFblogo() {
    	Assert.assertTrue(reg_fblogo.isDisplayed() ,"Facebook logo is not display on registration page");
		
	}
	
	public void verifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertEquals(already_acc.isDisplayed(),"Facebook Already have an acc.option is not display on registration page");
		Assert.assertEquals(already_acc.isEnabled(),"Facebook Already have an acc.option is not display on registration page");
		Assert.assertEquals(already_acc.getText()," Already have an account");
	}
	
	public void setFacebookRegistrationPageFirstName(String fn) {
		firstname.sendKeys(fn);
	}
	
	public void setFacebookRegistrationPageLastName(String ln) {
		lastname.sendKeys(ln);
	}
	
	public void setFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("sujata.kondhalkar99@gmail.com");
	}
	
	public void setFacebookRegistrationPagePassword() {
		password.sendKeys("123456789");
	}
	
	public void setFacebookRegistrationPageBirthDay() {
		Select bday = new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed(), "Birthday option is not displayed");
		Assert.assertFalse(birthday.isSelected());
		bday.selectByVisibleText("30");
	}
	
	public void setFacebookRegistrationPageBirthMonth() {
		Select bmonth = new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "Birthmonth option is not displayed");
		Assert.assertFalse(birthmonth.isSelected());
		bmonth.selectByVisibleText("Dec");
	}
	
	public void setFacebookRegistrationPageBirthYear() {
		Select byear = new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "Birthyear option is not displayed");
		Assert.assertFalse(birthyear.isSelected());
		byear.selectByVisibleText("1992");
	}
	
	public void setFacebookRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("The wrong input selected by user");
		}
		
	}
	
	public void clickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}
	
	
}
