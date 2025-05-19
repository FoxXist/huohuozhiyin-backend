package com.foxxist.firefoxcenter.model.user.response;

import lombok.Data;

/**
 * 登录响应对象
 */
@Data
public class LoginResponse {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 登录token
     */
    private String token;

    /**
     * 是否新用户
     */
    private Boolean isNewUser;
} 