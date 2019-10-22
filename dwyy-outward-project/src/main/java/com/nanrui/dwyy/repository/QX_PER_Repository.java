package com.nanrui.dwyy.repository;

import com.nanrui.dwyy.bean.QX_COURT;
import com.nanrui.dwyy.bean.QX_PER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QX_PER_Repository extends JpaRepository<QX_PER,String> {
    @Query(value = "SELECT PERID,PERCOUNT,DATEUPDATE,JAN_PER_COUNT,FEB_PER_COUNT,MAR_PER_COUNT,APR_PER_COUNT,MAY_PER_COUNT,JUN_PER_COUNT,JUL_PER_COUNT,AUG_PER_COUNT,SEPT_PER_COUNT,OCT_PER_COUNT,NOV_PER_COUNT,DEC_PER_COUNT  FROM qx_per ORDER BY DATEUPDATE DESC limit 0,1",nativeQuery = true)
    public List<Object[]> getQX_COURTDATA();

    @Query(value = "SELECT PERCOUNT,JAN_PER_COUNT,FEB_PER_COUNT,MAR_PER_COUNT,APR_PER_COUNT,MAY_PER_COUNT,JUN_PER_COUNT," +
            "JUL_PER_COUNT,AUG_PER_COUNT,SEPT_PER_COUNT,OCT_PER_COUNT,NOV_PER_COUNT,DEC_PER_COUNT  " +
            "FROM qx_per " +
            "WHERE CITY = ?1 AND DATEUPDATE LIKE ?2 ORDER BY DATEUPDATE DESC limit 0,1",nativeQuery = true)
    List<Object[]> getQX_PERDATA_China(String china,String date);

    @Query(value = "SELECT PERCOUNT FROM qx_per " +
            "WHERE CITY = ?1 AND DATEUPDATE LIKE ?2 ORDER BY DATEUPDATE DESC limit 0,1",nativeQuery = true)
    List<Object[]> getQX_PERDATA_CITY(String city,String date);
}
