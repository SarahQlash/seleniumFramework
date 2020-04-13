package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.UserSignUpPage;

public class UserSignUpWithJavaFakerTest extends TestBase {

	HomePage homePageObject;
	UserSignUpPage SignUpObject;
	LoginPage LoginPageObject;
	Faker FakeData = new Faker();
	String firstName= FakeData.name().firstName();	
	String lastName= FakeData.name().lastName();	
	String phone = FakeData.phoneNumber().phoneNumber();
	String email = FakeData.internet().emailAddress();
	String password = FakeData.number().digits(8).toString();
	

	@Test(priority = 1, alwaysRun = true)
	public void UserCanSignUpSuccessfully() throws InterruptedException  {
	 	try {
	 		
	 	
			homePageObject= new HomePage(driver);
			homePageObject.openSignUpPage();

			SignUpObject = new UserSignUpPage(driver);
			SignUpObject.signUp( firstName, lastName , phone, email, password);
			System.out.println(" User Data : " + firstName + " " + lastName + " "+ phone +" "+ password +"");

 		} catch (Exception e) {
 			System.out.println("Error : " + e.getMessage());
 		
 		}
 	

	}

	@Test(dependsOnMethods = {"UserCanSignUpSuccessfully"})

	public void RegisteredUserCanLogout() {
		 try {
			SignUpObject.userLogout();

	 	} catch (Exception e) {
	 		System.out.println("Error : " + e.getMessage());
			
	 	}
	}

	@Test(dependsOnMethods = {"RegisteredUserCanLogout"})
	public void UserCanLogin() throws InterruptedException {
		 try {
			homePageObject.openLoginPage();
			LoginPageObject=new LoginPage(driver);

			LoginPageObject.userLogin( email, password);
			
	 	} 
		 
		 catch (Exception e) {
	 		System.out.println("Error : " + e.getMessage());
			
 		}
	}


}
