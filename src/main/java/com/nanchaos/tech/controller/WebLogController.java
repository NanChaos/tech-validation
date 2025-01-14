package com.nanchaos.tech.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/10
 * @time 10:25
 */
@RestController
public class WebLogController {

    @GetMapping("printLog")
    public String printLog() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        return builder.toString();
    }

    @GetMapping("printGCInfo")
    public String printGCInfo() {
        ManagementFactory.getGarbageCollectorMXBeans().forEach(gc -> {
            System.out.println(JSON.toJSONString(gc));
        });
        return "ok";
    }
}
