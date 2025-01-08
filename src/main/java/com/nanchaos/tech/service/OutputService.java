package com.nanchaos.tech.service;

import com.nanchaos.tech.api.OutputFacade;
import com.nanchaos.tech.config.aop.ann.AppInterfaceLog;
import com.nanchaos.tech.entity.Human;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 09:56
 */
@Slf4j
@Service
public class OutputService implements OutputFacade {

    @Override
    @AppInterfaceLog(alarmThreshold = 500L)
    public Human humanAgeAdd(Human human) {
        log.info("humanAgeAdd human={}", human);
        if (human == null) {
            human = new Human();
        }
        human.setAge(human.getAge() + 1);
        return human;
    }
}
