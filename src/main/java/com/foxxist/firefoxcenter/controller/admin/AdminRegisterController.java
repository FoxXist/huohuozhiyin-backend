package com.foxxist.firefoxcenter.controller.admin;

import com.foxxist.firefoxcenter.model.admin.bo.FoxAdminBO;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.model.admin.request.AdminLoginRequest;
import com.foxxist.firefoxcenter.model.admin.request.AdminRegisterRequest;
import com.foxxist.firefoxcenter.model.admin.response.AdminLoginResponse;
import com.foxxist.firefoxcenter.service.admin.AdminLoginService;
import com.foxxist.firefoxcenter.service.admin.AdminRegisterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员注册控制器
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/21 11:15
 */
@Slf4j
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@Tag(name = "管理员注册控制器", description = "注册 普通的账密注册 后期会添加手机号注册和jwt校验")
public class AdminRegisterController {

    private final AdminRegisterService adminRegisterService;

    /**
     * 管理员注册
     *
     * @param request 注册请求
     * @return 注册结果
     */
    @PostMapping("/register")
    @Operation(summary = "管理员注册")
    public Result<FoxAdminBO> register(@Valid @RequestBody AdminRegisterRequest request) {
        try {
            FoxAdminBO bo = adminRegisterService.register(request);
            return Result.success(bo);
        } catch (Exception e) {
            log.error("管理员注册失败", e);
            return Result.error(e.getMessage());
        }
    }
}
