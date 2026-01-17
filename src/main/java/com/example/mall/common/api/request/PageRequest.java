package com.example.mall.common.api.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页请求对象
 * <p>用于分页查询请求参数的封装</p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageRequest extends BaseRequest{
    /**
     * 当前请求页数，默认第1页
     */
    @Schema(description = "当前请求页数" )
    private int pageNum=1;

    /**
     * 每页记录数，默认10条
     */
    @Schema(description = "每页记录数" )
    private int pageSize=10;
}
