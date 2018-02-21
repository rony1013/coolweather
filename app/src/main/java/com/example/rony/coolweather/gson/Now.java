package com.example.rony.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rony on 2/19/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
