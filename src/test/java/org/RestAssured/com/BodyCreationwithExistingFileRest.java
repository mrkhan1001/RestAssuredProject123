package org.RestAssured.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;

import io.restassured.path.json.JsonPath;

 

public class BodyCreationwithExistingFileRest {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("./org.RestAssured.com/body.json");
		FileReader fr= new FileReader(file);
		JsonPath jt=new JsonPath(fr);

	}

}
