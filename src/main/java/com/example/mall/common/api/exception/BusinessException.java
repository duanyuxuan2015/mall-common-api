package com.example.mall.common.api.exception;

/**
 * 业务异常类
 * <p>用于封装业务逻辑中的异常信息</p>
 */
public class BusinessException extends Exception {
    /**
     * 异常编码
     */
    private Integer code;

    /**
     * 异常消息
     */
    private String message;

    /**
     * 默认构造函数
     */
    public BusinessException() {
    }

    /**
     * 构造函数
     * @param message 异常消息
     */
    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * 构造函数
     * @param code 异常编码
     * @param message 异常消息
     */
    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 构造函数
     * @param code 异常编码
     * @param message 异常消息
     * @param e 原始异常对象
     */
    public BusinessException(Integer code, String message, Throwable e) {
        super(message, e);
        this.code = code;
        this.message = message;
    }


    /**
     * 获取异常编码
     * @return 异常编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置异常编码
     * @param code 异常编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取异常消息
     * @return 异常消息
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 设置异常消息
     * @param message 异常消息
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
