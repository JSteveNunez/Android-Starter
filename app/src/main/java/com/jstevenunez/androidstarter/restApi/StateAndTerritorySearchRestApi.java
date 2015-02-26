package com.jstevenunez.androidstarter.restApi;

import com.jstevenunez.androidstarter.bean.RestMultipleResultResponse;
import com.jstevenunez.androidstarter.bean.RestResponse;
import com.jstevenunez.androidstarter.bean.SearchText;
import com.jstevenunez.androidstarter.bean.StateTerritory;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by steven on 2/23/2015.
 */
public interface StateAndTerritorySearchRestApi {

    @GET("/state/get/{countryCode}/all")
    public RestMultipleResultResponse<StateTerritory> getListOfAllStatesForCountryCode(@Path("countryCode") String countryCode);

    @GET("/state/get/{countryCode}/{stateCode}")
    public RestResponse<StateTerritory> searchStateOfACountry(@Path("countryCode") String countryCode,
                                                              @Path("stateCode") String stateCode);

    @GET("/state/search/{countryCode}")
    public RestMultipleResultResponse<StateTerritory> searchState(@Path("countryCode") String countryCode,
                                                                  @Query("text") String searchText);

    @GET("/state/search/{countryCode}")
    public RestMultipleResultResponse<StateTerritory> searchState(@Path("countryCode") String countryCode,
                                                                  @Body SearchText searchText);
}
