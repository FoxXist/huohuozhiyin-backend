package com.foxxist.firefoxcenter.model.user.request;

import lombok.Data;

/**
 * 密码登录请求实体
 */
@Data
public class PasswordLoginRequest {
    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;
} 