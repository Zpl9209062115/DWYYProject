package com.nanrui.dwyy.bean;

import java.io.Serializable;
import java.util.Map;

public class Scene_City implements Serializable {

    private String cityName;

    private Integer courtCount;

    private Double avgPerCount;

    public Scene_City(String cityName, Integer courtCount, Double avgPerCount) {
        this.cityName = cityName;
        this.courtCount = courtCount;
        this.avgPerCount = avgPerCount;
    }

    public Scene_City() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCourtCount() {
        return courtCount;
    }

    public void setCourtCount(Integer courtCount) {
        this.courtCount = courtCount;
    }

    public Double getAvgPerCount() {
        return avgPerCount;
    }

    public void setAvgPerCount(Double avgPerCount) {
        this.avgPerCount = avgPerCount;
    }
}
