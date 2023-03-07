package com.caidapao.easynext.conf;

import com.caidapao.easynext.annotation.resolver.ImportCheckParamArgResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author caixuan
 * @date 2023/3/4 10:52
 **/
@Configuration
public class WebConfigure implements WebMvcConfigurer {

    @Autowired
    private ImportCheckParamArgResolver importCheckParamArgResolver;

    /**
     * 其实从这里看出来，与配置在spring-servlet.xml中相比，都是实例化一个自己注解解析器，
     * 然后将它add进spring的List<HandlerMethodArgumentResolver> argumentResolvers中
     * 最后交给spring统一管理
     * @param argumentResolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(importCheckParamArgResolver);
    }

}
