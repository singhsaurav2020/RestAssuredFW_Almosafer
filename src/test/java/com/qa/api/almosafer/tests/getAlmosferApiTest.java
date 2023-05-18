package com.qa.api.almosafer.tests;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;

import com.qa.api.almosafer.restclient.RestClient;
import com.qa.api.almosafer.util.PropertyHandler;

import io.restassured.response.Response;


public class getAlmosferApiTest {

	@Test(priority = 1)
	public void getAlmosaferHomePageAPI() {

		Response response = RestClient.doGet("JSON", PropertyHandler.getData("BaseURI"),
				PropertyHandler.getData("path_en"), null, null, true);
		AssertJUnit.assertEquals(200, response.statusCode());
	}

	@Test(priority = 2)
	public void getAlmosaferFlightHotelChaletsPageAPI() {

		Response response = RestClient.doGet("JSON", PropertyHandler.getData("BaseURI"),
				PropertyHandler.getData("path_enflightshotelsChalets"), null, null, true);
		AssertJUnit.assertEquals(200, response.statusCode());
	}

	@Test(priority = 3)
	public void getAlmosaferHotelChaletsPageAPI() {
		Response response = RestClient.doGet("JSON", PropertyHandler.getData("BaseURI"),
				PropertyHandler.getData("path_hotelsChalets"), null, null, true);
		AssertJUnit.assertEquals(200, response.statusCode());
	}
}
