package com.nanrui.dwyy.controller;

import com.nanrui.dwyy.service.DWYY_QXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller()
public class QX_Controller {

    @Autowired
    DWYY_QXService dwyy_qxService;

    @ResponseBody
    @RequestMapping(value = "/qxcourt",method = RequestMethod.POST)
    public Map<String,Object> testController(@RequestBody Map<String,Object> params, Model model) throws Exception {
        /**
         * {"cityname":"gansu","condition":"1000"}
         */
        String date = (String) params.get("date");
        Map<String,Object> htmlMap = dwyy_qxService.findQX_Court(date);
        if (null != htmlMap){
            return htmlMap;
        } else {
            return null;
        }
    }

}
