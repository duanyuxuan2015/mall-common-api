package com.example.mall.common.api.validation;

/**
 * 校验分组
 * <p>用于不同场景下的参数校验分组</p>
 */
public class ValidationGroups {
    /**
     * 更新操作校验分组
     */
    public interface Update {
    }

    /**
     * 插入操作校验分组
     */
    public interface Insert {
    }

    /**
     * 详情查询校验分组
     */
    public interface Detail {

    }

    /**
     * 删除操作校验分组
     */
    public interface Delete{

    }
}
