package com.nanchaos.tech.api;

import com.nanchaos.tech.config.aop.ann.AppInterfaceLog;
import com.nanchaos.tech.entity.Human;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 09:57
 */
public interface OutputFacade {

    Human humanAgeAdd(Human human);
}
