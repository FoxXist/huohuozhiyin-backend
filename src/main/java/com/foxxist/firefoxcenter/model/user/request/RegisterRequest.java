package com.foxxist.firefoxcenter.model.user.request;

import lombok.Data;

/**
 * 注册请求实体
 */
@Data
public class RegisterRequest {
    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 验证码
     */
    private String verifyCode;

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