package com.foxxist.firefoxcenter.model.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 统一响应对象
 */
@Data
@Schema(description = "通用结果集合", example = "")
public class Result<T> {
    /**
     * 状态码
     */
    @Schema(description = "状态码", example = "200 401 500")
    private Integer code;

    /**
     * 消息
     */
    @Schema(description = "消息信息", example = "失败或者成功")
    private String message;

    /**
     * 数据
     */
    @Schema(description = "负载数据", example = "有可能是各种数据对象")
    private T data;

    /**
     * 是否成功
     */
    @Schema(description = "是否成功", example = "true false")
    private Boolean success;

    /**
     * 成功响应
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setData(data);
        result.setSuccess(true);
        return result;
    }

    /**
     * 失败响应
     */
    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }
} 