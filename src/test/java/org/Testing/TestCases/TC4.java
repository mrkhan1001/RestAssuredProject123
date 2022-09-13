package org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.Testing.Payload.JsonBodyData;
import org.Testing.ResponseValidation.Responsevalidation;
import org.Testing.Utilities.PropertiesFileLoad;
import org.Testing.testSteps.HttpMethods;
import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class TC4 {

	public static void main(String[] args) throws IOException {
		Properties pr = PropertiesFileLoad.propfileload("./Env.properties");
		
		HttpMethods http=new HttpMethods(pr);
		
		JSONObject Reqobj=JsonBodyData.PATCHdata();
		
		Response Res=http.PATCHRequest(Reqobj,"PATCH_URI");
		
		Responsevalidation Rd=new Responsevalidation();
		
		Rd.ResponseValidations(Res);
		
		
	}

}
