package com.foxxist.firefoxcenter.controller.user;

import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.model.user.bo.FoxUserBO;
import com.foxxist.firefoxcenter.model.user.request.PasswordLoginRequest;
import com.foxxist.firefoxcenter.model.user.request.RegisterRequest;
import com.foxxist.firefoxcenter.model.user.request.WxLoginRequest;
import com.foxxist.firefoxcenter.model.user.response.LoginResponse;
import com.foxxist.firefoxcenter.service.user.UserLoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户登录注册控制器
 */
@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "用户登陆控制器", description = "微信端 和后台react无关")
public class UserLoginController {

    private final UserLoginService userLoginService;

    /**
     * 处理微信登录请求的POST接口。
     * 该接口接收微信登录请求，调用用户登录服务进行登录或注册操作，并返回登录结果。
     *
     * @param request 微信登录请求对象
     * @return 返回包含登录结果的Result对象
     */
    @PostMapping("/login/wx")
    @Operation(summary = "微信登陆控制器")
    public Result<LoginResponse> wxLogin(@RequestBody WxLoginRequest request) {
        try {
            LoginResponse response = userLoginService.loginOrRegisterByWx(request);
            return Result.success(response);
        } catch (Exception e) {
            log.error("微信登录异常", e);
            return Result.error("微信登录失败：" + e.getMessage());
        }
    }

    /**
     * 密码登录
     */
    @PostMapping("/login/password")
    @Operation(summary = "微信普通账密登陆")
    public String passwordLogin(@RequestBody PasswordLoginRequest request) {
        // TODO: 实现密码登录逻辑
        return "密码登录成功";
    }

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        // TODO: 实现注册逻辑
        return "注册成功";
    }

    /**
     * 发送验证码
     */
    @PostMapping("/verify-code")
    public String sendVerifyCode(@RequestParam String phone) {
        // TODO: 实现发送验证码逻辑
        return "验证码发送成功";
    }

    /**
     * 退出登录
     */
    @PostMapping("/logout")
    public String logout() {
        // TODO: 实现退出登录逻辑
        return "退出登录成功";
    }
} 