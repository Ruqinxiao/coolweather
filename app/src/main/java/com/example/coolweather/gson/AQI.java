package com.example.coolweather.gson;

/**
 * Created by ruqx on 2017/10/17.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
