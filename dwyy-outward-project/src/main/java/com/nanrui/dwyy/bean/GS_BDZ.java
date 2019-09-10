package com.nanrui.dwyy.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 甘肃变电站详情数据
 */
@Entity(name = "substation_particulars_gs")
@Table(name = "substation_particulars_gs")
public class GS_BDZ implements Serializable {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * PMS起始变电站ID
     */
    @Column(name = "pms_id_start")
    private String pms_id_start;

    /**
     * 起始变电站ID
     */
    @Column(name = "id_start")
    private String id_start;

    /**
     * 起始变电站电压等级
     */
    @Column(name = "dtdj_start")
    private String dtdj_start;

    /**
     * 起始变电站名称
     */
    @Column(name = "name_start")
    private String name_start;

    /**
     * PMS终止变电站ID
     */
    @Column(name = "pms_id_end")
    private String pms_id_end;

    /**
     * 终止变电站ID
     */
    @Column(name = "id_end")
    private String id_end;

    /**
     * 终止变电站电压等级
     */
    @Column(name = "dydj_end")
    private String dydj_end;

    /**
     * 终止变电站名称
     */
    @Column(name = "name_end")
    private String name_end;

    /**
     * 线路ID
     */
    @Column(name = "line_id")
    private String line_id;

    /**
     * 线路名称
     */
    @Column(name = "line_name")
    private String line_name;

    /**
     * 运营效率
     */
    @Column(name = "yyxl")
    private Double yyxl;

    @Column(name = "city")
    private String city;

    @Column(name = "city_code")
    private String city_code;

    public GS_BDZ(String pms_id_start, String id_start, String dtdj_start, String name_start, String pms_id_end, String id_end, String dydj_end, String name_end, String line_id, String line_name, Double yyxl, String city, String city_code) {
        this.pms_id_start = pms_id_start;
        this.id_start = id_start;
        this.dtdj_start = dtdj_start;
        this.name_start = name_start;
        this.pms_id_end = pms_id_end;
        this.id_end = id_end;
        this.dydj_end = dydj_end;
        this.name_end = name_end;
        this.line_id = line_id;
        this.line_name = line_name;
        this.yyxl = yyxl;
        this.city = city;
        this.city_code = city_code;
    }

    public GS_BDZ() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPms_id_start() {
        return pms_id_start;
    }

    public void setPms_id_start(String pms_id_start) {
        this.pms_id_start = pms_id_start;
    }

    public String getId_start() {
        return id_start;
    }

    public void setId_start(String id_start) {
        this.id_start = id_start;
    }

    public String getDtdj_start() {
        return dtdj_start;
    }

    public void setDtdj_start(String dtdj_start) {
        this.dtdj_start = dtdj_start;
    }

    public String getName_start() {
        return name_start;
    }

    public void setName_start(String name_start) {
        this.name_start = name_start;
    }

    public String getPms_id_end() {
        return pms_id_end;
    }

    public void setPms_id_end(String pms_id_end) {
        this.pms_id_end = pms_id_end;
    }

    public String getId_end() {
        return id_end;
    }

    public void setId_end(String id_end) {
        this.id_end = id_end;
    }

    public String getDydj_end() {
        return dydj_end;
    }

    public void setDydj_end(String dydj_end) {
        this.dydj_end = dydj_end;
    }

    public String getName_end() {
        return name_end;
    }

    public void setName_end(String name_end) {
        this.name_end = name_end;
    }

    public String getLine_id() {
        return line_id;
    }

    public void setLine_id(String line_id) {
        this.line_id = line_id;
    }

    public String getLine_name() {
        return line_name;
    }

    public void setLine_name(String line_name) {
        this.line_name = line_name;
    }

    public Double getYyxl() {
        return yyxl;
    }

    public void setYyxl(Double yyxl) {
        this.yyxl = yyxl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }
}
