package com.hotelmangementprogram.hotelmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class HotelManagementApplication {
	private ArrayList<String> pendingOrders;
	private double balance;
	private Date currentDate;

	/**
	 * Initializes the whole HotelManagement system:
	 * Connects to the database and loads all the necessary data.
	 */
	public void setUp(){

	}

	/**
	 * Shuts down the whole HotelManagement system:
	 * Saves all the data to the database and disconnects.
	 */
	public void shutdown(){

	}

	/**
	 * Simulates the transition to the next day.
	 */
	public void nextDay(){

	}

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementApplication.class, args);
	}

}
