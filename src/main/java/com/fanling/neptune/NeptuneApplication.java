package com.fanling.neptune;

import com.fanling.neptune.config.NeptuneConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({NeptuneConfig.class})
@MapperScan("com.fanling.neptune.mapper")
public class NeptuneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeptuneApplication.class, args);
        System.out.println("地址：http://localhost:9008/neptune");
    }
}
