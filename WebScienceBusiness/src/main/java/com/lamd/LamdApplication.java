package com.lamd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@MapperScan("com.lamd.dao.mapper")
public class LamdApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(LamdApplication.class, args);
    }

}
