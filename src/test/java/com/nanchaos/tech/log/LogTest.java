package com.nanchaos.tech.log;

import com.nanchaos.tech.TechValidationApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/1
 * @time 11:03
 */
@SpringBootTest(classes = TechValidationApplication.class)
public class LogTest {

    @Resource
    private ValidAService validAService;

    @Resource
    private ValidBService validBService;

    @Resource
    private ValidCService validCService;

    @Resource
    private ValidDService validDService;

    @Test
    public void testLogInstance(){

        System.out.println(validAService.getLogHashCode());
        System.out.println(validBService.getLogHashCode());
        System.out.println(validCService.getLogHashCode());
        System.out.println(validDService.getLogHashCode());
        System.out.println(validDService.getLogger().equals(validCService.getLogger()));
    }
}
