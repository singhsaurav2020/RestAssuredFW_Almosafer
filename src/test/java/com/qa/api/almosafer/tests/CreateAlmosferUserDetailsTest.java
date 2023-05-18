package com.qa.api.almosafer.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.api.almosafer.pojo.RoomsInfo;
import com.qa.api.almosafer.pojo.UserDetails_HotelsChalets;
import com.qa.api.almosafer.restclient.RestClient;
import com.qa.api.almosafer.util.PropertyHandler;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateAlmosferUserDetailsTest {

	@Test(priority = 4)
	public void postAlmosaferAPI4() {

		List<Integer> list = new ArrayList<Integer>();

		RoomsInfo room = new RoomsInfo(Integer.parseInt(PropertyHandler.getData("adultsCount")), list);
		UserDetails_HotelsChalets userdetails = new UserDetails_HotelsChalets(PropertyHandler.getData("checkIn"),
				PropertyHandler.getData("checkOut"), Arrays.asList(room), null, null,
				PropertyHandler.getData("query_searchasync"));

		Response getResponse = RestClient.doPost("JSON", PropertyHandler.getData("BaseURI"),
				PropertyHandler.getData("path_searchasync"), PropertyHandler.getData("Token"), null, true, userdetails);
		AssertJUnit.assertEquals(200, getResponse.statusCode());
		System.out.println("Session ID: " + getResponse.jsonPath().getString("sId"));
	}

	@Test(priority = 5)
	public void postAlmosaferAPI5() throws IOException, ParseException {
		RestAssured.baseURI = PropertyHandler.getData("BaseURI");

		Response getResponse = given().header("token", PropertyHandler.getData("bearerToken")).accept(ContentType.JSON)
				.contentType(ContentType.JSON).and().body(new File(PropertyHandler.getData("jsonPath_SearchFlight")))
				.when().post(PropertyHandler.getData("basePath_FlightSearchAsyncResult")).then().extract().response();

		// convert JSON to string
		JsonPath j = new JsonPath(getResponse.asString());

		// length of JSON Location array
		int s = j.getInt("res.size()");
		for (int i = 1; i <= s; i++) {
			System.out.println(i + "/" + s + " Flight details");
			System.out.println("status: " + getResponse.jsonPath().getString("res.status[" + i + "]"));
			System.out.println(
					"originId: " + getResponse.jsonPath().getString("res.data.searchRequest.leg.originId[" + i + "]"));
			System.out.println("destinationId: "
					+ getResponse.jsonPath().getString("res.data.searchRequest.leg.destinationId[" + i + "]"));
			System.out.println("departure: "
					+ getResponse.jsonPath().getString("res.data.searchRequest.leg.departure[" + i + "]"));
		}

		System.out.println("Response ==>" + getResponse.statusCode());
		System.out.println("Server ==>" + getResponse.getHeader("Server"));

	}

}
