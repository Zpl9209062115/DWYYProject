package com.nanrui.dwyy.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 针对页面表格场景，进行数据实体类封装
 */
public class Scene_Table implements Serializable {

    /**
     * 台区数量
     */
    private Integer courtCount;

    /**
     * 班组数量
     */
    private Integer teamCount;

    /**
     * 人员数量
     */
    private Integer perCount;

    /**
     * 台区平均人员数量
     */
    private BigDecimal averPerCount;

    public Scene_Table() {
    }

    public Scene_Table(Integer courtCount, Integer teamCount, Integer perCount, BigDecimal averPerCount) {
        this.courtCount = courtCount;
        this.teamCount = teamCount;
        this.perCount = perCount;
        this.averPerCount = averPerCount;
    }

    public Integer getCourtCount() {
        return courtCount;
    }

    public void setCourtCount(Integer courtCount) {
        this.courtCount = courtCount;
    }

    public Integer getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }

    public Integer getPerCount() {
        return perCount;
    }

    public void setPerCount(Integer perCount) {
        this.perCount = perCount;
    }

    public BigDecimal getAverPerCount() {
        return averPerCount;
    }

    public void setAverPerCount(BigDecimal averPerCount) {
        this.averPerCount = averPerCount;
    }
}
