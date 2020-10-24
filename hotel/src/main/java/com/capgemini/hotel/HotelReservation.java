package com.capgemini.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation 
{
	private List<Hotel> hotelList = new ArrayList<Hotel>();
	
	public boolean addHotel(String hotelName, int regularCustomerRate) {
		Hotel hotel = new Hotel(hotelName,regularCustomerRate);
		hotelList.add(hotel);
		return true;
	}
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	HotelReservation hotelReservation = new HotelReservation();
    	
        System.out.println( "Welcome to Hotel Reservation System Program" );
        System.out.println("Add a hotel \nEnter hotel name:");
        String hotelName = sc.nextLine();
        System.out.println("Enter regular customer rate:");
        int regularCustomerRate = Integer.parseInt(sc.nextLine());
        hotelReservation.addHotel(hotelName,regularCustomerRate);
    }
}