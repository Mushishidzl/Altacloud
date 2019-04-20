package com.wiilead.it.sysmanager.api.service.impl;

import com.wiilead.it.model.ResultVO;
import com.wiilead.it.sysmanager.api.model.vo.SysLogVO;
import com.wiilead.it.sysmanager.api.service.SysLogFeginApi;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SysLogFeginApiImpl
 * @Description: 保存日志的实现类
 * @Author mushishi
 * @Date 2019/4/20-9:30
 */
@Slf4j
@Component
public class SysLogFeginFallbackImpl implements SysLogFeginApi {

    @Setter
    private Throwable cause;

    @Override
    public ResultVO<Boolean> saveLog(SysLogVO sysLog, String from) {
        log.error("feign 插入日志失败", cause);
        return null;
    }

    public void setCause(Throwable throwable) {
    }
}
