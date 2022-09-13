package org.Testing.Payload;

import org.json.simple.JSONObject;

public class JsonBodyData {

	public static JSONObject data= new JSONObject();

	public static JSONObject GetBodyData() {
		

		data.put("FirstName", "Sajjad");
		data.put("LastName", "Khan");
		data.put("ID", "26off");
		data.put("Country", "India");
		data.put("State", "Maharashtra");
		data.put("City", "Pune");

		return data;

	}

	public static JSONObject PUTdata() {
		
		data.put("name", "morpheus");
		data.put("job", "Software engineer");

		return data;

	}
	
	public static JSONObject PATCHdata() {
		data.put("name","morpheus");
		data.put("job","QA Engineer");
		return data;
	}
}
