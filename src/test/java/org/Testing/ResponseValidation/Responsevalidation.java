package org.Testing.ResponseValidation;

import io.restassured.response.Response;

public class Responsevalidation {

	public void ResponseValidations(Response res) {
		
		
		System.out.println(res.getStatusLine());
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	
	}
	
}
