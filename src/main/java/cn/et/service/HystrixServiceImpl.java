package cn.et.service;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HystrixServiceImpl implements SendMailService {

    @Override
    public String test1(Map map) {
        return "测试Feign调用断路器";
    }

    @Override
    public String test3(String name) {
        return name +"  测试Feign调用断路器";
    }
}
