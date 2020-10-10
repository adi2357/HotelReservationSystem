package com.bridgelabz.hotelreservationsystem;

public class HotelRegistrationException extends Exception {

	public enum HotelRegistrationExceptionType {
		INVALID_HOTEL_NAME, INVALID_HOTEL_RATING, INVALID_PER_DAY_CUSTOMER_RATE;
	}

	HotelRegistrationExceptionType type;

	public HotelRegistrationException(HotelRegistrationExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
