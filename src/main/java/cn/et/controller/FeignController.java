package cn.et.controller;

import cn.et.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeignController {
    @Autowired
    SendMailService sendMailService;

    @RequestMapping("test1")
    public String test1(){
        try {
//          设置请求体
            Map map =new HashMap();
            map.put("receiveName", "2574405253@qq.com");
            map.put("title", "测试Feign发送邮件");
            map.put("content", "Feign Hello");

            String result =sendMailService.test1(map);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

    @RequestMapping("FeignTest")
    public String test3(String name){
        return sendMailService.test3(name);
    }
}
