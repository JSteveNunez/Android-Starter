package com.jstevenunez.androidstarter.restApi;

import com.jstevenunez.androidstarter.bean.Country;
import com.jstevenunez.androidstarter.bean.RestMultipleResultResponse;
import com.jstevenunez.androidstarter.bean.RestResponse;
import com.jstevenunez.androidstarter.bean.SearchText;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by steven on 2/23/2015.
 */
public interface CountrySearchRestApi {

    @GET("/country/get/all")
    public RestMultipleResultResponse<Country> getListOfAllCountries();

    @GET("/country/get/iso2code/{alpha2Code}")
    public RestResponse<Country> searchCountryByIso2(@Path("alpha2Code") String alpha2Code);

    @GET("/country/get/iso3code/{alpha3Code}")
    public RestResponse<Country> searchCountryByIso3(@Path("alpha3Code") String alpha3Code);

    @GET("/country/search")
    public RestMultipleResultResponse<Country> searchCountryByText(@Query("text") String searchText);

    @GET("/country/search")
    public RestMultipleResultResponse<Country> searchCountryByText(@Body SearchText searchText);
}
