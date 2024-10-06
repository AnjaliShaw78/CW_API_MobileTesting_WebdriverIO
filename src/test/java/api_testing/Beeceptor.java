package api_testing;

import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.util.JSONPObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;


public class Beeceptor {
	@Test
	public void GetList() {
		//GET: Fetch a list of products available in the e-commerce store.
		given().contentType("application/json").get("https://fake-store-api.mock.beeceptor.com/api/products").then().statusCode(200).log().all();
	}
	@Test
	public void RetrieveAList() {
		//GET: Retrieve a list of shopping buckets/carts. Only one object is returned to indicate the logged-in user.

		given().contentType("application/json").get("https://fake-store-api.mock.beeceptor.com/api/users").then().statusCode(200).log().all();
	}
	@Test
	public void OrderStatus() {
		//GET: Check order status and retrieve order details.
		given().contentType("application/json").get("https://fake-store-api.mock.beeceptor.com/api/carts").then().statusCode(200).log().all();
		
	}
	@Test
	public void  ListOfOrders() {
		//GET: Get a list of orders placed by users and their status.

		given().contentType("application/json").get("https://fake-store-api.mock.beeceptor.com/api/orders/status\\?order_id=1").then().statusCode(200).log().all();

	}
	@Test
	public void ListOfUserOrders() {
		given().contentType("application/json").get("https://fake-store-api.mock.beeceptor.com/api/orders").then().statusCode(200).log().all();
		
	}
	@Test
	public void UpdatedOrders() {
		//POST/PUT: Create a new order or update an existing one.
		given().contentType(ContentType.JSON).put("https://fake-store-api.mock.beeceptor.com/api/orders").then().statusCode(200).log().all();
		
	}

}


