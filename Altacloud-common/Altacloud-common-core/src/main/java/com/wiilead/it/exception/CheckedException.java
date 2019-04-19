package com.wiilead.it.exception;

/**
 * @ClassName: CheckedException
 * @Description: 检查异常处理
 * @Author mushishi
 * @Date 2019/4/19-13:33
 */
public class CheckedException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(Throwable cause) {
        super(cause);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
