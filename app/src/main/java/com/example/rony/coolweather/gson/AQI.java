package com.example.rony.coolweather.gson;

/**
 * Created by rony on 2/19/18.
 */

public class AQI {

    public AQICity city;  //because java and json name are same, it don't use @SerializedName

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
