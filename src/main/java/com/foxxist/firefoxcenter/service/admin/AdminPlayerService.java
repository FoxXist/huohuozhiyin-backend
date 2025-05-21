package com.foxxist.firefoxcenter.service.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.player.request.PlayerListRequest;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerVO;

/**
 * 管理员球员服务接口
 */
public interface AdminPlayerService {
    /**
     * 分页查询球员列表
     *
     * @param request 查询请求参数
     * @return 球员列表分页数据
     */
    Page<FoxPlayerVO> getPlayerList(PlayerListRequest request);
} 