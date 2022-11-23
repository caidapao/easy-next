package com.caidapao.easynext;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cdp
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.caidapao.easynext.repository.mapper"})
public class EasyNextApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyNextApplication.class, args);
    }

}
