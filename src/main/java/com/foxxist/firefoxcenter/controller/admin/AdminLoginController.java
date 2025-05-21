package com.foxxist.firefoxcenter.controller.admin;

import com.foxxist.firefoxcenter.model.admin.request.AdminLoginRequest;
import com.foxxist.firefoxcenter.model.admin.response.AdminLoginResponse;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.service.admin.AdminLoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "管理员登录控制器", description = "登录")
public class AdminLoginController {

    private final AdminLoginService adminService;

    /**
     * 管理员登录
     */
    @PostMapping("/login")
    @Operation(summary = "账密登录操作")
    public Result<AdminLoginResponse> login(@RequestBody AdminLoginRequest request) {
        try {
            AdminLoginResponse response = adminService.login(request);
            return Result.success(response);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }
} 