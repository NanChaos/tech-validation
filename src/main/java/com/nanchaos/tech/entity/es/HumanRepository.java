package com.nanchaos.tech.entity.es;

import com.nanchaos.tech.entity.Human;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends ElasticsearchRepository<Human, String> {

}