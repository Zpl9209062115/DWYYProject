package com.nanrui.dwyy.service;

import com.alibaba.fastjson.JSONObject;
import com.nanrui.dwyy.DwyyApplication;
import com.nanrui.dwyy.bean.*;
import com.nanrui.dwyy.repository.*;
import com.nanrui.dwyy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


@Service
public class JsonDataDispose {

    @Autowired
    CityJson_Repository cityDisposeJpa;

    String BEFORE = "(function(root, factory) {\n" +
            "\tif (typeof define === 'function' && define.amd) {\n" +
            "\t\t// AMD. Register as an anonymous module.\n" +
            "\t\tdefine(['exports', 'echarts'], factory);\n" +
            "\t} else if (typeof exports === 'object' && typeof exports.nodeName !== 'string') {\n" +
            "\t\t// CommonJS\n" +
            "\t\tfactory(exports, require('echarts'));\n" +
            "\t} else {\n" +
            "\t\t// Browser globals\n" +
            "\t\tfactory({}, root.echarts);\n" +
            "\t}\n" +
            "}(this, function(exports, echarts) {\n" +
            "\tvar log = function(msg) {\n" +
            "\t\tif (typeof console !== 'undefined') {\n" +
            "\t\t\tconsole && console.error && console.error(msg);\n" +
            "\t\t}\n" +
            "\t}\n" +
            "\tif (!echarts) {\n" +
            "\t\tlog('ECharts is not Loaded');\n" +
            "\t\treturn;\n" +
            "\t}\n" +
            "\tif (!echarts.registerMap) {\n" +
            "\t\tlog('ECharts Map is not loaded')\n" +
            "\t\treturn;\n" +
            "\t}\n" +
            "\techarts.registerMap(\"";

    String between = "\",";

    String END = ");\n" +
            "}));";

    List<String> cityCZ = new ArrayList<>();

    List<String> cityBCZ = new ArrayList<>();

    public boolean cityDisposeJsonDS(){

        JsonUtils utils = new JsonUtils();
        String path = DwyyApplication.class.getClassLoader().getResource("static/JsonDS").getPath();
        //ArrayList<String> arr = utils.getFile(new File(path));
        //List<CityJsonData> allWSData = cityDisposeJpa.findAll();

        try {
            dispoeDS_Cityname();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean cityDisposeJsonWS(){
        List<CityJsonData> jsonDataList = new ArrayList<>();

        Double xDouble = 0.0;
        Double yDouble = 0.0;

        JsonUtils utils = new JsonUtils();
        String path = DwyyApplication.class.getClassLoader().getResource("static/JsonWS").getPath();
        List<String> arr = utils.getFile(new File(path));

        for (String pathFile : arr){
            String temp[] = pathFile.split("\\\\");
            String s = temp[temp.length - 1];
            String subStringName = s.substring(0, s.lastIndexOf("."));
            if (subStringName.contains("_")){
                subStringName = subStringName.replace("_","");
            }
            if (subStringName.contains("geo")||subStringName.contains("_geo")){
                subStringName = subStringName.replace("geo","");
            }

            String jsonDataFile = utils.readJsonFile(pathFile);
            com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSONObject.parseObject(jsonDataFile);
            List<JSONObject> listFeatures = (List<JSONObject>) jsonObject.get("features");
            for (int i = 0;i<listFeatures.size();i++){
                CityJsonData city_message = new CityJsonData();

                String cityId = (String) listFeatures.get(i).get("id");
                city_message.setCityId(cityId);

                Map<String,String> propertiesList = (Map<String,String>) listFeatures.get(i).get("properties");
                for (Map.Entry map:propertiesList.entrySet()){
                    if (map.getKey().equals("name")){
                        String cityDS = (String) map.getValue();

                        city_message.setCityDS(cityDS);
                        city_message.setCityWS(subStringName);
                    }
                    if (map.getKey().equals("cp")){
                        List<Object> value = (List<Object>) map.getValue();
                        xDouble = Double.parseDouble(value.get(0).toString());
                        yDouble = Double.parseDouble(value.get(1).toString());
                        city_message.setX_coord(xDouble);
                        city_message.setY_coord(yDouble);
                    }
                }
                city_message.setUuid(UUID.randomUUID().toString());
                jsonDataList.add(city_message);
            }

        }
        cityDisposeJpa.saveAll(jsonDataList);

        return false;
    }

    public void dispoeDS_Cityname() throws IOException {
        JsonUtils utils = new JsonUtils();
        String path = DwyyApplication.class.getClassLoader().getResource("static/JsonDS").getPath();
        List<String> arr = utils.getFile(new File(path));

        for (String pathFile : arr){

            String jsonDataFile = utils.readJsonFile(pathFile);
            String temp[] = pathFile.split("\\\\");
            String s = temp[temp.length - 1];
            String subStringName = s.substring(0, s.lastIndexOf("."));
            subStringName = subStringName.substring(0,subStringName.length()-2);
            List<Object[]> objects = cityNameFind(subStringName);

            String cityName = "";
            String fileName = "";
            String url = "";
            String fileDie = "";
            if (0 != objects.size()){
                if (objects.size() > 1){
                    String value = objects.get(0)[1].toString();
                    cityName = value;
                    fileName = value;
                    fileDie = value;
                } else {
                    String value1 = objects.get(0)[0].toString();
                    String value2 = objects.get(0)[1].toString();
                    cityName = value1;
                    fileName = value1;
                    fileDie = value2;
                }
                url = "F:/cityDispose/cz/"+fileDie;
                fileWrite(url,jsonDataFile,cityName,subStringName,fileName);
                cityCZ.add(pathFile);
            } else{
                cityBCZ.add(pathFile);
                url = "F:/cityDispose/bcz/";
                fileWrite(url,jsonDataFile,cityName,subStringName,fileName);
            }
        }
    }

    public void fileWrite(String url,String jsonDataFile,String cityName,String subStringName,String fileName) throws IOException {

        File fileDie = new File(url);
        if (fileDie.exists()){
            if (fileDie.isDirectory()) {
                 System.out.println("dir exists");
             }
        } else{
            System.out.println("dir not exists, create it ...");
            fileDie.mkdir();
        }

        StringBuffer sb = new StringBuffer();
        sb.append(BEFORE);
        sb.append(cityName);
        sb.append(between);
        sb.append(jsonDataFile);
        sb.append(END);
        System.out.println(sb.toString());
        File file = new File(url + "/" + fileName + ".js");
        file.createNewFile();//创建一个新的文件
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        bw.write(sb.toString());//\r\n换行
        bw.close();
    }

    public List<Object[]> cityNameFind (String subStringName){
        List<Object[]> objects = cityDisposeJpa.cityNameFind("%" + subStringName + "%");
        return objects;
    }

}
