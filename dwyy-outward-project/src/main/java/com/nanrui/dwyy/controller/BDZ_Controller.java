package com.nanrui.dwyy.controller;

import com.nanrui.dwyy.service.BDZ_Service;
import com.nanrui.dwyy.service.JsonDataDispose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@Controller
public class BDZ_Controller {

    @Autowired
    BDZ_Service bdz_service;

    @Autowired
    JsonDataDispose jsonDataDispose;

    @ResponseBody
    @RequestMapping(value = "/bdz",method = RequestMethod.POST)
    public Map<String,Object> testController(@RequestBody Map<String,Object> params, Model model) throws Exception {
        /**
         * {"cityname":"gansu","condition":"1000"}
         */
        String citycode = (String) params.get("citycode");
        String condition = (String) params.get("condition");
        Map<String,Object> htmlMap = bdz_service.readSourceData(citycode,condition);
        if (null != htmlMap){
            return htmlMap;
        } else {
            return null;
        }
    }


    @ResponseBody
    @RequestMapping(value = "/cityjsonws",method = RequestMethod.GET)
    public String cityJsonDisposeWS() throws Exception {
        jsonDataDispose.cityDisposeJsonWS();
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/cityjsonds",method = RequestMethod.GET)
    public String cityJsonDisposeDS() throws Exception {
        jsonDataDispose.cityDisposeJsonDS();
        return "";
    }

    @RequestMapping("/city")
    public String cityDispose(@RequestParam("cityCode") String cityName){
        switch (cityName){
            case "安庆市" :
                return "/anhui/new_file2_安庆市.html";
            case "亳州市" :
                return "/anhui/new_file2_亳州市.html";
            case "冀北" :
                return "new_file2_冀北.html";
            case "蒙东" :
                return "new_file2_蒙东.html";
            case "黑龙江" :
                return "new_file2_黑龙江.html";
            case "吉林" :
                return "new_file2_吉林.html";
            case "辽宁" :
                return "new_file2_辽宁.html";
            case "台湾" :
                return "new_file2_台湾.html";
            case "江西" :
                return "new_file2_江西.html";
            case "福建" :
                return "new_file2_福建.html";
            case "浙江" :
                return "new_file2_浙江.html";
            case "上海" :
                return "new_file2_上海.html";
            case "江苏" :
                return "new_file2_江苏.html";
            case "山东" :
                return "new_file2_山东.html";
            case "北京" :
                return "new_file2_北京.html";
            case "天津" :
                return "new_file2_天津.html";
            case "海南" :
                return "new_file2_海南.html";
            case "澳门" :
                return "new_file2_澳门.html";
            case "香港" :
                return "new_file2_香港.html";
            case "广东" :
                return "new_file2_广东.html";
            case "湖南" :
                return "new_file2_湖南.html";
            case "湖北" :
                return "new_file2_湖北.html";
            case "河南" :
                return "new_file2_河南.html";
            case "河北" :
                return "new_file2_河北.html";
            case "广西" :
                return "new_file2_广西.html";
            case "贵州" :
                return "new_file2_贵州.html";
            case "重庆" :
                return "new_file2_重庆.html";
            case "山西" :
                return "new_file2_山西.html";
            case "陕西" :
                return "new_file2_陕西.html";
            case "云南" :
                return "new_file2_云南.html";
            case "四川" :
                return "new_file2_四川.html";
            case "宁夏" :
                return "new_file2_宁夏.html";
            case "内蒙古" :
                return "new_file2_内蒙古.html";
            case "青海" :
                return "new_file2_青海.html";
            case "西藏" :
                return "new_file2_西藏.html";
            case "新疆" :
                return "new_file2_新疆.html";
            case "安徽" :
                return "new_file2_安徽.html";
            case "甘肃" :
                return "new_file2_甘肃.html";
            case "china" :
                return "new_file2_全国.html";
            default:
                return "success";
        }
    }

}
