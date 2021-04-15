package com.hotelreservation;

public class Hotels {
    String hotelName;
    int regularWeekdayRates;
    int regularWeekendRates;


    public String getHotelName()
    {
        return hotelName;
    }
    public void setHotelName(String hotelName)
    {
        this.hotelName = hotelName;
    }

    public int getRegularWeekdayRates() {
        return this.regularWeekdayRates;
    }

    public void setRegularWeekdayRates(int regularWeekdayRates) {
        this.regularWeekdayRates = regularWeekdayRates;
    }

    public int getRegularWeekendRates() {
        return this.regularWeekendRates;
    }

    public void setRegularWeekendRates(int regularWeekendRates) {
        this.regularWeekendRates = regularWeekendRates;
    }
}
