package com.kris.abstractroutingdatasourcedemo.service;

import com.kris.abstractroutingdatasourcedemo.entity.Course;
import com.kris.abstractroutingdatasourcedemo.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Kairou Zeng
 */
@Component
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> findAll() {
        return courseMapper.findAll();
    }
}
