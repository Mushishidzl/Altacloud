package com.wiilead.it.log.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: SystemLog
 * @Description: 日志注解
 * @Author mushishi
 * @Date 2019/4/18-16:59
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {


    /**
     * 描述
     * @return
     */
    String desc();

}
