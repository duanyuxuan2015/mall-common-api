package com.example.mall.common.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础DTO类
 * <p>所有数据传输对象的基类，包含公共的时间字段</p>
 */
@Data
public class BaseDTO implements Serializable {

    /**
     * 创建时间
     */
    @Schema(description = "创建时间" )
    protected LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Schema(description = "更新时间" )
    protected LocalDateTime updateTime;
}
