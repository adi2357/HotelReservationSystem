package com.bridgelabz.hotelreservationsystem;

import java.util.Scanner;

public class HotelReservationMain {

	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		
		HotelOperation operationObject=new HotelOperation();
		
		do {
			System.out.println("1. Add Hotel");
			System.out.println("2. Display Hotels");
			System.out.println("3. Exit");
			System.out.println("Enter your choice : ");
			int choice=SC.nextInt();
			if(choice==3)
				break;
			switch(choice) {
			case 1:
				operationObject.addHotel();
				break;
			case 2:
				operationObject.displayHotels();
				break;				
			default:
				System.out.println("Invalid option selected");
			}			
		}while(true);		

	}

}
