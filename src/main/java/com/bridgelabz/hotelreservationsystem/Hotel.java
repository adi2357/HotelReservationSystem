package com.bridgelabz.hotelreservationsystem;

public class Hotel {

	String hotelName;
	int rateForRegularCustomer;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRateForRegularCustomer() {
		return rateForRegularCustomer;
	}

	public void setRateForRegularCustomer(int rateForRegularCustomer) {
		this.rateForRegularCustomer = rateForRegularCustomer;
	}
	
	@Override
	public	String toString() {
		return (hotelName+"\t"+rateForRegularCustomer+"\t");
		
	}

}
