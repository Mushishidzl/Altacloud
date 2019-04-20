package com.wiilead.it.log.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: LogAnnotation
 * @Description: 日志注解
 * @Author mushishi
 * @Date 2019/4/18-16:59
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {


    /**
     * 描述
     * @return
     */
    String desc();

}
