package com.capgemini.hotel;

/**
 *
 *
 */
public class Hotel {
	private String hotelName;
	private int regularCustomerRate;
	
	public Hotel(String hotelName,int regularCustomerRate) {
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getregularCustomerRate() {
		return regularCustomerRate;
	}

	public void setregularCustomerRate(int regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}
}

