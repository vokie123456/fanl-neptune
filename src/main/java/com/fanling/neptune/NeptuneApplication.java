package com.fanling.neptune;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@MapperScan("com.fanling.neptune.mapper")
public class NeptuneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeptuneApplication.class, args);
        System.out.println("地址：http://localhost:9008/neptune");
    }
}
