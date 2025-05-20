package com.foxxist.firefoxcenter.model.admin.response;

import lombok.Data;
import java.util.List;

/**
 * 管理员登录响应对象
 */
@Data
public class AdminLoginResponse {
    /**
     * 管理员ID
     */
    private Long id;

    /**
     * 管理员账号
     */
    private String username;

    /**
     * 管理员昵称
     */
    private String nickname;

    /**
     * 管理员头像
     */
    private String avatar;

    /**
     * 权限级别
     */
    private Integer roleLevel;

    /**
     * 权限列表
     */
    private List<String> permissions;

    /**
     * 登录token
     */
    private String token;
} 