package com.qa.api.almosafer.pojo;

// POJO Templete for USER
public class apiDetails {
	// class variables
	private String BaseURI;
	private String basePath;
	private String basePath_FlightsHotelChalets;
	private String basePath_HotelsChalets;

	// constructor
	public apiDetails(String BaseURI, String basePath, String basePath_FlightsHotelChalets, String basePath_HotelsChalets) {
		this.BaseURI = BaseURI;
		this.basePath = basePath;
		this.basePath_FlightsHotelChalets = basePath_FlightsHotelChalets;
		this.basePath_HotelsChalets = basePath_HotelsChalets;
	}

	// getter & setter methods
	public String getBaseURI() {
		return BaseURI;
	}

	public void setBaseURI(String BaseURI) {
		this.BaseURI = BaseURI;
	}

	public String getbasePath() {
		return basePath;
	}

	public void setbasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getbasePath_FlightsHotelChalets() {
		return basePath_FlightsHotelChalets;
	}

	public void setbasePath_FlightsHotelChalets(String basePath_FlightsHotelChalets) {
		this.basePath_FlightsHotelChalets = basePath_FlightsHotelChalets;
	}

	public String getbasePath_HotelsChalets() {
		return basePath_HotelsChalets;
	}

	public void setbasePath_HotelsChalets(String basePath_HotelsChalets) {
		this.basePath_HotelsChalets = basePath_HotelsChalets;
	}
}
