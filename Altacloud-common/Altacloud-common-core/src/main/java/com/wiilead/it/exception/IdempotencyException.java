package com.wiilead.it.exception;

/**
 * @ClassName: IdempotencyException
 * @Description: 幂等性异常
 * @Author mushishi
 * @Date 2019/4/19-11:06
 */
public class IdempotencyException extends RuntimeException{

    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
