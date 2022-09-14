package Files;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexjsonPath {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js = new JsonPath(Payload.CoursePrice());

		// 1 Number of Courses

		int count = js.getInt("courses.size()");
		System.out.println(count);
		// 2get purchase amount
		int TotalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(TotalAmount);
		// 3 Get title of the first course
		String Title = js.getString("courses[0].title");
		System.out.println(Title);
		
		for (int i=0;i<count;i++)
		{
			 String coursesTitles = js.get("courses["+i+"].title");
			 System.out.println(coursesTitles);
			System.out.println(js.get("courses["+i+"].price").toString());
			
		}
		//print no of copies sold by RPA
		
		for(int i=0;i<count;i++)
		{
			 String courseTitles = js.get("courses["+i+"].title");
			 if(courseTitles.equalsIgnoreCase("rohik"))
			 {
				 //Copies Sold
				int copies = js.get("courses["+i+"].copies");
				System.out.println("Number of Copies Sold BY ROHIK");
				System.out.println(copies);
				 break;
			 }
				 
		}
	}}


