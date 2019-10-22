package com.nanrui.dwyy.controller;

import com.nanrui.dwyy.service.DWYY_QXService;
import com.nanrui.dwyy.service.DWYY_YWJXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller()
public class DWYY_Controller {

    @Autowired
    DWYY_QXService dwyy_qxService;

    @Autowired
    DWYY_YWJXService dwyy_ywjxService;

    @ResponseBody
    @RequestMapping(value = "/dwyyscene",method = RequestMethod.POST)
    public Map<String,Object> testController(@RequestBody Map<String,Object> params, Model model) throws Exception {
        /**
         * {"cityname":"gansu","condition":"1000"}
         */
        String contion = (String) params.get("contion");
        String date = (String) params.get("date");
        Map<String,Object> htmlMap = new HashMap<String,Object>();

        if ("ywjx".equals(contion)){
            htmlMap = dwyy_ywjxService.findYWJX_Court(date);
        } else {
            htmlMap = dwyy_qxService.findQX_Court(date);
        }

        if (null != htmlMap){
            return htmlMap;
        } else {
            return null;
        }
    }

}
