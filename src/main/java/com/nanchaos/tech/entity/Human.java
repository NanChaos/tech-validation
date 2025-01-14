package com.nanchaos.tech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 09:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "human")
public class Human implements Serializable {

    private static final long serialVersionUID = -6488125295565095551L;

    @Id
    private String id;

    private String name;

    private Integer age = 0;

    private Date birthday;

}
