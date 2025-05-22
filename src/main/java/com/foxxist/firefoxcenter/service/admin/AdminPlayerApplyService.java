package com.foxxist.firefoxcenter.service.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.player.request.PlayerApplyListRequest;
import com.foxxist.firefoxcenter.model.player.request.PlayerApplyStatusRequest;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerApplyVO;

/**
 * 管理员球员入队申请服务接口
 */
public interface AdminPlayerApplyService {

    /**
     * 分页查询入队申请列表
     *
     * @param request 查询请求参数
     * @return 分页结果
     */
    Page<FoxPlayerApplyVO> getApplyList(PlayerApplyListRequest request);

    /**
     * 更新入队申请状态
     *
     * @param request 状态更新请求
     * @return 是否更新成功
     */
    boolean updateApplyStatus(PlayerApplyStatusRequest request);
} 