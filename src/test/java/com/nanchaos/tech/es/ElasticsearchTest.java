package com.nanchaos.tech.es;

import com.nanchaos.tech.TechValidationApplication;
import com.nanchaos.tech.entity.Human;
import com.nanchaos.tech.service.es.HumanEsService;
import org.elasticsearch.client.RestClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.client.elc.QueryBuilders;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/14
 * @time 18:25
 */
@SpringBootTest(classes = TechValidationApplication.class)
public class ElasticsearchTest {

    @Resource
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;

    @Resource
    private RestClient restClient;

    @Resource
    private HumanEsService humanEsService;

    @Test
    public void testQuery() {
        System.out.println(humanEsService.count());
        humanEsService.save(new Human("1", "", 50, new Date()));
        System.out.println(humanEsService.count());

    }

    @Test
    public void testQuery2() {

    }
}
