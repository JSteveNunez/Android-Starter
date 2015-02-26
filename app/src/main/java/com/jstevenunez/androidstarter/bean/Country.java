package com.jstevenunez.androidstarter.bean;

/**
 * Created by steven on 2/23/2015.
 */
public class Country {
    private String name;
    private String alpha2Code;
    private String alpha3Code;

    public Country() {
    }

    public Country(String name, String alpha2Code, String alpha3Code) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
    }

    public String getName() {
        return name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }
}
