package com.caidapao.easynext.annotation;

import org.springframework.web.bind.annotation.RequestBody;

import java.lang.annotation.*;

/**
 * 导入检查
 *
 * @author caixuan
 * @date 2023/3/4 10:39
 **/
@Documented
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportCheck {

}
