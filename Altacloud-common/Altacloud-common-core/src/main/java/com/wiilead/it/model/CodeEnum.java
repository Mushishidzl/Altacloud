package com.wiilead.it.model;

/**
 * @ClassName: CodeEnum
 * @Description: 变量
 * @Author mushishi
 * @Date 2019/4/19-11:01
 */
public enum CodeEnum {

    SUCCESS(0),
    ERROR(1);

    private Integer code;
    CodeEnum(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
