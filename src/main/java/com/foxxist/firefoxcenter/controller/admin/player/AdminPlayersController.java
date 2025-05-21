package com.foxxist.firefoxcenter.controller.admin.player;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.common.Result;
import com.foxxist.firefoxcenter.model.player.request.PlayerListRequest;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerVO;
import com.foxxist.firefoxcenter.service.admin.AdminPlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 俱乐部球员管理控制器
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/21 15:12
 */
@Slf4j
@RestController
@RequestMapping("/admin/player")
@RequiredArgsConstructor
@Tag(name = "俱乐部球员管理控制器", description = "球员列表 球员详情 球员编辑等")
public class AdminPlayersController {

    private final AdminPlayerService adminPlayerService;

    /**
     * 分页查询球员列表
     *
     * @param request 查询请求参数
     * @return 球员列表分页数据
     */
    @PostMapping("/list")
    @Operation(summary = "查询球员列表")
    public Result<Page<FoxPlayerVO>> getPlayerList(@RequestBody PlayerListRequest request) {
        return Result.success(adminPlayerService.getPlayerList(request));
    }
}
