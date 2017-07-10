package com.hwz;

/**
 * Created by ZhangZaipeng on 2017/7/9.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String applicationName;

    @RequestMapping("/hi")
    public String home() {
        return "hi i am is:" + applicationName + ",i am from port:" +port;
    }
}
