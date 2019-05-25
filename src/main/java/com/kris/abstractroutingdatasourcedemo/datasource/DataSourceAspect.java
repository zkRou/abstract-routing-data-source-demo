package com.kris.abstractroutingdatasourcedemo.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 定义动态切换数据源的切面
 *
 * @author Kairou Zeng
 */
@Slf4j
@Aspect
@Component
public class DataSourceAspect {

    @Before("execution(* com.kris.abstractroutingdatasourcedemo.service.UserService.*(..))")
    public void setFirstDataSource() {
        log.info("Set DataSource:{}", DatabaseType.FIRST_MYSQL.name());
        DataSourceHolder.setDatabaseType(DatabaseType.FIRST_MYSQL);
    }

    @Before("execution(* com.kris.abstractroutingdatasourcedemo.service.CourseService.*(..))")
    public void setSecondDataSource() {
        log.info("Set DataSource:{}", DatabaseType.SECOND_MYSQL.name());
        DataSourceHolder.setDatabaseType(DatabaseType.SECOND_MYSQL);
    }
}
