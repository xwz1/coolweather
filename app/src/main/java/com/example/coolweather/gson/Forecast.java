package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;
    @SerializedName("tmp") //最高最低
    public Temperature temperature;

    @SerializedName("cond")//天气
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }


}
