package com.example.mall.common.api.constants;

import lombok.Getter;


/**
 * 结果码枚举
 * <p>定义系统中通用的响应状态码</p>
 */
@Getter
public enum ResultCodeEnum {

	/**
	 * ok
	 */
	OK(0, "ok"),

	/**
	 * 方法参数没有校验，内容由输入内容决定
	 */
	METHOD_ARGUMENT_NOT_VALID(10001, "参数异常"),

	/**
	 * 无法读取获取请求参数
	 */
	HTTP_MESSAGE_NOT_READABLE(10002, "请求参数格式有误"),

	/**
	 * 未授权
	 */
	UNAUTHORIZED(10003, "Unauthorized"),

	/**
	 * 服务器出了点小差
	 */
	EXCEPTION(10005, "服务器出了点小差"),

	/**
	 * 数据异常
	 */
	DATA_ERROR(10006, "数据异常，请刷新后重新操作"),

	/**
	 * 一些需要登录的接口，而实际上因为前端无法知道token是否已过期，导致token已失效时，
	 * 应该返回一个状态码，告诉前端token已经失效了，及时清理
	 */
	CLEAN_TOKEN(10007, "clean token"),

	/**
	 * 刷新token已过期
	 */
	REFRESH_TOKEN_EXIST(10008, "refresh token exist");


	/**
	 * 响应编码
	 */
	private final Integer code;

	/**
	 * 响应消息
	 */
	private final String msg;

	ResultCodeEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}


}
