package org.Testing.TestCases;

import org.Testing.ResponseValidation.Responsevalidation;
import org.Testing.Utilities.*;
import org.Testing.testSteps.HttpMethods;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;

public class TC1 {

	public static void main(String[] args) throws IOException {
	  
		Properties pr = PropertiesFileLoad.propfileload("./Env.properties");
		
		HttpMethods http=new HttpMethods(pr);
		
		Response Res = http.GETrequest("URI");
		
		Responsevalidation Resobj=new Responsevalidation();
		Resobj.ResponseValidations(Res);
		
	}

}
