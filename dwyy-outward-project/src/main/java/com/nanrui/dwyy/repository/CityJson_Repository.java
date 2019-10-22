package com.nanrui.dwyy.repository;

import com.nanrui.dwyy.bean.BDZ_Coord;
import com.nanrui.dwyy.bean.CityJsonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityJson_Repository extends JpaRepository<CityJsonData,String> {

    @Query(value = "SELECT cityDS,cityWS FROM json_ws WHERE cityId LIKE ?1")
    public List<Object[]> cityNameFind(String subStringName);

}
