package com.nanchaos.tech.service.es;

import com.nanchaos.tech.entity.Human;

import java.util.List;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/14
 * @time 18:45
 */
public interface HumanEsService {
    long count();

    Human save(Human Human);

    void delete(Human Human);

    List<Human> getAll();

    List<Human> getByName(String name);
}
