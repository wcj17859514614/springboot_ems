package com.baizhi.wcj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer id;

    private String username;

    private String name;

    private String password;

    private String sex;


}