package com.caidapao.easynext.annotation;

import java.lang.annotation.*;

/**
 * @author caixuan
 * @date 2023/3/5 10:53
 **/
@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmptyCheck {

}
