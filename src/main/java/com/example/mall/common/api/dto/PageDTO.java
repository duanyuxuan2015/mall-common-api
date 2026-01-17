package com.example.mall.common.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页数据传输对象
 * <p>用于封装分页查询的返回结果</p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageDTO extends BaseDTO{
    /**
     * 记录总数
     */
    @Schema(description = "记录总数" )
    private long total;

    /**
     * 每页记录数
     */
    @Schema(description = "每页记录数" )
    private long size;

    /**
     * 当前页数
     */
    @Schema(description = "当前页数" )
    private long current;
}
