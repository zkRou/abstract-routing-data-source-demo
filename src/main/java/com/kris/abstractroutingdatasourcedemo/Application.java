package com.kris.abstractroutingdatasourcedemo;

import com.kris.abstractroutingdatasourcedemo.service.CourseService;
import com.kris.abstractroutingdatasourcedemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Autowired
    private CourseService courseService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("From first mysql, user list:{}", userService.findAll());
        log.info("From seconde mysql, course list:{}", courseService.findAll());
    }
}
