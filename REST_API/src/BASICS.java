import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payload;
import Files.ReUsableMethod;

public class BASICS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Validating if add is working properly/as expected?
		
		// GIven= All GIven Details
		//When= Submit the API 
		//THEN = Validating the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server","Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		JsonPath js= new JsonPath(response);//  FOR parcing Json 
		String placeID=js.getString("place_id");
		System.out.println(placeID);
		
		//Update PLace
		
		String NewAddress = "AFRICA POINT VIEW";
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeID+"\",\r\n"
				+ "\"address\":\""+NewAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//Get PLace 
		
		
		String getPlaceResponse = given().log().all().queryParam("key","qaclick123")
		.queryParam("place_id",placeID)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = ReUsableMethod.rawTOJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress,NewAddress );
	}

}
