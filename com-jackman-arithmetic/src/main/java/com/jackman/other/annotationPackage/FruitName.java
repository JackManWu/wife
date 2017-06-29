package com.jackman.other.annotationPackage;

import java.lang.annotation.*;

/**
 * Created by JackManWu on 2016/10/31.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitName {
    String value() default "";
}
