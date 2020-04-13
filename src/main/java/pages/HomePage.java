package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

	private WebDriverWait wait;

	public HomePage(WebDriver driver) {
		super(driver);
		
		wait = new WebDriverWait(driver, 60);

	}

	@FindBy(linkText = "MY ACCOUNT")
	WebElement OptionList;


	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//a[contains(text(),'Login')]")
	WebElement LoginBtn;



	//WebDriverWait= new WebDriverWait(driver, 60) ;
	public void openSignUpPage() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(OptionList)) ;
		clkBtn(OptionList);
		wait.until(ExpectedConditions.elementToBeClickable(SignUpBtn)) ;
		clkBtn(SignUpBtn);
	}
	
	
	public void openLoginPage()  throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(OptionList)) ;
		clkBtn(OptionList);
		wait.until(ExpectedConditions.elementToBeClickable(SignUpBtn)) ;
		clkBtn(LoginBtn);
		
	}
}
