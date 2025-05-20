package com.foxxist.firefoxcenter.controller.admin;

import com.foxxist.firefoxcenter.model.admin.request.AdminLoginRequest;
import com.foxxist.firefoxcenter.model.admin.response.AdminLoginResponse;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.service.admin.FoxAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员登录控制器
 */
@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    @Autowired
    private FoxAdminService adminService;

    /**
     * 管理员登录
     */
    @PostMapping("/login")
    public Result<AdminLoginResponse> login(@RequestBody AdminLoginRequest request) {
        try {
            AdminLoginResponse response = adminService.login(request);
            return Result.success(response);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }
} 