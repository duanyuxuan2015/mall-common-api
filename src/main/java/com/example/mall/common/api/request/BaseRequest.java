package com.example.mall.common.api.request;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * 基础请求类
 * <p>所有请求对象的基类，包含租户和渠道信息</p>
 */
@Data
public class BaseRequest implements Serializable {

    /**
     * 租户ID
     */
    @Schema(description = "租户ID" )
    protected Long saasId;

    /**
     * 渠道ID
     */
    @Schema(description = "渠道ID" )
    protected String channelId;
}
