package com.nanrui.dwyy.utils;

import com.nanrui.dwyy.bean.Scene_Table;
import com.nanrui.dwyy.bean.Scene_Time;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScenceUtils {
    public List<String> CityStrDispose() {
        List<String> cityStrData = new ArrayList<>();
        cityStrData.add("beijing");
        cityStrData.add("tianjin");
        cityStrData.add("hebei");
        cityStrData.add("jibei");
        cityStrData.add("shanxi");
        cityStrData.add("shandong");
        cityStrData.add("shanghai");
        cityStrData.add("jiangsu");
        cityStrData.add("zhejiang");
        cityStrData.add("anhui");
        cityStrData.add("fujian");
        cityStrData.add("hubei");
        cityStrData.add("hunan");
        cityStrData.add("henan");
        cityStrData.add("jiangxi");
        cityStrData.add("sichuan");
        cityStrData.add("chongqing");
        cityStrData.add("liaoning");
        cityStrData.add("jilin");
        cityStrData.add("heilongjiang");
        cityStrData.add("mengdong");
        cityStrData.add("shanxi1");
        cityStrData.add("gansu");
        cityStrData.add("qinghai");
        cityStrData.add("ningxia");
        cityStrData.add("xinjiang");
        cityStrData.add("xizang");
        return cityStrData;
    }

    public Scene_Table sceneTableDataSispose(Integer courtCount, List<Object[]> courtdata, List<Object[]> perdata) {
        /**
         * SELECT
         * COURTCOUNT,JAN_COURT_COUNT,FEB_COURT_COUNT,MAR_COURT_COUNT,APR_COURT_COUNT,
         * MAY_COURT_COUNT,JUN_COURT_COUNT,JUL_COURT_COUNT,AUG_COURT_COUNT,SEPT_COURT_COUNT,OCT_COURT_COUNT,
         * NOV_COURT_COUNT,DEC_COURT_COUNT
         * FROM ywjx_court ORDER BY DATEUPDATE DESC limit 0,1
         */
        Scene_Table sceneTable = null;
        if (0 != courtdata.size() && 0 != perdata.size() && 0 != courtCount){
            Integer teamCount = Integer.valueOf(courtdata.get(0)[0].toString());
            Integer perCount = Integer.valueOf(perdata.get(0)[0].toString());

            BigDecimal bigDecimal1 = new BigDecimal(perCount);
            BigDecimal bigDecimal2 = new BigDecimal(courtCount);

            BigDecimal avgPerCount = bigDecimal1.divide(bigDecimal2,5,BigDecimal.ROUND_HALF_UP);
            sceneTable = new Scene_Table(
                    courtCount,teamCount,perCount,avgPerCount
            );
        } else{
            sceneTable = new Scene_Table(
                    courtCount,0,0,new BigDecimal(0.0)
            );
        }

        return sceneTable;
    }

    public Scene_Time sceneTimeDataSispose(Integer courtCount, List<Object[]> courtdata, List<Object[]> perdata) {
        /**
         * SELECT
         * PERCOUNT,JAN_PER_COUNT,FEB_PER_COUNT,MAR_PER_COUNT,APR_PER_COUNT,
         * MAY_PER_COUNT,JUN_PER_COUNT,JUL_PER_COUNT,AUG_PER_COUNT,SEPT_PER_COUNT,OCT_PER_COUNT,
         * NOV_PER_COUNT,DEC_PER_COUNT
         * FROM ywjx_per ORDER BY DATEUPDATE DESC limit 0,1
         */
        Scene_Time sceneTime = null;
        if (0 != perdata.size()){
            Integer JAN_PER_COUNT = Integer.valueOf(perdata.get(0)[1].toString());
            Integer FEB_PER_COUNT = Integer.valueOf(perdata.get(0)[2].toString());
            Integer MAR_PER_COUNT = Integer.valueOf(perdata.get(0)[3].toString());
            Integer APR_PER_COUNT = Integer.valueOf(perdata.get(0)[4].toString());
            Integer MAY_PER_COUNT = Integer.valueOf(perdata.get(0)[5].toString());
            Integer JUN_PER_COUNT = Integer.valueOf(perdata.get(0)[6].toString());
            Integer JUL_PER_COUNT = Integer.valueOf(perdata.get(0)[7].toString());
            Integer AUG_PER_COUNT = Integer.valueOf(perdata.get(0)[8].toString());
            Integer SEPT_PER_COUNT = Integer.valueOf(perdata.get(0)[9].toString());
            Integer OCT_PER_COUNT = Integer.valueOf(perdata.get(0)[10].toString());
            Integer NOV_PER_COUNT = Integer.valueOf(perdata.get(0)[11].toString());
            Integer DEC_PER_COUNT = Integer.valueOf(perdata.get(0)[12].toString());
            sceneTime = new Scene_Time(
                    JAN_PER_COUNT,FEB_PER_COUNT,MAR_PER_COUNT,APR_PER_COUNT,MAY_PER_COUNT,JUN_PER_COUNT,JUL_PER_COUNT,AUG_PER_COUNT,SEPT_PER_COUNT,OCT_PER_COUNT,NOV_PER_COUNT,DEC_PER_COUNT
            );
        } else{
            sceneTime = new Scene_Time(
                    0,0,0,0,0,0,0,0,0,0,0,0
            );
        }

        return sceneTime;
    }

    public Map<String,Integer> cityCourtDataDispose() {
        Map<String,Integer> cityDataMap = new HashMap<String,Integer>();
        Integer beijingCount = 50;
        Integer tinjinCount = 20;
        Integer hebeiCount = 30;
        Integer jibeiCount = 20;
        Integer shanxiCount = 40;
        Integer shandongCount = 25;
        Integer shanghaiCount = 21;
        Integer jiangsuCount = 33;
        Integer zhejiangCount = 20;
        Integer anhuiCount = 37;
        Integer fujianCount = 20;
        Integer hubeiCount = 27;
        Integer hunanCount = 26;
        Integer henanCount = 22;
        Integer jiangxiCount = 24;
        Integer sichuanCount = 31;
        Integer chongqingCount = 36;
        Integer liaoningCount = 33;
        Integer jilinCount = 32;
        Integer heilongjiangCount = 50;
        Integer mengdongCount = 20;
        Integer shanxi1Count = 21;
        Integer gansuCount = 22;
        Integer qinghaiCount = 21;
        Integer ningxiaCount = 23;
        Integer xinjiangCount = 27;
        Integer xizangCount = 26;
        cityDataMap.put("beijing",beijingCount);
        cityDataMap.put("tianjin",tinjinCount);
        cityDataMap.put("hebei",hebeiCount);
        cityDataMap.put("jibei",jibeiCount);
        cityDataMap.put("shanxi",shanxiCount);
        cityDataMap.put("shandong",shandongCount);
        cityDataMap.put("shanghai",shanghaiCount);
        cityDataMap.put("jiangsu",jiangsuCount);
        cityDataMap.put("zhejiang",zhejiangCount);
        cityDataMap.put("anhui",anhuiCount);
        cityDataMap.put("fujian",fujianCount);
        cityDataMap.put("hubei",hubeiCount);
        cityDataMap.put("hunan",hunanCount);
        cityDataMap.put("henan",henanCount);
        cityDataMap.put("jiangxi",jiangxiCount);
        cityDataMap.put("sichuan",sichuanCount);
        cityDataMap.put("chongqing",chongqingCount);
        cityDataMap.put("liaoning",liaoningCount);
        cityDataMap.put("jilin",jilinCount);
        cityDataMap.put("heilongjiang",heilongjiangCount);
        cityDataMap.put("mengdong",mengdongCount);
        cityDataMap.put("shanxi1",shanxi1Count);
        cityDataMap.put("gansu",gansuCount);
        cityDataMap.put("qinghai",qinghaiCount);
        cityDataMap.put("ningxia",ningxiaCount);
        cityDataMap.put("xinjiang",xinjiangCount);
        cityDataMap.put("xizang",xizangCount);
        return cityDataMap;
    }

    public String dateDispose(String date) throws Exception {
        /**
         * 2019-7-2 17:33
         */
        String dateDispose = "";
        Date inputDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        DateFormat outputFormat = new SimpleDateFormat("yyyy-MM");

        if ("".equals(date)){
            Date nowDate = new Date();
            dateDispose = formatter.format(nowDate);
        }else {
            /**
             * 2019-7-2 17:33
             */
            inputDate = inputFormat.parse(date);
            dateDispose = outputFormat.format(inputDate);
        }
        return dateDispose;
    }
}
