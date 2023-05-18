package com.qa.api.almosafer.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.qa.api.almosafer.util.TestUtil;

public class UserInfo {

	public static String createUserWithFullJson() {

		List<Integer> list = new ArrayList<Integer>();

		RoomsInfo room = new RoomsInfo(2, list);
		UserDetails_HotelsChalets userdetails = new UserDetails_HotelsChalets("2023-06-01", "2023-06-02",
				Arrays.asList(room), null, null, "Chalets%2B");

		String UserJsonPayload = TestUtil.getSerializedJSON(userdetails);
		return UserJsonPayload;
	}
}