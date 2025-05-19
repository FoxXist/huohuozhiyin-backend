package com.foxxist.firefoxcenter.model.user.request;

import lombok.Data;

/**
 * 微信登录请求实体
 */
@Data
public class WxLoginRequest {

    /**
     * 微信登录code
     */
    private String code;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像URL
     */
    private String avatarUrl;

    /**
     * 性别（0：未知，1：男，2：女）
     */
    private Integer gender;
} 