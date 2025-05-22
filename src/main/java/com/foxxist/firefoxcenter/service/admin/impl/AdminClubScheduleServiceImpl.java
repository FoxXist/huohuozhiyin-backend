package com.foxxist.firefoxcenter.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.mapper.club.FoxClubScheduleMapper;
import com.foxxist.firefoxcenter.model.club.po.FoxClubSchedulePO;
import com.foxxist.firefoxcenter.model.club.request.ClubScheduleListRequest;
import com.foxxist.firefoxcenter.model.club.vo.FoxClubScheduleVO;
import com.foxxist.firefoxcenter.service.admin.AdminClubScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 管理员俱乐部赛程服务实现类
 */
@Service
@RequiredArgsConstructor
public class AdminClubScheduleServiceImpl implements AdminClubScheduleService {

    private final FoxClubScheduleMapper foxClubScheduleMapper;

    @Override
    public Page<FoxClubScheduleVO> getScheduleList(ClubScheduleListRequest request) {
        // Step 1: 构建查询条件
        LambdaQueryWrapper<FoxClubSchedulePO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(request.getClubId() != null, FoxClubSchedulePO::getClubId, request.getClubId())
                .eq(request.getGameType() != null, FoxClubSchedulePO::getGameType, request.getGameType())
                .eq(request.getStatus() != null, FoxClubSchedulePO::getStatus, request.getStatus())
                .eq(request.getLevel() != null, FoxClubSchedulePO::getLevel, request.getLevel())
                .ge(StringUtils.hasText(request.getStartTime()), FoxClubSchedulePO::getStartTime, request.getStartTime())
                .le(StringUtils.hasText(request.getEndTime()), FoxClubSchedulePO::getEndTime, request.getEndTime())
                .orderByDesc(FoxClubSchedulePO::getCreateTime);

        // Step 2: 执行分页查询
        Page<FoxClubSchedulePO> page = new Page<>(request.getCurrent(), request.getSize());
        Page<FoxClubSchedulePO> resultPage = foxClubScheduleMapper.selectPage(page, wrapper);

        // Step 3: 转换为VO对象
        List<FoxClubScheduleVO> voList = resultPage.getRecords().stream()
                .map(this::convertToVO)
                .collect(Collectors.toList());

        // Step 4: 构建返回结果
        Page<FoxClubScheduleVO> voPage = new Page<>();
        BeanUtils.copyProperties(resultPage, voPage, "records");
        voPage.setRecords(voList);

        return voPage;
    }

    /**
     * 将PO对象转换为VO对象
     */
    private FoxClubScheduleVO convertToVO(FoxClubSchedulePO po) {
        FoxClubScheduleVO vo = new FoxClubScheduleVO();
        BeanUtils.copyProperties(po, vo);

        // 设置赛制名称
        switch (po.getGameType()) {
            case 1 -> vo.setGameTypeName("五人制");
            case 2 -> vo.setGameTypeName("六人制");
            case 3 -> vo.setGameTypeName("七人制");
            case 4 -> vo.setGameTypeName("八人制");
            case 5 -> vo.setGameTypeName("十一人制");
        }

        // 设置状态名称
        switch (po.getStatus()) {
            case 0 -> vo.setStatusName("未进行");
            case 1 -> vo.setStatusName("进行中");
            case 2 -> vo.setStatusName("已过期");
        }

        // 设置级别名称
        switch (po.getLevel()) {
            case 1 -> vo.setLevelName("养生");
            case 2 -> vo.setLevelName("锻炼");
            case 3 -> vo.setLevelName("激情");
        }

        return vo;
    }
} 