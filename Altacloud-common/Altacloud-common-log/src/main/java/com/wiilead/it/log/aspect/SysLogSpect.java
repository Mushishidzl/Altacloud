package com.wiilead.it.log.aspect;

import com.wiilead.it.log.annotation.SystemLog;
import com.wiilead.it.log.util.SysLogUtils;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @ClassName: SysLogSpect
 * @Description: 切面
 * @Author mushishi
 * @Date 2019/4/18-17:01
 */
@Aspect
@Slf4j
public class SysLogSpect {


    @Around("@annotation(systemLog)")
    @SneakyThrows
    public Object around(ProceedingJoinPoint point, SystemLog systemLog) {
        String strClassName = point.getTarget().getClass().getName();
        String strMethodName = point.getSignature().getName();
        log.debug("[类名]:{},[方法]:{}", strClassName, strMethodName);

        SysLogUtils.getSysLog();
        logVo.setTitle(systemLog.desc());
        // 发送异步日志事件
        Long startTime = System.currentTimeMillis();
        Object obj = point.proceed();
        Long endTime = System.currentTimeMillis();
        logVo.setTime(endTime - startTime);
        SpringContextHolder.publishEvent(new SysLogEvent(logVo));
        return obj;
    }
}
