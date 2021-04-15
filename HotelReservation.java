package com.hotelreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class HotelReservation {

    public static void main(String[] args) throws ParseException {
        System.out.println("welcome to Hotel Reservation Program ");
        int calculate;
        Hotels lakewoodHotel = new Hotels();

        lakewoodHotel.setHotelName("Lakewood");
        lakewoodHotel.setRegularWeekdayRates(110);
        lakewoodHotel.setRegularWeekendRates(90);

        Hotels bridgewoodHotel = new Hotels();
        bridgewoodHotel.setHotelName("Bridgewoodwood");
        bridgewoodHotel.setRegularWeekdayRates(160);
        bridgewoodHotel.setRegularWeekendRates(60);

        Hotels ridgewoodHotel = new Hotels();
        ridgewoodHotel.setHotelName("Ridgewoodwood");
        ridgewoodHotel.setRegularWeekdayRates(220);
        ridgewoodHotel.setRegularWeekendRates(150);
	
      }
}