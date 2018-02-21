package com.example.rony.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rony on 2/19/18.
 */

public class Basic {

    @SerializedName("city")  //let JSON and Java mapping
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
