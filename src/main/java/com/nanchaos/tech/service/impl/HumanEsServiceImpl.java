package com.nanchaos.tech.service.impl;

import com.nanchaos.tech.entity.Human;
import com.nanchaos.tech.entity.es.HumanRepository;
import com.nanchaos.tech.service.es.HumanEsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/14
 * @time 18:46
 */
@Slf4j
@Service
public class HumanEsServiceImpl implements HumanEsService {
    @Resource
    private HumanRepository repository;
    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public Human save(Human Human) {
        return repository.save(Human);
    }

    @Override
    public void delete(Human Human) {

    }

    @Override
    public List<Human> getAll() {
        return Collections.emptyList();
    }

    @Override
    public List<Human> getByName(String name) {
        return Collections.emptyList();
    }
}
