package cn.et.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(value = "mail-center",fallback = HystrixServiceImpl.class)
public interface SendMailService {

    @RequestMapping("test1")
    String test1(Map map);

    @RequestMapping("test3")
    String test3(String name);
}
