package com.foxxist.firefoxcenter.controller.admin.panel;

import com.foxxist.firefoxcenter.model.club.vo.FoxClubVO;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.service.club.ClubInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员后台俱乐部信息控制器
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/20 15:13
 */
@RestController
@RequestMapping("/admin/panel/club")
@RequiredArgsConstructor
@Tag(name = "俱乐部信息看板", description = "球队概况 走势图 看板信息 默认应该重定向在登陆首页")
public class AdminClubInfoController {

    private final ClubInfoService clubInfoService;

    /**
     * 获取俱乐部信息
     * 由于是私人俱乐部，只会返回单条记录
     *
     * @return 俱乐部信息
     */
    @PostMapping("/info")
    @Operation(summary = "获取狐火之茵俱乐部信息")
    public Result<FoxClubVO> getClubInfo() {
        return Result.success(clubInfoService.getClubInfo());
    }
}
