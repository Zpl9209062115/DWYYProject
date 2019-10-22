package com.nanrui.dwyy.service;

import com.nanrui.dwyy.bean.*;
import com.nanrui.dwyy.repository.QX_COURT_Repository;
import com.nanrui.dwyy.repository.YWJX_COURT_Repository;
import com.nanrui.dwyy.repository.YWJX_PER_Repository;
import com.nanrui.dwyy.utils.ScenceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class DWYY_YWJXService {

    @Autowired
    YWJX_COURT_Repository ywjx_court_repository;

    @Autowired
    YWJX_PER_Repository ywjx_per_repository;

    List<String> cityStrNameList = new ArrayList<String>();

    public Map<String,Object> findYWJX_Court(String date) throws Exception {

        ScenceUtils scenceUtils = new ScenceUtils();

        //date = scenceUtils.dateDispose(date);
        /**
         * 网省数据封装
         */
        if (0 == cityStrNameList.size()){
            cityStrNameList = scenceUtils.CityStrDispose();
        }

        Map<String,Object> htmlData = new HashMap<String,Object>();
        /**
         * 获得台区数量，由于台区数基本集中在普华方面，根据普华逻辑获得台区数量
         */
        /*List<Object[]> courtCountList = */
        Integer courtCount = 30;
        //查询全国班组分布情况，其中包括1-12个月份全国台区分布情况
        List<Object[]> ywjx_courtdata = ywjx_court_repository.getYWHJX_COURTDATA_China("china","%"+date+"%");
        //查询全国运维人员分布情况，其中包括1-12个月份全国台区分布情况
        List<Object[]> ywjx_perdata = ywjx_per_repository.getYWJX_PERDATA_China("china","%"+date+"%");

        /**
         * 场景1-表格数据封装
         */
        Scene_Table sceneTable = scenceUtils.sceneTableDataSispose(courtCount,ywjx_courtdata,ywjx_perdata);

        /**
         * 场景2
         */
        Scene_Time sceneTime = scenceUtils.sceneTimeDataSispose(courtCount,ywjx_courtdata,ywjx_perdata);

        /**
         * 场景3
         */
        /**
         * 场景3.1    网省台区数量，由于网省台区数量是根据查询出来的，为测试页面功能，进行假数据
         */
        Map<String, Integer> cityCourtData = scenceUtils.cityCourtDataDispose();

        //查询每个地市网省台区运维人员数量
        Map<String,Scene_City> cityMap = new HashMap<>();
        Scene_City sceneCity = null;
        for (int i = 0; i < cityStrNameList.size(); i++) {
            String cityName = cityStrNameList.get(i);
            Double avgPerCount = 0.0;
            Integer courtCon = cityCourtData.get(cityName);
            List<Object[]> ywjx_perdata_city = ywjx_per_repository.getYWJX_PERDATA_CITY(cityName,"%"+date+"%");

            if (0 != ywjx_perdata_city.size() && 0 != courtCon){
                avgPerCount = Double.valueOf(ywjx_perdata_city.get(0)[0].toString())/courtCon;
                sceneCity = new Scene_City(
                        cityName,courtCon,avgPerCount
                );
            } else {
                sceneCity = new Scene_City(
                        cityName,courtCon,avgPerCount
                );
            }
            cityMap.put(cityName,sceneCity);
        }
        htmlData.put("sceneTable",sceneTable);
        htmlData.put("sceneTime",sceneTime);
        htmlData.put("sceneCity",cityMap);

        return htmlData;
    }

}
