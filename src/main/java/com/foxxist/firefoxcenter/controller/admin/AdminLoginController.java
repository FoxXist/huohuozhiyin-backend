package com.foxxist.firefoxcenter.controller.admin;

import com.foxxist.firefoxcenter.model.admin.request.AdminLoginRequest;
import com.foxxist.firefoxcenter.model.admin.response.AdminLoginResponse;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.service.admin.AdminLoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员登录控制器
 */
@Slf4j
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminLoginController {

    private final AdminLoginService adminService;

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