package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")//舒适建议
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")//洗车
        public String info;
    }

    public class Sport{
        @SerializedName("txt")//运动
        public String info;
    }
}
