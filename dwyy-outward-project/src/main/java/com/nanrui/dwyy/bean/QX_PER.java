package com.nanrui.dwyy.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 抢修人员相关实体类
 */
@Entity(name = "QX_PER")
@Table(name = "QX_PER")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class QX_PER implements Serializable {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(generator = "jpa-uuid")//自增主键
    private String PERID;

    /**
     * 人员数量
     */
    @Column(name = "PERCOUNT")
    private Integer PERCOUNT;

    @Column(name = "DATEUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date DATEUPDATE;

    /**
     * 一月人员数量
     */
    @Column(name = "JAN_PER_COUNT")
    private Integer JAN_PER_COUNT;

    /**
     * 二月人员数量
     */
    @Column(name = "FEB_PER_COUNT")
    private Integer FEB_PER_COUNT;

    /**
     * 三月人员数量
     */
    @Column(name = "MAR_PER_COUNT")
    private Integer MAR_PER_COUNT;

    /**
     *4月人员数量
     */
    @Column(name = "APR_PER_COUNT")
    private Integer APR_PER_COUNT;

    /**
     * 5月人员数量
     */
    @Column(name = "MAY_PER_COUNT")
    private Integer MAY_PER_COUNT;

    /**
     * 6月人员数量
     */
    @Column(name = "JUN_PER_COUNT")
    private Integer JUN_PER_COUNT;

    /**
     * 7月人员数量
     */
    @Column(name = "JUL_PER_COUNT")
    private Integer JUL_PER_COUNT;
    /**
     * 8月人员数量
     */
    @Column(name = "AUG_PER_COUNT")
    private Integer AUG_PER_COUNT;

    /**
     * 9月人员数量
     */
    @Column(name = "SEPT_PER_COUNT")
    private Integer SEPT_PER_COUNT;

    /**
     * 10月人员数量
     */
    @Column(name = "OCT_PER_COUNT")
    private Integer OCT_PER_COUNT;
    /**
     * 11月人员数量
     */
    @Column(name = "NOV_PER_COUNT")
    private Integer NOV_PER_COUNT;
    /**
     * 12月人员数量
     */
    @Column(name = "DEC_PER_COUNT")
    private Integer DEC_PER_COUNT;

    @Column(name = "CITY")
    private String CITY;

    public QX_PER(Integer PERCOUNT, Date DATEUPDATE, Integer JAN_PER_COUNT, Integer FEB_PER_COUNT, Integer MAR_PER_COUNT, Integer APR_PER_COUNT, Integer MAY_PER_COUNT, Integer JUN_PER_COUNT, Integer JUL_PER_COUNT, Integer AUG_PER_COUNT, Integer SEPT_PER_COUNT, Integer OCT_PER_COUNT, Integer NOV_PER_COUNT, Integer DEC_PER_COUNT, String CITY) {
        this.PERCOUNT = PERCOUNT;
        this.DATEUPDATE = DATEUPDATE;
        this.JAN_PER_COUNT = JAN_PER_COUNT;
        this.FEB_PER_COUNT = FEB_PER_COUNT;
        this.MAR_PER_COUNT = MAR_PER_COUNT;
        this.APR_PER_COUNT = APR_PER_COUNT;
        this.MAY_PER_COUNT = MAY_PER_COUNT;
        this.JUN_PER_COUNT = JUN_PER_COUNT;
        this.JUL_PER_COUNT = JUL_PER_COUNT;
        this.AUG_PER_COUNT = AUG_PER_COUNT;
        this.SEPT_PER_COUNT = SEPT_PER_COUNT;
        this.OCT_PER_COUNT = OCT_PER_COUNT;
        this.NOV_PER_COUNT = NOV_PER_COUNT;
        this.DEC_PER_COUNT = DEC_PER_COUNT;
        this.CITY = CITY;
    }

    public QX_PER() {
    }

    public String getPERID() {
        return PERID;
    }

    public void setPERID(String PERID) {
        this.PERID = PERID;
    }

    public Integer getPERCOUNT() {
        return PERCOUNT;
    }

    public void setPERCOUNT(Integer PERCOUNT) {
        this.PERCOUNT = PERCOUNT;
    }

    public Date getDATEUPDATE() {
        return DATEUPDATE;
    }

    public void setDATEUPDATE(Date DATEUPDATE) {
        this.DATEUPDATE = DATEUPDATE;
    }

    public Integer getJAN_PER_COUNT() {
        return JAN_PER_COUNT;
    }

    public void setJAN_PER_COUNT(Integer JAN_PER_COUNT) {
        this.JAN_PER_COUNT = JAN_PER_COUNT;
    }

    public Integer getFEB_PER_COUNT() {
        return FEB_PER_COUNT;
    }

    public void setFEB_PER_COUNT(Integer FEB_PER_COUNT) {
        this.FEB_PER_COUNT = FEB_PER_COUNT;
    }

    public Integer getMAR_PER_COUNT() {
        return MAR_PER_COUNT;
    }

    public void setMAR_PER_COUNT(Integer MAR_PER_COUNT) {
        this.MAR_PER_COUNT = MAR_PER_COUNT;
    }

    public Integer getAPR_PER_COUNT() {
        return APR_PER_COUNT;
    }

    public void setAPR_PER_COUNT(Integer APR_PER_COUNT) {
        this.APR_PER_COUNT = APR_PER_COUNT;
    }

    public Integer getMAY_PER_COUNT() {
        return MAY_PER_COUNT;
    }

    public void setMAY_PER_COUNT(Integer MAY_PER_COUNT) {
        this.MAY_PER_COUNT = MAY_PER_COUNT;
    }

    public Integer getJUN_PER_COUNT() {
        return JUN_PER_COUNT;
    }

    public void setJUN_PER_COUNT(Integer JUN_PER_COUNT) {
        this.JUN_PER_COUNT = JUN_PER_COUNT;
    }

    public Integer getJUL_PER_COUNT() {
        return JUL_PER_COUNT;
    }

    public void setJUL_PER_COUNT(Integer JUL_PER_COUNT) {
        this.JUL_PER_COUNT = JUL_PER_COUNT;
    }

    public Integer getAUG_PER_COUNT() {
        return AUG_PER_COUNT;
    }

    public void setAUG_PER_COUNT(Integer AUG_PER_COUNT) {
        this.AUG_PER_COUNT = AUG_PER_COUNT;
    }

    public Integer getSEPT_PER_COUNT() {
        return SEPT_PER_COUNT;
    }

    public void setSEPT_PER_COUNT(Integer SEPT_PER_COUNT) {
        this.SEPT_PER_COUNT = SEPT_PER_COUNT;
    }

    public Integer getOCT_PER_COUNT() {
        return OCT_PER_COUNT;
    }

    public void setOCT_PER_COUNT(Integer OCT_PER_COUNT) {
        this.OCT_PER_COUNT = OCT_PER_COUNT;
    }

    public Integer getNOV_PER_COUNT() {
        return NOV_PER_COUNT;
    }

    public void setNOV_PER_COUNT(Integer NOV_PER_COUNT) {
        this.NOV_PER_COUNT = NOV_PER_COUNT;
    }

    public Integer getDEC_PER_COUNT() {
        return DEC_PER_COUNT;
    }

    public void setDEC_PER_COUNT(Integer DEC_PER_COUNT) {
        this.DEC_PER_COUNT = DEC_PER_COUNT;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }
}
