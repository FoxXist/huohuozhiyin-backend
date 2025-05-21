package com.foxxist.firefoxcenter.model.admin.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 管理员登录响应对象
 */
@Data
@Schema(description = "管理员登录响应")
public class AdminLoginResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    @Schema(description = "管理员ID")
    private Long id;

    /**
     * 用户名
     */
    @Schema(description = "用户名")
    private String username;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    private String nickname;

    /**
     * 头像URL
     */
    @Schema(description = "头像URL")
    private String avatarUrl;

    /**
     * 权限等级
     */
    @Schema(description = "权限等级")
    private Integer competence;

    /**
     * 权限名称
     */
    @Schema(description = "权限名称")
    private String competenceName;

    /**
     * 访问令牌
     */
    @Schema(description = "访问令牌")
    private String token;

    /**
     * 令牌过期时间
     */
    @Schema(description = "令牌过期时间")
    private LocalDateTime tokenExpireTime;

    /**
     * 权限级别
     */
    @Schema(description = "权限级别信息")
    private Integer roleLevel;
} 