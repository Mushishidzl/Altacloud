package com.wiilead.it.sysmanager.api.service;

import com.wiilead.it.constant.SecurityConstants;
import com.wiilead.it.constant.ServiceNameConstant;
import com.wiilead.it.model.ResultVO;
import com.wiilead.it.sysmanager.api.model.vo.SysLogVO;
import com.wiilead.it.sysmanager.api.service.factory.SysLogFeginFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @ClassName: SysLogFeginApi
 * @Description: 远程调用保存日志
 * @Author mushishi
 * @Date 2019/4/20-9:21
 */
@FeignClient(value = ServiceNameConstant.SYSMANAGER_SERVICE, fallbackFactory = SysLogFeginFallbackFactory.class)
public interface SysLogFeginApi {

    /**
     * 保存日志
     *
     * @param sysLog 日志实体
     * @param from   内部调用标志
     * @return succes、false
     */
    @PostMapping("/log")
    ResultVO<Boolean> saveLog(@RequestBody SysLogVO sysLog, @RequestHeader(SecurityConstants.FROM) String from);
}
