package com.foxxist.firefoxcenter.service.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.club.request.ClubScheduleListRequest;
import com.foxxist.firefoxcenter.model.club.vo.FoxClubScheduleVO;

/**
 * 管理员俱乐部赛程服务接口
 */
public interface AdminClubScheduleService {

    /**
     * 分页查询俱乐部赛程列表
     *
     * @param request 查询请求参数
     * @return 分页结果
     */
    Page<FoxClubScheduleVO> getScheduleList(ClubScheduleListRequest request);
} 