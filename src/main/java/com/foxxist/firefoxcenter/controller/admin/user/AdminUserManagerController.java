package com.foxxist.firefoxcenter.controller.admin.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.model.user.request.UserListRequest;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserVO;
import com.foxxist.firefoxcenter.service.user.UserManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class AdminUserManagerController {

    private final UserManagerService userManagerService;

    /**
     * 分页查询用户列表
     *
     * @param request 查询请求参数
     * @return 用户列表分页数据
     */
    @PostMapping("/list")
    public Result<Page<FoxUserVO>> getUserList(@RequestBody UserListRequest request) {
        return Result.success(userManagerService.getUserList(
            request.getCurrent(),
            request.getSize(),
            request.getNickname(),
            request.getPhone(),
            request.getStatus()
        ));
    }
}
