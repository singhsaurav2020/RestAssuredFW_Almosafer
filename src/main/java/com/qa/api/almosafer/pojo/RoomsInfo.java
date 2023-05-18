package com.qa.api.almosafer.pojo;

import java.util.List;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class RoomsInfo {

	private Integer adultsCount;
	private List<Integer> kidsAges;

	/**
	 *
	 * @param adultsCount
	 * @param list
	 */
	public RoomsInfo(Integer adultsCount, List<Integer> list) {
		super();
		this.adultsCount = adultsCount;
		this.kidsAges = list;
	}

	public Integer getAdultsCount() {
		return adultsCount;
	}

	public void setAdultsCount(int adultsCount) {
		this.adultsCount = adultsCount;
	}

	public List<Integer> getKidsAges() {
		return kidsAges;
	}

	public void setKidsAges(List<Integer> kidsAges) {
		this.kidsAges = kidsAges;
	}

}
