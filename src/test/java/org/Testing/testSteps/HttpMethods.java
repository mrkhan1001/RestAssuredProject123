package org.Testing.testSteps;

import java.util.Properties;

import javax.annotation.meta.When;

import org.Testing.Payload.JsonBodyData;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class HttpMethods {
	static Properties pr;
	
	public HttpMethods(Properties pr) {
		this.pr=pr;
	}
	public Response GETrequest(String URI) {
		Response res=
				given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(pr.getProperty(URI));
		
		return res;
	}
	
	public Response POSTRequest(JSONObject data,String URI) {
	
	Response res=
	
	     given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(data)
		.when()
			 .post(pr.getProperty(URI));
	
	
	return res;
    }
	
	
	public Response PUTRequest(JSONObject data,String URI) {
		
		Response Res=
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(data)
		.when()
		.put(pr.getProperty(URI));
		
	return Res;	
	}
	
	public Response PATCHRequest(JSONObject data,String URI) {

		Response Res=
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(data)
		.when()
		.patch(pr.getProperty(URI));
		
	return Res;		
	}
	
	
	
}
