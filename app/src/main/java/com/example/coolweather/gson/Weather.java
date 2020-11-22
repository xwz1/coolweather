package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;//状态

    public Basic basic;//基本信息

    public AQI aqi;//pm25

    public Now now;//现在天气情况

    public Suggestion suggestion; //生活建议

    @SerializedName("daily_forecast")//天气预报
    public List<Forecast> forecastList;
}
