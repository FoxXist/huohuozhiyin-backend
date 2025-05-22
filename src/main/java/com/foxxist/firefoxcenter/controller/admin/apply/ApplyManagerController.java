package com.foxxist.firefoxcenter.controller.admin.apply;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.common.Result;
import com.foxxist.firefoxcenter.model.player.request.PlayerApplyListRequest;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerApplyVO;
import com.foxxist.firefoxcenter.service.admin.AdminPlayerApplyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入队申请管理 controller
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/22 9:45
 */
@Slf4j
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@Tag(name = "入队申请控制器", description = "查询入队申请列表 手动处理入队申请 查询入队申请记录")
public class ApplyManagerController {

    private final AdminPlayerApplyService adminPlayerApplyService;

    @PostMapping("/apply/list")
    @Operation(summary = "查询入队申请列表", description = "分页查询入队申请列表，支持多条件筛选")
    public Result<Page<FoxPlayerApplyVO>> getApplyList(@RequestBody PlayerApplyListRequest request) {
        return Result.success(adminPlayerApplyService.getApplyList(request));
    }
}
