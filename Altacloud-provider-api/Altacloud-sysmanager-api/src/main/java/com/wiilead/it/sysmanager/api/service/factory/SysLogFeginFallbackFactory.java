package com.wiilead.it.sysmanager.api.service.factory;

import com.wiilead.it.sysmanager.api.service.SysLogFeginApi;
import com.wiilead.it.sysmanager.api.service.impl.SysLogFeginFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SysLogFeginFallbackFactory
 * @Description:
 * @Author mushishi
 * @Date 2019/4/20-9:28
 */
@Component
public class SysLogFeginFallbackFactory implements FallbackFactory<SysLogFeginApi> {


    @Override
    public SysLogFeginApi create(Throwable throwable) {
        SysLogFeginFallbackImpl sysLogFeginFallback = new SysLogFeginFallbackImpl();
        sysLogFeginFallback.setCause(throwable);
        return sysLogFeginFallback;
    }
}
