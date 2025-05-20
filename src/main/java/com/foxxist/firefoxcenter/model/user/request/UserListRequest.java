package com.foxxist.firefoxcenter.model.user.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 用户列表查询请求对象
 */
@Data
@Schema(description = "用户列表查询请求")
public class UserListRequest {

    @Schema(description = "当前页码", example = "1")
    private Long current = 1L;

    @Schema(description = "每页大小", example = "15")
    private Long size = 15L;

    @Schema(description = "用户昵称", example = "张三")
    private String nickname;

    @Schema(description = "手机号", example = "13800138000")
    private String phone;

    @Schema(description = "用户状态（0：禁用，1：正常，2：待审核）", example = "1")
    private Integer status;
} 