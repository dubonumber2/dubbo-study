package com.dubo.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Administrator on 2017/10/20 0020.
 */
@Target({TYPE,METHOD})
@Retention(RUNTIME)
public @interface DataSource {
    String value();
}
