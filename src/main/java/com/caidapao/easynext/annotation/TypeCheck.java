package com.caidapao.easynext.annotation;

import java.lang.annotation.*;

/**
 * @author caixuan
 * @date 2023/3/5 10:54
 **/
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeCheck {

    Class<Object> expectType() default Object.class;
}
