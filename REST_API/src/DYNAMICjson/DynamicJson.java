package DYNAMICjson;

import org.testng.annotations.Test;


import Files.Payload;
import Files.ReUsableMethod;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DynamicJson {
	@Test
	
	public void addBook() 
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = 
		given().log().all()
		.header("Content-Type", "application/json").
	    body(Payload.Addbook("adsfs","6464")).
	    when()
	    .
	    post("/Library/Addbook.php")
	    .
	    then().assertThat().statusCode(200)
	    .
	    extract().response().asString();
		JsonPath js = ReUsableMethod.rawTOJson(response);
		String id = js.get("ID");
		System.out.println(id);
	}

}
