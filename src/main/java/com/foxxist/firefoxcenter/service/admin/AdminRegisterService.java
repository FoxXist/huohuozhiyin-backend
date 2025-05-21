package com.foxxist.firefoxcenter.service.admin;

import com.foxxist.firefoxcenter.model.admin.bo.FoxAdminBO;
import com.foxxist.firefoxcenter.model.admin.request.AdminRegisterRequest;

/**
 * 管理员注册服务接口
 */
public interface AdminRegisterService {
    /**
     * 管理员注册
     *
     * @param request 注册请求
     */
    FoxAdminBO register(AdminRegisterRequest request);
} 