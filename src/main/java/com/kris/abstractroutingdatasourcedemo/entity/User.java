package com.kris.abstractroutingdatasourcedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 *
 * @author Kairou Zeng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String name;

    private int sex;

    private int age;
}
