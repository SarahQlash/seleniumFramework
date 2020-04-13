package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;



public class GetResponseTest {
	
	@Test
	public void testResponse() {
		
		
		Response res = RestAssured.get("https://www.phptravels.net/register");
		int code= res.getStatusCode();
		
		Headers headers = res.getHeaders();
		
		for(Header h :headers) 
		{
			System.out.println(h.getName() + " " + h.getValue());
			
		}
		
		Assert.assertEquals(code , 200);
		
	}	
	
	
	

}
