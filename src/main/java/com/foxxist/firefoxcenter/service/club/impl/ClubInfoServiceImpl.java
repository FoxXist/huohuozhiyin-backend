package com.foxxist.firefoxcenter.service.club.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.foxxist.firefoxcenter.mapper.club.FoxClubMapper;
import com.foxxist.firefoxcenter.model.club.bo.FoxClubBO;
import com.foxxist.firefoxcenter.model.club.po.FoxClubPO;
import com.foxxist.firefoxcenter.model.club.vo.FoxClubVO;
import com.foxxist.firefoxcenter.service.club.ClubInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 俱乐部信息服务实现类
 */
@Service
@RequiredArgsConstructor
public class ClubInfoServiceImpl implements ClubInfoService {

    private final FoxClubMapper foxClubMapper;

    @Override
    public FoxClubVO getClubInfo() {
        // 查询俱乐部信息 总共就一个俱乐部 直接无脑查
        FoxClubPO clubPO = foxClubMapper.selectOne(
            new LambdaQueryWrapper<FoxClubPO>()
                .last("LIMIT 1")
        );

        if (clubPO == null) {
            throw new RuntimeException("俱乐部信息不存在");
        }

        // 转换为BO对象
        FoxClubBO clubBO = new FoxClubBO();
        BeanUtils.copyProperties(clubPO, clubBO);

        // 计算胜率
        if (clubBO.getTotalMatches() != null && clubBO.getTotalMatches() > 0) {
            clubBO.setWinRate((double) clubBO.getWinMatches() / clubBO.getTotalMatches());
        }

        // 设置状态名称
        clubBO.setStatusName(getStatusName(clubBO.getStatus()));
        
        // 设置等级名称
        clubBO.setLevelName(getLevelName(clubBO.getLevel()));

        // 转换为VO对象
        FoxClubVO clubVO = new FoxClubVO();
        BeanUtils.copyProperties(clubBO, clubVO);

        return clubVO;
    }

    /**
     * 获取状态名称
     */
    private String getStatusName(Integer status) {
        if (status == null) {
            return "未知";
        }
        return switch (status) {
            case 0 -> "未激活";
            case 1 -> "正常";
            case 2 -> "暂停运营";
            default -> "未知";
        };
    }

    /**
     * 获取等级名称
     */
    private String getLevelName(Integer level) {
        if (level == null) {
            return "未知";
        }
        return switch (level) {
            case 1 -> "初级俱乐部";
            case 2 -> "中级俱乐部";
            case 3 -> "高级俱乐部";
            case 4 -> "精英俱乐部";
            case 5 -> "传奇俱乐部";
            default -> "未知";
        };
    }
} 