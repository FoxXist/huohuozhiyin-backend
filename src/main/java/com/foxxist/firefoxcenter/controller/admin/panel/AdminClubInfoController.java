package com.foxxist.firefoxcenter.controller.admin.panel;

import com.foxxist.firefoxcenter.model.club.vo.FoxClubVO;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.service.club.ClubInfoService;
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
public class AdminClubInfoController {

    private final ClubInfoService clubInfoService;

    /**
     * 获取俱乐部信息
     * 由于是私人俱乐部，只会返回单条记录
     *
     * @return 俱乐部信息
     */
    @PostMapping("/info")
    public Result<FoxClubVO> getClubInfo() {
        return Result.success(clubInfoService.getClubInfo());
    }
}
