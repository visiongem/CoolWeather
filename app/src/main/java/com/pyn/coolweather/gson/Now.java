package com.pyn.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * describtion:
 * Created by pengyn on 2017/1/3.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }

}
