package com.jstevenunez.androidstarter.bean;

/**
 * Created by steven on 2/23/2015.
 */
public class StateTerritory {
    private String country;
    private String name;
    private String abbr;
    private String area;
    private String largest_city;
    private String capital;

    public StateTerritory() {
    }

    public StateTerritory(String country, String name, String abbr, String area, String largest_city, String capital) {
        this.country = country;
        this.name = name;
        this.abbr = abbr;
        this.area = area;
        this.largest_city = largest_city;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getArea() {
        return area;
    }

    public String getLargest_city() {
        return largest_city;
    }

    public String getCapital() {
        return capital;
    }
}
