package com.example.mall.common.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础数据对象
 * <p>所有数据库实体对象的基类，包含公共字段</p>
 */
@Data
public class BaseDO implements Serializable {
    /**
     * 主键
     */
    protected Long id;


    /**
     * 创建时间
     */
    protected LocalDateTime createTime;

    /**
     * 更新时间
     */
    protected LocalDateTime updateTime;

    /**
     * 创建人
     */
    protected String createBy;

    /**
     * 更新人
     */
    protected String updateBy;
}
