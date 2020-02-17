package com.zb.src.Coll;

import com.alibaba.fastjson.JSON;
import com.zb.src.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class coll {

    @Autowired
    Service service;

    @RequestMapping("/showUser")
    public  String showUser(String userName){
        System.out.print(userName);
        return JSON.toJSONStringWithDateFormat(service.showUser(userName),"yyyy-MM-dd");
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(String id){
        return String.valueOf(service.deleteUser(id));
    }
}
