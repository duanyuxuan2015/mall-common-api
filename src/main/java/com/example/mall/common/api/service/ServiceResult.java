package com.example.mall.common.api.service;

import com.example.mall.common.api.exception.BusinessException;
import lombok.Data;

/**
 * 服务结果封装类
 * <p>用于统一封装服务层的返回结果，包含成功状态、错误信息和业务数据</p>
 * @param <T> 业务数据类型
 */
@Data
public class ServiceResult<T> {
    /**
     * 处理是否正确结束
     */
    private boolean success;

    /**
     * 异常编码
     */
    private Integer errorCode;

    /**
     * 异常描述
     */
    private String errorMsg;

    /**
     * 业务数据
     */
    private T data;

    /**
     * 私有构造函数，通过静态方法创建对象
     */
    private ServiceResult() {
    }

    /**
     * 带参数的构造函数，用于快速初始化
     * @param success 成功标识
     * @param errorCode 错误编码
     * @param errorMsg 错误消息
     * @param data 业务数据
     */
    private ServiceResult(boolean success, Integer errorCode, String errorMsg, T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 创建成功结果（带数据）
     * @param data 业务数据
     * @param <T> 数据类型
     * @return 成功结果对象
     */
    public static <T> ServiceResult<T> success(T data) {
        return new ServiceResult<>(true, null, null, data);
    }

    /**
     * 创建成功结果（无数据）
     * @param <T> 数据类型
     * @return 成功结果对象
     */
    public static <T> ServiceResult<T> success() {
        return new ServiceResult<>(true, null, null, null);
    }


    /**
     * 创建失败结果（无错误信息）
     * @param <T> 数据类型
     * @return 失败结果对象
     */
    public static <T> ServiceResult<T> fail() {
        return new ServiceResult<>(false, null, null, null);
    }

    /**
     * 创建失败结果（带错误信息）
     * @param errorCode 错误编码
     * @param errorMsg 错误消息
     * @param <T> 数据类型
     * @return 失败结果对象
     */
    public static <T> ServiceResult<T> fail(Integer errorCode, String errorMsg) {
        return new ServiceResult<>(false, errorCode, errorMsg, null);
    }


    /**
     * 创建失败结果（带错误信息和数据）
     * @param errorCode 错误编码
     * @param errorMsg 错误消息
     * @param data 业务数据
     * @param <T> 数据类型
     * @return 失败结果对象
     */
    public static <T> ServiceResult<T> fail(Integer errorCode, String errorMsg,T data) {
        return new ServiceResult<>(false, errorCode, errorMsg, data);
    }

    /**
     * 创建失败结果（从业务异常创建）
     * @param businessException 业务异常对象
     * @param <T> 数据类型
     * @return 失败结果对象
     */
    public static <T> ServiceResult<T> fail(BusinessException businessException) {
        return new ServiceResult<>(false, businessException.getCode(), businessException.getMessage(), null);
    }


}
