package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ruqx on 2017/10/16.
 */

public class Country extends DataSupport {
    private int id;
    private String countyName;
    private String weather;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeather() {
        return weather;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
