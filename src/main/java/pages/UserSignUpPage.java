package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserSignUpPage extends PageBase {


	private WebDriverWait wait;
	public UserSignUpPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 60);		

	}


	@FindBy(xpath = "//input[@name='firstname']")
	WebElement fNameTxt;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lNameTxt;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneTxt;

	@FindBy(xpath  = "//input[@name='email']")
	WebElement emailTxt;

	@FindBy(xpath  = "//input[@name='password']")
	WebElement passwordTxt;

	@FindBy(xpath = "//input[@name='confirmpassword']")
	WebElement confirmPasswordTxt;

	@FindBy(xpath = "//div[@class='form-group']/button[@type='submit']")
	WebElement signUpBtn;

	@FindBy(xpath  = "//h3[@class='text-align-left']")
	public WebElement nameTag;
	
	@FindBy(xpath = "//header[@id='header-waypoint-sticky']/div[@class='header-top']//ul//div[@class='dropdown dropdown-login dropdown-tab']/a[@id='dropdownCurrency']")
	WebElement Uname;
	
	@FindBy(xpath = "//header[@id='header-waypoint-sticky']/div[@class='header-top']//ul//div[@class='dropdown dropdown-login dropdown-tab show']/div[@class='dropdown-menu dropdown-menu-right show']//a[contains(text(),'Logout')]")
	WebElement logoutBtn;
	
	
	
  
	public void signUp(String firstName, String lastName , String phone ,String email ,String password ) {
		wait.until(ExpectedConditions.elementToBeClickable(fNameTxt)) ;
		setTextElementText(fNameTxt, firstName);
		setTextElementText(lNameTxt, lastName);
		setTextElementText(phoneTxt, phone);
		setTextElementText(emailTxt, email);
		setTextElementText(passwordTxt, password);
		setTextElementText(confirmPasswordTxt, password);
		clkBtn(signUpBtn);
		wait.until(ExpectedConditions.elementToBeClickable(nameTag));
		assertTrue(nameTag.getText().contains(firstName));
	}
    
   
	public void userLogout() {
		wait.until(ExpectedConditions.elementToBeClickable(Uname)) ;
		clkBtn(Uname);
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)) ;
		clkBtn(logoutBtn);
	}
	
    
}
