package com.kris.abstractroutingdatasourcedemo.mapper;

import com.kris.abstractroutingdatasourcedemo.entity.Course;

import java.util.List;

/**
 * @author Kairou Zeng
 */
public interface CourseMapper {

    List<Course> findAll();
}
