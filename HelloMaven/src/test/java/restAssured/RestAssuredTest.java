package restAssured;

import java.util.HashMap;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredTest {
	
	
	public class GetTest {
		//@Test
		public void test1() {
			
			Response response = RestAssured.get("https://reqres.in/api/users?page=2");
			System.out.println(	response.getStatusCode());
			System.out.println(	response.getTime());
			System.out.println(	response.getBody().asString());
		}
		
	@Test	
		public void postMethod() {
			
			HashMap data = new HashMap();
			
			data.put("name", "Noman");
			data.put("Job", "Data Engineer");
			
			given()
				.contentType("application/json")
				.body(data)
			
			.when()
				.post("https://reqres.in/api/users")
			
			.then()
				.statusCode(201)
				.body("name",equalTo("Noman"))
				.log().all();
				
			
			
			
		}

	}


}
