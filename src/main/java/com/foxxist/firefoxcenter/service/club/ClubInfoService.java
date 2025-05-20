package com.foxxist.firefoxcenter.service.club;

import com.foxxist.firefoxcenter.model.club.vo.FoxClubVO;

/**
 * 俱乐部信息服务接口
 */
public interface ClubInfoService {

    /**
     * 获取俱乐部信息
     * 由于是私人俱乐部，只会返回单条记录
     *
     * @return 俱乐部信息
     */
    FoxClubVO getClubInfo();
} 