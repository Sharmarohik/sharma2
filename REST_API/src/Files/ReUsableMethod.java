package Files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethod{

	public static JsonPath rawTOJson(String response) 
	{
		JsonPath js1 = new JsonPath(response);
	return js1;

	}

}
