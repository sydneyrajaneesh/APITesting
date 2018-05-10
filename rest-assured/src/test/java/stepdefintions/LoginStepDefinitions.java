package stepdefintions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Base;
import utils.Reporter;
public class LoginStepDefinitions extends Base 
{
	@Given("^a valid Login URL$")
	public void a_valid_Login_url()
	{
		startResult();
		//test = startTestCase(testCaseName, testDescription);
		//test.assignCategory(category);
		RestAssured.baseURI = baseURL;
		
		//reportStep("The Base URL is read from user", "PASS");

	 	//RestAssured.baseURI = "https://reqres.in";

		//RequestSpecification httpRequest = RestAssured.given();
		//Response response = httpRequest.request(Method.GET, "/Hyderabad");

	}

	@When("^a user calls the Login URL using get method$")
	public void a_user_calls_get_method()
	{
		try{
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET, newEndpoint);	
			//reportStep("The response is successfully received for the request", "PASS");
		}
		catch (Exception e) {
			  // TODO Auto-generated catch block
			if(e instanceof java.net.UnknownHostException){
			      System.out.println("Unknown Host Exception");
					e.printStackTrace();
			      Assert.fail();

			  }else{
			      System.out.println("Other unknown error");
					e.printStackTrace();
			      Assert.fail();
			  }
			}
		
		
		//String responseBody = response.getBody().asString();
		//System.out.println(responseBody);
	}


	@Then("^verify status code (\\d+)$")
	public void status_code_200(int statuscode)
	{
		try{
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET,newEndpoint);
			int actualcode= response.getStatusCode();
			Assert.assertEquals(statuscode,actualcode);
			
		}
		catch (Exception e) {
			  // TODO Auto-generated catch block
			  if(e instanceof java.net.UnknownHostException){
			      System.out.println("Unknown Host Exception");
					e.printStackTrace();
			      Assert.fail();
			  }else{
			      System.out.println("Other unknown error");
					e.printStackTrace();
			      Assert.fail();
			  }
			}
		
			
	}

	

}
