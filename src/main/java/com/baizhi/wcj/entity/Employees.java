package com.baizhi.wcj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
    private Integer id;

    private String name;

    private Double salary;

    private Integer age;


}