package tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;



public class GetResponseTest {

	@Test
	public void testResponse() {


		Response res = RestAssured.get("https://www.phptravels.net/register");
		int code= res.getStatusCode();

		ResponseBody responseBody = res.getBody();
		
		System.out.println(responseBody.asString());
		Assert.assertEquals(code , 200);
		writeUsingOutputStream(responseBody.prettyPrint());
	}	
	
	private static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(System.getProperty("user.dir")+"/src/test/java/data/getBodyResponse.html"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}




}
