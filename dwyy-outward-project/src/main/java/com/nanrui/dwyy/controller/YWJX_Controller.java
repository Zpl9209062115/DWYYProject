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

import java.util.Map;

@Controller()
public class YWJX_Controller {

    @Autowired
    DWYY_QXService dwyy_qxService;

    @Autowired
    DWYY_YWJXService dwyy_ywjxService;

    @ResponseBody
    @RequestMapping(value = "/ywjxcourt",method = RequestMethod.POST)
    public Map<String,Object> testController(@RequestBody Map<String,Object> params, Model model) throws Exception {
        /**
         * {"cityname":"gansu","condition":"1000"}
         */
        String date = (String) params.get("date");
        Map<String,Object> htmlMap = dwyy_ywjxService.findYWJX_Court(date);
        if (null != htmlMap){
            return htmlMap;
        } else {
            return null;
        }
    }

}
