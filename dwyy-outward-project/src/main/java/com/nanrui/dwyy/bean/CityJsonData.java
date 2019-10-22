package com.nanrui.dwyy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "json_ws")
@Table(name = "json_ws")
public class CityJsonData implements Serializable {
    @Id
    private String uuid;
    @Column(name = "cityId")
    private String cityId;
    @Column(name = "cityDS")
    private String cityDS;
    @Column(name = "x_coord")
    private Double x_coord;
    @Column(name = "y_coord")
    private Double y_coord;
    @Column(name = "cityWS")
    private String cityWS;

    public CityJsonData(String uuid, String cityId, String cityDS, Double x_coord, Double y_coord, String cityWS) {
        this.uuid = uuid;
        this.cityId = cityId;
        this.cityDS = cityDS;
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.cityWS = cityWS;
    }

    public CityJsonData() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityDS() {
        return cityDS;
    }

    public void setCityDS(String cityDS) {
        this.cityDS = cityDS;
    }

    public Double getX_coord() {
        return x_coord;
    }

    public void setX_coord(Double x_coord) {
        this.x_coord = x_coord;
    }

    public Double getY_coord() {
        return y_coord;
    }

    public void setY_coord(Double y_coord) {
        this.y_coord = y_coord;
    }

    public String getCityWS() {
        return cityWS;
    }

    public void setCityWS(String cityWS) {
        this.cityWS = cityWS;
    }
}
