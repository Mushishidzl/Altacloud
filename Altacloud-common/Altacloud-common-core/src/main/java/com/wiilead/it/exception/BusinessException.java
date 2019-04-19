package com.wiilead.it.exception;

/**
 * @ClassName: BusinessException
 * @Description: 业务异常处理
 * @Author mushishi
 * @Date 2019/4/19-11:04
 */
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
