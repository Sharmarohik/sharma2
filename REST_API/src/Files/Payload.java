package Files;

public class Payload {

	public static String AddPlace()
	
	{
		return"{ \"location\": {\r\n"
				+ "     \"lat\": -38.383494, \"lng\": 33.427362 }, \r\n"
				+ "     \"accuracy\": 50, \r\n"
				+ "     \"name\": \"Frontline house\", \r\n"
				+ "     \"phone_number\": \"(+91) 983 893 3937\", \r\n"
				+ "     \"address\": \"29, side layout, cohen 07\",\r\n"
				+ "      \"types\": [ \"shoe park\", \"shop\"\r\n"
				+ "],\r\n"
				+ "\"website\": \"http://google.com\",\r\n"
				+ "\"language\": \"French-IN\"\r\n"
				+ "}";

	
	}
              public  static String CoursePrice()
              
    {
return"{\r\n"
		+ "\r\n"
		+ "\"dashboard\": {\r\n"
		+ "\r\n"
		+ "\"purchaseAmount\": 1900,\r\n"
		+ "\r\n"
		+ "\"website\": \"rahulshettyacademy.com\"\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "\"courses\": [\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"Selenium Python\",\r\n"
		+ "\r\n"
		+ "\"price\": 50,\r\n"
		+ "\r\n"
		+ "\"copies\": 6\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"Cypress\",\r\n"
		+ "\r\n"
		+ "\"price\": 40,\r\n"
		+ "\r\n"
		+ "\"copies\": 4\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"RPA\",\r\n"
		+ "\r\n"
		+ "\"price\": 45,\r\n"
		+ "\r\n"
		+ "\"copies\": 10\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"ROHik\",\r\n"
		+ "\r\n"
		+ "\"price\": 10,\r\n"
		+ "\r\n"
		+ "\"copies\": 99\r\n"
		+ "\r\n"
		+ "}\r\n"
		+ "]\r\n"
		+ "\r\n"
		+ "}";

}
              public static String Addbook( String aisle, String isbn) 
              {
            	  String payload="{ \"name\":\"Learn Appium Automation with Java\",\r\n"
            	  		+ " \"isbn\":\"bcd\", \r\n"
            	  		+ " \"aisle\":\"2276698\", \r\n"
            	  		+ " \"author\":\"John foe\" \r\n"
            	  		+ " }\r\n" +
            	  		"\r\n"+
            	  		"";
            	  return payload;
              }
              }