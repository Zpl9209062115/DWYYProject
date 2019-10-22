package com.nanrui.dwyy.bean;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 运维检修班组相关实体类
 */

@Entity(name = "YWJX_COURT")
@Table(name = "YWJX_COURT")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class YWJX_COURT implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String COURTID;

    /**
     * 班组总数量
     */
    @Column(name = "COURTCOUNT")
    private Integer COURTCOUNT;

    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date DATEUPDATE;

    /**
     * 一月班组数量
     */
    @Column(name = "JAN_COURT_COUNT")
    private Integer JAN_COURT_COUNT;

    /**
     * 二月班组数量
     */
    @Column(name = "FEB_COURT_COUNT")
    private Integer FEB_COURT_COUNT;

    /**
     * 三月班组数量
     */
    @Column(name = "MAR_COURT_COUNT")
    private Integer MAR_COURT_COUNT;

    /**
     *4月班组数量
     */
    @Column(name = "APR_COURT_COUNT")
    private Integer APR_COURT_COUNT;

    /**
     * 5月班组数量
     */
    @Column(name = "MAY_COURT_COUNT")
    private Integer MAY_COURT_COUNT;

    /**
     * 6月班组数量
     */
    @Column(name = "JUN_COURT_COUNT")
    private Integer JUN_COURT_COUNT;

    /**
     * 7月班组数量
     */
    @Column(name = "JUL_COURT_COUNT")
    private Integer JUL_COURT_COUNT;
    /**
     * 8月班组数量
     */
    @Column(name = "AUG_COURT_COUNT")
    private Integer AUG_COURT_COUNT;

    /**
     * 9月班组数量
     */
    @Column(name = "SEPT_COURT_COUNT")
    private Integer SEPT_COURT_COUNT;

    /**
     * 10月班组数量
     */
    @Column(name = "OCT_COURT_COUNT")
    private Integer OCT_COURT_COUNT;
    /**
     * 11月班组数量
     */
    @Column(name = "NOV_COURT_COUNT")
    private Integer NOV_COURT_COUNT;
    /**
     * 12月班组数量
     */
    @Column(name = "DEC_COURT_COUNT")
    private Integer DEC_COURT_COUNT;

    @Column(name = "CITY")
    private String CITY;

    public YWJX_COURT() {
    }

    public YWJX_COURT(Integer COURTCOUNT, Date DATEUPDATE, Integer JAN_COURT_COUNT, Integer FEB_COURT_COUNT, Integer MAR_COURT_COUNT, Integer APR_COURT_COUNT, Integer MAY_COURT_COUNT, Integer JUN_COURT_COUNT, Integer JUL_COURT_COUNT, Integer AUG_COURT_COUNT, Integer SEPT_COURT_COUNT, Integer OCT_COURT_COUNT, Integer NOV_COURT_COUNT, Integer DEC_COURT_COUNT, String CITY) {
        this.COURTCOUNT = COURTCOUNT;
        this.DATEUPDATE = DATEUPDATE;
        this.JAN_COURT_COUNT = JAN_COURT_COUNT;
        this.FEB_COURT_COUNT = FEB_COURT_COUNT;
        this.MAR_COURT_COUNT = MAR_COURT_COUNT;
        this.APR_COURT_COUNT = APR_COURT_COUNT;
        this.MAY_COURT_COUNT = MAY_COURT_COUNT;
        this.JUN_COURT_COUNT = JUN_COURT_COUNT;
        this.JUL_COURT_COUNT = JUL_COURT_COUNT;
        this.AUG_COURT_COUNT = AUG_COURT_COUNT;
        this.SEPT_COURT_COUNT = SEPT_COURT_COUNT;
        this.OCT_COURT_COUNT = OCT_COURT_COUNT;
        this.NOV_COURT_COUNT = NOV_COURT_COUNT;
        this.DEC_COURT_COUNT = DEC_COURT_COUNT;
        this.CITY = CITY;
    }

    public String getCOURTID() {
        return COURTID;
    }

    public void setCOURTID(String COURTID) {
        this.COURTID = COURTID;
    }

    public Integer getCOURTCOUNT() {
        return COURTCOUNT;
    }

    public void setCOURTCOUNT(Integer COURTCOUNT) {
        this.COURTCOUNT = COURTCOUNT;
    }

    public Date getDATEUPDATE() {
        return DATEUPDATE;
    }

    public void setDATEUPDATE(Date DATEUPDATE) {
        this.DATEUPDATE = DATEUPDATE;
    }

    public Integer getJAN_COURT_COUNT() {
        return JAN_COURT_COUNT;
    }

    public void setJAN_COURT_COUNT(Integer JAN_COURT_COUNT) {
        this.JAN_COURT_COUNT = JAN_COURT_COUNT;
    }

    public Integer getFEB_COURT_COUNT() {
        return FEB_COURT_COUNT;
    }

    public void setFEB_COURT_COUNT(Integer FEB_COURT_COUNT) {
        this.FEB_COURT_COUNT = FEB_COURT_COUNT;
    }

    public Integer getMAR_COURT_COUNT() {
        return MAR_COURT_COUNT;
    }

    public void setMAR_COURT_COUNT(Integer MAR_COURT_COUNT) {
        this.MAR_COURT_COUNT = MAR_COURT_COUNT;
    }

    public Integer getAPR_COURT_COUNT() {
        return APR_COURT_COUNT;
    }

    public void setAPR_COURT_COUNT(Integer APR_COURT_COUNT) {
        this.APR_COURT_COUNT = APR_COURT_COUNT;
    }

    public Integer getMAY_COURT_COUNT() {
        return MAY_COURT_COUNT;
    }

    public void setMAY_COURT_COUNT(Integer MAY_COURT_COUNT) {
        this.MAY_COURT_COUNT = MAY_COURT_COUNT;
    }

    public Integer getJUN_COURT_COUNT() {
        return JUN_COURT_COUNT;
    }

    public void setJUN_COURT_COUNT(Integer JUN_COURT_COUNT) {
        this.JUN_COURT_COUNT = JUN_COURT_COUNT;
    }

    public Integer getJUL_COURT_COUNT() {
        return JUL_COURT_COUNT;
    }

    public void setJUL_COURT_COUNT(Integer JUL_COURT_COUNT) {
        this.JUL_COURT_COUNT = JUL_COURT_COUNT;
    }

    public Integer getAUG_COURT_COUNT() {
        return AUG_COURT_COUNT;
    }

    public void setAUG_COURT_COUNT(Integer AUG_COURT_COUNT) {
        this.AUG_COURT_COUNT = AUG_COURT_COUNT;
    }

    public Integer getSEPT_COURT_COUNT() {
        return SEPT_COURT_COUNT;
    }

    public void setSEPT_COURT_COUNT(Integer SEPT_COURT_COUNT) {
        this.SEPT_COURT_COUNT = SEPT_COURT_COUNT;
    }

    public Integer getOCT_COURT_COUNT() {
        return OCT_COURT_COUNT;
    }

    public void setOCT_COURT_COUNT(Integer OCT_COURT_COUNT) {
        this.OCT_COURT_COUNT = OCT_COURT_COUNT;
    }

    public Integer getNOV_COURT_COUNT() {
        return NOV_COURT_COUNT;
    }

    public void setNOV_COURT_COUNT(Integer NOV_COURT_COUNT) {
        this.NOV_COURT_COUNT = NOV_COURT_COUNT;
    }

    public Integer getDEC_COURT_COUNT() {
        return DEC_COURT_COUNT;
    }

    public void setDEC_COURT_COUNT(Integer DEC_COURT_COUNT) {
        this.DEC_COURT_COUNT = DEC_COURT_COUNT;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }
}
