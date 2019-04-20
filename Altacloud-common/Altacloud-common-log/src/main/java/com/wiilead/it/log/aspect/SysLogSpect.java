package com.wiilead.it.log.aspect;

import com.wiilead.it.log.annotation.LogAnnotation;
import com.wiilead.it.log.event.SysLogEvent;
import com.wiilead.it.log.util.SysLogUtils;
import com.wiilead.it.sysmanager.api.model.vo.SysLogVO;
import com.wiilead.it.utils.SpringContextHolder;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @ClassName: SysLogSpect
 * @Description: 切面保存日志
 * @Author mushishi
 * @Date 2019/4/18-17:01
 */
@Aspect
@Slf4j
public class SysLogSpect {


    @Around("@annotation(logAnnotation)")
    @SneakyThrows
    public Object around(ProceedingJoinPoint point, LogAnnotation logAnnotation) {
        String strClassName = point.getTarget().getClass().getName();
        String strMethodName = point.getSignature().getName();
        log.debug("[类名]:{},[方法]:{}", strClassName, strMethodName);

        SysLogVO sysLog = SysLogUtils.getSysLog();
        sysLog.setTitle(logAnnotation.desc());
        // 发送异步日志事件
        Long startTime = System.currentTimeMillis();
        Object obj = point.proceed();
        Long endTime = System.currentTimeMillis();
        sysLog.setTime(endTime - startTime);
        SpringContextHolder.publishEvent(new SysLogEvent(sysLog));
        return obj;
    }
}
