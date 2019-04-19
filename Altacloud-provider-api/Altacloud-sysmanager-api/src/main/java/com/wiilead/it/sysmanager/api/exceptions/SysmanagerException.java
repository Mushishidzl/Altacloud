package com.wiilead.it.sysmanager.api.exceptions;

import com.wiilead.it.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: SysmanagerException
 * @Description: 系统模块异常处理
 * @Author mushishi
 * @Date 2019/4/19-13:47
 */
@Slf4j
public class SysmanagerException extends BusinessException {

    public SysmanagerException(String message) {
        super(message);
    }
}
