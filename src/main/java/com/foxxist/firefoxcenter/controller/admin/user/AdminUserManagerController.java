package com.foxxist.firefoxcenter.controller.admin.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.model.user.request.UserDetailRequest;
import com.foxxist.firefoxcenter.model.user.request.UserListRequest;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserDetailVO;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserVO;
import com.foxxist.firefoxcenter.service.admin.AdminUserManagerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员后台用户管理控制器
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/20 15:35
 */
@RestController
@RequestMapping("/admin/user")
@RequiredArgsConstructor
@Tag(name = "管理员用户管理控制器", description = "用户管理列表界面")
public class AdminUserManagerController {

    private final AdminUserManagerService adminUserManagerService;

    /**
     * 分页查询用户列表
     *
     * @param request 查询请求参数
     * @return 用户列表分页数据
     */
    @PostMapping("/list")
    @Operation(summary = "查询用户列表")
    public Result<Page<FoxUserVO>> getUserList(@RequestBody UserListRequest request) {
        return Result.success(adminUserManagerService.getUserList(request));
    }

    /**
     * 查询用户详情
     * 根据请求参数返回用户详细信息，可选择性包含球员信息、俱乐部信息和统计数据
     *
     * @param request 查询请求参数
     * @return 用户详情信息
     */
    @PostMapping("/detail")
    @Operation(summary = "查询用户详情")
    public Result<FoxUserDetailVO> getUserDetail(@RequestBody UserDetailRequest request) {
        return Result.success(adminUserManagerService.getUserDetail(request));
    }
}
