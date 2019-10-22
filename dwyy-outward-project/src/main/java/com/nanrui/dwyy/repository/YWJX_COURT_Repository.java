package com.nanrui.dwyy.repository;

import com.nanrui.dwyy.bean.QX_PER;
import com.nanrui.dwyy.bean.YWJX_COURT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YWJX_COURT_Repository extends JpaRepository<YWJX_COURT,String> {
    @Query(value = "SELECT COURTCOUNT,JAN_COURT_COUNT,FEB_COURT_COUNT,MAR_COURT_COUNT,APR_COURT_COUNT," +
            "MAY_COURT_COUNT,JUN_COURT_COUNT,JUL_COURT_COUNT,AUG_COURT_COUNT," +
            "SEPT_COURT_COUNT,OCT_COURT_COUNT,NOV_COURT_COUNT,DEC_COURT_COUNT  " +
            "FROM ywjx_court WHERE CITY = ?1 AND DATEUPDATE LIKE ?2 ORDER BY DATEUPDATE DESC limit 0,1",nativeQuery = true)
    public List<Object[]> getYWHJX_COURTDATA_China(String city,String date);
}
