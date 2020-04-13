package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {
	private WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		
		super(driver);
		wait = new WebDriverWait(driver, 60);
	
	}
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameTxt; 
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTxt;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath  = "//h3[@class='text-align-left']")
	public WebElement nameTag;
	
	public void userLogin(String username,String password) {

		setTextElementText(userNameTxt,username);
		setTextElementText(passwordTxt, password);
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn)) ;
		clkBtn(loginbtn);
		
		assertTrue(nameTag.getText().contains(username));
		
		
	}

}
