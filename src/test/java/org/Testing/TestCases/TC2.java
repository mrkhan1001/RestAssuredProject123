package org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.Testing.Payload.JsonBodyData;
import org.Testing.ResponseValidation.Responsevalidation;
import org.Testing.Utilities.PropertiesFileLoad;
import org.Testing.testSteps.HttpMethods;
import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class TC2 {

	public static void main(String[] args) throws IOException {
		//step1:load the properties file in the object of property class pr
		Properties pr = PropertiesFileLoad.propfileload("./Env.properties");

		
		//step2: initialize properties object of HttpMethods class with pr of step 1
		HttpMethods http=new HttpMethods(pr);
		
		//step3: call GetBodyData method of class JsonBodydata which return simple JsonObject data
		JSONObject data=JsonBodyData.GetBodyData();
		
		/*step4: POSTRequest method HTTPMethods class is called passing body data and URI
		  And Response Returned by this method is collected in Res Object of Response class 
		*/
		Response Res = http.POSTRequest(data, "POST_URI"); 
	
		//Res is sent to the ResponseValidations method of class Responsevalidation
		Responsevalidation resobj=new Responsevalidation();
		resobj.ResponseValidations(Res);
		
	}

}
