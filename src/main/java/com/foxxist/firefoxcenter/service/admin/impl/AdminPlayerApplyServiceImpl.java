package com.foxxist.firefoxcenter.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.mapper.apply.FoxPlayerApplyMapper;
import com.foxxist.firefoxcenter.model.player.po.FoxPlayerApplyPO;
import com.foxxist.firefoxcenter.model.player.request.PlayerApplyListRequest;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerApplyVO;
import com.foxxist.firefoxcenter.service.admin.AdminPlayerApplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 管理员球员入队申请服务实现类
 */
@Service
@RequiredArgsConstructor
public class AdminPlayerApplyServiceImpl implements AdminPlayerApplyService {

    private final FoxPlayerApplyMapper foxPlayerApplyMapper;

    @Override
    public Page<FoxPlayerApplyVO> getApplyList(PlayerApplyListRequest request) {
        // Step 1: 构建查询条件
        LambdaQueryWrapper<FoxPlayerApplyPO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(request.getUserId() != null, FoxPlayerApplyPO::getUserId, request.getUserId())
                .like(StringUtils.hasText(request.getName()), FoxPlayerApplyPO::getName, request.getName())
                .like(StringUtils.hasText(request.getPhone()), FoxPlayerApplyPO::getPhone, request.getPhone())
                .eq(request.getAge() != null, FoxPlayerApplyPO::getAge, request.getAge())
                .eq(StringUtils.hasText(request.getRegion()), FoxPlayerApplyPO::getRegion, request.getRegion())
                .eq(StringUtils.hasText(request.getCity()), FoxPlayerApplyPO::getCity, request.getCity())
                .eq(StringUtils.hasText(request.getPosition()), FoxPlayerApplyPO::getPosition, request.getPosition())
                .eq(request.getStatus() != null, FoxPlayerApplyPO::getStatus, request.getStatus())
                .ge(StringUtils.hasText(request.getStartTime()), FoxPlayerApplyPO::getCreateTime, request.getStartTime())
                .le(StringUtils.hasText(request.getEndTime()), FoxPlayerApplyPO::getCreateTime, request.getEndTime())
                .orderByDesc(FoxPlayerApplyPO::getCreateTime);

        // Step 2: 执行分页查询
        Page<FoxPlayerApplyPO> page = new Page<>(request.getCurrent(), request.getSize());
        Page<FoxPlayerApplyPO> resultPage = foxPlayerApplyMapper.selectPage(page, wrapper);

        // Step 3: 转换为VO对象
        List<FoxPlayerApplyVO> voList = resultPage.getRecords().stream()
                .map(this::convertToVO)
                .collect(Collectors.toList());

        // Step 4: 构建返回结果
        Page<FoxPlayerApplyVO> voPage = new Page<>();
        BeanUtils.copyProperties(resultPage, voPage, "records");
        voPage.setRecords(voList);

        return voPage;
    }

    /**
     * 将PO对象转换为VO对象
     */
    private FoxPlayerApplyVO convertToVO(FoxPlayerApplyPO po) {
        FoxPlayerApplyVO vo = new FoxPlayerApplyVO();
        BeanUtils.copyProperties(po, vo);
        return vo;
    }
} 