package org.RestAssured.com;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class GetMethod {

	public static void main(String[] args) {
		
		JSONObject priaddress=new JSONObject();
		priaddress.put("H no", "12");
		priaddress.put("street", "bandstant");
		priaddress.put("locality", "navi mumbai");
		priaddress.put("pin", "123456");
		
		JSONObject scaddress=new JSONObject();
		scaddress.put("office", "122");
		scaddress.put("street", "bandstant");
		scaddress.put("locality", "navi mumbai");
		scaddress.put("pin", "123456999");
		
		
		JSONArray arry=new JSONArray();
		arry.add(0, priaddress);
		arry.add(1, scaddress);
		
		JSONObject json=new JSONObject();
		
		json.put("name", "Sajjad");
		json.put("id", "8446");
		json.put("Location", "pune");
		json.put("job", "Software Tester");
		json.put("Address info", arry);
		
		baseURI ="https://reqres.in/api";
		
	Response res=given()
	.contentType(ContentType.JSON)
	
	.body(json.toString())
	.when()
	.post("/users");
	
	
	
	System.out.println(res.getContentType());
	System.out.println(res.getStatusCode());
	System.out.println(res.asString());
	
	}

	
	public static JSONObject data() {
		JSONObject json=new JSONObject();
		
	json.put("name", "Sajjad");
	json.put("id", "8446");
	json.put("Location", "pune");
	json.put("job", "Software Tester");	
	
	return json;
		
	}
	
	
}
