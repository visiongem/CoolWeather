package com.pyn.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * describtion:
 * Created by pengyn on 2017/1/3.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }

}
