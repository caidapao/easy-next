package com.caidapao.easynext.annotation;

import com.caidapao.easynext.annotation.EmptyCheck;
import com.caidapao.easynext.annotation.ImportConstant;

import java.lang.annotation.*;

/**
 * @author caixuan
 * @date 2023/3/5 11:00
 **/
@Documented
@EmptyCheck
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItemCheck {

    String column() default ImportConstant.ITEM_CODE;
}
