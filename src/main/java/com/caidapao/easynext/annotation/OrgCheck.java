package com.caidapao.easynext.annotation;

import java.lang.annotation.*;

/**
 * @author caixuan
 * @date 2023/3/5 11:00
 **/
@Documented
@EmptyCheck
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OrgCheck {

    String column() default ImportConstant.ABBR_NAME;
}
