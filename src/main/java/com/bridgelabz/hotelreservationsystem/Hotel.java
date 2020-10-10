package com.bridgelabz.hotelreservationsystem;

import com.bridgelabz.hotelreservationsystem.HotelRegistrationException.HotelRegistrationExceptionType;

public class Hotel {

	String hotelName;
	int weekdayRateForRegularCustomer;
	int weekendRateForRegularCustomer;
	int weekdayRateForRewardCustomer;
	int weekendRateForRewardCustomer;
	int rating;
	int weekdayRateForCustomer;
	int weekendRateForCustomer;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) throws HotelRegistrationException {
		boolean isValidHotelName = isValid(hotelName, HotelRegexPatterns.HOTEL_NAME_PATTERN);
		if (isValidHotelName)
			this.hotelName = hotelName;
		else
			throw new HotelRegistrationException(HotelRegistrationExceptionType.INVALID_HOTEL_NAME,
					"Invalid Hotel Name");
	}

	public int getWeekdayRateForRegularCustomer() {
		return weekdayRateForRegularCustomer;
	}

	public void setWeekdayRateForRegularCustomer(int weekdayRateForRegularCustomer) throws HotelRegistrationException {
		boolean isValidPerDayRate = isValid(Integer.toString(weekdayRateForRegularCustomer),
				HotelRegexPatterns.PER_DAY_CUSTOMER_RATE_PATTERN);
		if (isValidPerDayRate)
			this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
		else
			throw new HotelRegistrationException(HotelRegistrationExceptionType.INVALID_PER_DAY_CUSTOMER_RATE,
					"Invalid Weekday Rate For Regular Customer");
	}

	public int getWeekendRateForRegularCustomer() {
		return weekendRateForRegularCustomer;
	}

	public void setWeekendRateForRegularCustomer(int weekendRateForRegularCustomer) throws HotelRegistrationException {
		boolean isValidPerDayRate = isValid(Integer.toString(weekendRateForRegularCustomer),
				HotelRegexPatterns.PER_DAY_CUSTOMER_RATE_PATTERN);
		if (isValidPerDayRate)
			this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
		else
			throw new HotelRegistrationException(HotelRegistrationExceptionType.INVALID_PER_DAY_CUSTOMER_RATE,
					"Invalid Weekend Rate For Regular Customer");
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) throws HotelRegistrationException {
		boolean isValidRating = isValid(Integer.toString(rating), HotelRegexPatterns.HOTEL_RATING_PATTERN);
		if (isValidRating)
			this.rating = rating;
		else
			throw new HotelRegistrationException(HotelRegistrationExceptionType.INVALID_HOTEL_RATING,
					"Invalid Hotel Rating");
	}

	public int getWeekdayRateForRewardCustomer() {
		return weekdayRateForRewardCustomer;
	}

	public void setWeekdayRateForRewardCustomer(int weekdayRateForRewardCustomer) throws HotelRegistrationException {
		boolean isValidPerDayRate = isValid(Integer.toString(weekdayRateForRewardCustomer),
				HotelRegexPatterns.PER_DAY_CUSTOMER_RATE_PATTERN);
		if (isValidPerDayRate)
			this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;
		else
			throw new HotelRegistrationException(HotelRegistrationExceptionType.INVALID_PER_DAY_CUSTOMER_RATE,
					"Invalid Weekday Rate For Reward Customer");
	}

	public int getWeekendRateForRewardCustomer() {
		return weekendRateForRewardCustomer;
	}

	public void setWeekendRateForRewardCustomer(int weekendRateForRewardCustomer) throws HotelRegistrationException {
		boolean isValidPerDayRate = isValid(Integer.toString(weekendRateForRewardCustomer),
				HotelRegexPatterns.PER_DAY_CUSTOMER_RATE_PATTERN);
		if (isValidPerDayRate)
			this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
		else
			throw new HotelRegistrationException(HotelRegistrationExceptionType.INVALID_PER_DAY_CUSTOMER_RATE,
					"Invalid Weekend Rate For Reward Customer");
	}

	public int getWeekdayRateForCustomer(int customerType) {
		if (customerType == 1)
			return weekdayRateForRegularCustomer;
		else
			return weekdayRateForRewardCustomer;
	}

	public int getWeekendRateForCustomer(int customerType) {
		if (customerType == 1)
			return weekendRateForRegularCustomer;
		else
			return weekendRateForRewardCustomer;
	}

	@Override
	public String toString() {
		return (hotelName + "\t" + weekdayRateForRegularCustomer + "\t" + weekendRateForRegularCustomer + "\t" + rating
				+ "\t" + weekdayRateForRewardCustomer + "\t" + weekendRateForRewardCustomer);
	}

	public boolean isValid(String field, String pattern) {
		HotelFieldTest isValid = (entry, regex) -> entry.matches(regex);
		return isValid.test(field, pattern);
	}

}
