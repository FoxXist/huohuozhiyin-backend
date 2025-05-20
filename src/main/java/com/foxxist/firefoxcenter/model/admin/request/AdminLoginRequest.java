package com.foxxist.firefoxcenter.model.admin.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 管理员登录请求对象
 */
@Data
@Schema(description = "管理员登录请求体")
public class AdminLoginRequest {
    /**
     * 管理员账号
     */
    @Schema(description = "账号", example = "admin123")
    private String username;

    /**
     * 管理员密码
     */
    @Schema(description = "密码", example = "password")
    private String password;
} 