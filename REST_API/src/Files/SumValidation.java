package Files;
import Files.Payload;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class SumValidation {

	@Test
	public void sumValidation() 
	{
		JsonPath js = new JsonPath(Payload.CoursePrice());
		 int count = js.getInt("courses.size()");
		int sum = 0;
		for(int i=0;i<count;i++)
		{
			int price = js.get("courses["+i+"].price");
			int copies = js.get("courses["+i+"].copies");
			int amount = price*copies;
			System.out.println(amount);
			sum = sum +amount;
			
			
		}
		
		System.out.println(sum);
		 int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		 Assert.assertEquals(sum, purchaseAmount);
	}
}