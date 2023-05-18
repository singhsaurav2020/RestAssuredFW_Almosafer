package com.qa.api.almosafer.pojo;

import java.util.List;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class UserDetails_HotelsChalets {

	private String checkIn;
	private String checkOut;
	private List<RoomsInfo> roomsInfo;
	private Object searchInfo;
	private Object crossSellDetail;
	private String query;

	/**
	 *
	 * @param room
	 * @param checkIn
	 * @param searchInfo
	 * @param crossSellDetail
	 * @param query
	 * @param checkOut
	 */
	public UserDetails_HotelsChalets(String checkIn, String checkOut, List<RoomsInfo> roomsInfo, Object searchInfo,
			Object crossSellDetail, String query) {
		super();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.roomsInfo = roomsInfo;
		this.searchInfo = searchInfo;
		this.crossSellDetail = crossSellDetail;
		this.query = query;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public List<RoomsInfo> getRoomsInfo() {
		return roomsInfo;
	}

	public void setRoomsInfo(List<RoomsInfo> roomsInfo) {
		this.roomsInfo = roomsInfo;
	}

	public Object getSearchInfo() {
		return searchInfo;
	}

	public void setSearchInfo(Object searchInfo) {
		this.searchInfo = searchInfo;
	}

	public Object getCrossSellDetail() {
		return crossSellDetail;
	}

	public void setCrossSellDetail(Object crossSellDetail) {
		this.crossSellDetail = crossSellDetail;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}