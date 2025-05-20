package com.foxxist.firefoxcenter.service.admin;

import com.foxxist.firefoxcenter.model.admin.bo.FoxAdminBO;
import com.foxxist.firefoxcenter.model.admin.request.AdminLoginRequest;
import com.foxxist.firefoxcenter.model.admin.response.AdminLoginResponse;

/**
 * 管理员Service接口
 */
public interface AdminLoginService {
    /**
     * 管理员登录
     *
     * @param request 登录请求
     * @return 登录响应
     */
    AdminLoginResponse login(AdminLoginRequest request);

    /**
     * 根据用户名查询管理员
     *
     * @param username 用户名
     * @return 管理员信息
     */
    FoxAdminBO getByUsername(String username);
} 