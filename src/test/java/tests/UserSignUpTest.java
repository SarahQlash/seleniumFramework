package tests;

import java.util.Date;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserSignUpPage;

public class UserSignUpTest extends TestBase {

	static Date currentDate = new Date();
	static long time = currentDate.getTime();
	static String EmailSubjectWithTimeStamp = time+"@gmail.com";

	HomePage homePageObject;
	UserSignUpPage SignUpObject;
	LoginPage LoginPageObject;

	@Test(priority = 1, alwaysRun = true)
	public void UserCanSignUpSuccessfully() throws InterruptedException  {
	 //	try {
			homePageObject= new HomePage(driver);
			homePageObject.openSignUpPage();

			SignUpObject = new UserSignUpPage(driver);
			SignUpObject.signUp("Sara", "Nasser", "01000601958253", EmailSubjectWithTimeStamp, "Sara@123");





	}

	@Test(dependsOnMethods = {"UserCanSignUpSuccessfully"})

	public void RegisteredUserCanLogout() {
	 
			SignUpObject.userLogout();

	}

	@Test(dependsOnMethods = {"RegisteredUserCanLogout"})
	public void UserCanLogin() throws InterruptedException {
	
			homePageObject.openLoginPage();
			LoginPageObject=new LoginPage(driver);
			
			//in Order to fail the TC put Email as a string to test the Screen shot 
			LoginPageObject.userLogin( "EmailSubjectWithTimeStamp", "Sara@123");
	}


}
