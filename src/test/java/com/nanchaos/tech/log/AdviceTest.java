package com.nanchaos.tech.log;

import com.nanchaos.tech.TechValidationApplication;
import com.nanchaos.tech.api.OutputFacade;
import com.nanchaos.tech.entity.Human;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 10:05
 */
@SpringBootTest(classes = TechValidationApplication.class)
public class AdviceTest {

    @Resource
    private OutputFacade outputFacade;

    @Test
    public void testAop() {
        Human human = new Human(null, "55", 1, null);
        outputFacade.humanAgeAdd(human);
    }
}
