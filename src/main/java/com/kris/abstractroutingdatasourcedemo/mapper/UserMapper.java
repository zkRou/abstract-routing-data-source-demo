package com.kris.abstractroutingdatasourcedemo.mapper;

import com.kris.abstractroutingdatasourcedemo.entity.User;

import java.util.List;

/**
 * @author Kairou Zeng
 */
public interface UserMapper {

    List<User> findAll();
}
