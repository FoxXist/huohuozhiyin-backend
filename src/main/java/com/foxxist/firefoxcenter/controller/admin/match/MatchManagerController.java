package com.foxxist.firefoxcenter.controller.admin.match;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.common.Result;
import com.foxxist.firefoxcenter.model.club.request.ClubScheduleListRequest;
import com.foxxist.firefoxcenter.model.club.vo.FoxClubScheduleVO;
import com.foxxist.firefoxcenter.service.admin.AdminClubScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 赛事管理控制器
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/22 14:57
 */
@Slf4j
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@Tag(name = "俱乐部赛事管理控制器", description = "查询获取俱乐部赛程 包含已完成 未进行 进行中")
public class MatchManagerController {

    private final AdminClubScheduleService adminClubScheduleService;

    @PostMapping("/match/list")
    @Operation(summary = "查询俱乐部赛程列表", description = "分页查询俱乐部赛程列表，支持多条件筛选")
    public Result<Page<FoxClubScheduleVO>> getScheduleList(@RequestBody ClubScheduleListRequest request) {
        return Result.success(adminClubScheduleService.getScheduleList(request));
    }
}
