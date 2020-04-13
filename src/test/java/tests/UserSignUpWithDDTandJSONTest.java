package tests;
import org.testng.annotations.Test;
import data.JsonDataReader;
import pages.HomePage;
import pages.LoginPage;
import pages.UserSignUpPage;

public class UserSignUpWithDDTandJSONTest extends TestBase {
	
	HomePage homePageObject;
	UserSignUpPage SignUpObject;
	LoginPage LoginPageObject;

	@Test(priority = 1, alwaysRun = true)
	public void UserCanSignUpSuccessfully( ) throws InterruptedException  {
		try {
			JsonDataReader jsonReader = new JsonDataReader(); 
			jsonReader.JsonReader();
			homePageObject= new HomePage(driver);
			homePageObject.openSignUpPage();
			SignUpObject = new UserSignUpPage(driver);
			SignUpObject.signUp(jsonReader.firstname,jsonReader.lastname,jsonReader.phone,jsonReader.email,jsonReader.password);
			
			SignUpObject.userLogout();
			homePageObject.openLoginPage();
			LoginPageObject=new LoginPage(driver);
			LoginPageObject.userLogin(jsonReader.email, jsonReader.password);
			
			SignUpObject.userLogout();
	

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		
		finally {
			driver.quit();
		}
	}
}
