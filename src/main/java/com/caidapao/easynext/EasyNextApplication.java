package com.caidapao.easynext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

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
