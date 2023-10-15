package com.linzzxz.spike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.linzzxz.spike.mapper")
public class SpikeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpikeApplication.class, args);
    }

}
