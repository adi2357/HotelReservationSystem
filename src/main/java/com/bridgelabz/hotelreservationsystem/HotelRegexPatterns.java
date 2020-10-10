package com.bridgelabz.hotelreservationsystem;

public class HotelRegexPatterns {

	public static final String HOTEL_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,9}";
	public static final String HOTEL_RATING_PATTERN = "^[1-5]{1}$";
	public static final String PER_DAY_CUSTOMER_RATE_PATTERN = "^((?!(0))[0-9]{3})$";
}
