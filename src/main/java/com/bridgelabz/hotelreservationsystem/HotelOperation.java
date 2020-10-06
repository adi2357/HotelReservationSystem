package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelOperation {

	private List<Hotel> hotelList;

	public HotelOperation() {
		hotelList = new ArrayList<Hotel>();
	}

	public void addHotel() {
		Scanner sc = new Scanner(System.in);
		Hotel newHotel = new Hotel();
		System.out.println("Enter hotel name : ");
		newHotel.setHotelName(sc.next());
		System.out.println("Enter rate for regular customer : ");
		newHotel.setRateForRegularCustomer(sc.nextInt());
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

}
