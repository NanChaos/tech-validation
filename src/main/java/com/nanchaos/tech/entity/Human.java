package com.nanchaos.tech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
public class Human implements Serializable {

    private static final long serialVersionUID = -6488125295565095551L;

    private String name;

    private Integer age = 0;

    private String birthday;
}
