package com.bookstore.it;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

public class TextBooksTestIntegration extends BaseTest {
	
	@Test
	public void testGetBooks() {
		Response response = given().spec(restClient.getRecSpec())
								   .basePath("/books")
								   .get("/textbooks");
		
		//JsonPath getResponse = new JsonPath(response.asString());
		//assertThat("1001",getResponse.get("[0].id"));
		System.out.print(response.asString());
	}
}
