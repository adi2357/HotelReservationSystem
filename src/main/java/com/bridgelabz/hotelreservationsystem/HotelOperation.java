package com.bridgelabz.hotelreservationsystem;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelOperation {

	public static final Scanner SC = new Scanner(System.in);

	private List<Hotel> hotelList;

	public HotelOperation() {
		hotelList = new ArrayList<Hotel>();
	}

	public void addHotel() {
		Hotel newHotel = new Hotel();
		System.out.println("Enter hotel name : ");
		newHotel.setHotelName(SC.next());
		System.out.println("Enter Weekday rate for regular customer : ");
		newHotel.setWeekdayRateForRegularCustomer(SC.nextInt());
		System.out.println("Enter Weekend rate for regular customer : ");
		newHotel.setWeekendRateForRegularCustomer(SC.nextInt());
		hotelList.add(newHotel);
	}

	public void displayHotels() {
		if (hotelList.size() == 0)
			System.out.println("No Hotels in the database");
		else {
			for (Hotel hotel : hotelList)
				System.out.println(hotel.toString());
		}
	}

	public void findCheapestHotel() throws DateTimeParseException {

		System.out.println("Enter start date and end date int the format (yyyy-MM-dd),(yyyy-MM-dd)");
		String line = SC.next();
		String[] input = line.split(",");

		LocalDate startDate = LocalDate.parse(input[0]);
		LocalDate endDate = LocalDate.parse(input[1]);
		endDate = endDate.plusDays(1);

		int totalDateDifference = (int) ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("totalDateDifference  " + totalDateDifference);
		int cheapestRate = 999999999;
		String cheapestHotel = "";
		int noOfWeekdends = 0;
		int noOfWeekdays = 0;

		while (startDate.compareTo(endDate) != 0) {
			switch (DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK))) {
			case SATURDAY:
				++noOfWeekdends;
				break;
			case SUNDAY:
				++noOfWeekdends;
				break;
			}
			startDate = startDate.plusDays(1);
		}

		noOfWeekdays = totalDateDifference - noOfWeekdends;
		for (Hotel hotel : hotelList) {
			int rateForHotel = (noOfWeekdays * hotel.getWeekdayRateForRegularCustomer())
					+ (noOfWeekdends * hotel.getWeekendRateForRegularCustomer());
			if (rateForHotel < cheapestRate) {
				cheapestRate = rateForHotel;
				cheapestHotel = hotel.getHotelName();
			}
		}
		if (cheapestRate != 999999999)
			System.out.println("Cheapest Hotel : \n" + cheapestHotel + ", Total Rates: " + cheapestRate);
	}

}
