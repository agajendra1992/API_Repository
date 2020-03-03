package App.Script;

import org.testng.annotations.Test;

import com.google.gson.GsonBuilder;
import com.jayway.restassured.response.Response;

import App.Generic.Endpoint;
import App.Generic.ResponseCode;
import App.Generic.URL;
import App.Generic.WebServicesMethod;

public class GetUser_TestCases {

	Response response;

	@Test
	public void GetUser() {
		String GetUserUrl = URL.Endpoint + Endpoint.GETSINGLEUSER.getresourcePath("1");
		System.out.println(GetUserUrl);
		response = WebServicesMethod.GetRequest(GetUserUrl);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		int ActualR = response.getStatusCode();
		ResponseCode re = new ResponseCode();
		re.SuccessCode(ActualR);
	}

	// @Test
	public void GetUserNegative() {
		String GetUserUrl = URL.Endpoint + Endpoint.GETSINGLEUSER.getresourcePath("1");
		response = WebServicesMethod.GetRequest(GetUserUrl);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		int ActualR = response.getStatusCode();
		ResponseCode re = new ResponseCode();
		re.SuccessCode(ActualR);
	}

}
