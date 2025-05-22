package com.foxxist.firefoxcenter.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.mapper.player.FoxPlayerMapper;
import com.foxxist.firefoxcenter.model.player.po.FoxPlayerPO;
import com.foxxist.firefoxcenter.model.player.request.PlayerListRequest;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerVO;
import com.foxxist.firefoxcenter.service.admin.AdminPlayerService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 管理员球员服务实现类
 */
@Service
@RequiredArgsConstructor
public class AdminPlayerServiceImpl implements AdminPlayerService {

    private final FoxPlayerMapper playerMapper;

    @Override
    public Page<FoxPlayerVO> getPlayerList(PlayerListRequest request) {

        // Step 1: 构建查询条件
        LambdaQueryWrapper<FoxPlayerPO> wrapper = new LambdaQueryWrapper<FoxPlayerPO>()
            .like(StringUtils.isNotBlank(request.getName()), FoxPlayerPO::getName, request.getName())
            .like(StringUtils.isNotBlank(request.getNumber()), FoxPlayerPO::getJerseyNumber, request.getNumber())
            .like(StringUtils.isNotBlank(request.getPosition()), FoxPlayerPO::getPosition, request.getPosition())
            .eq(request.getStatus() != null, FoxPlayerPO::getStatus, request.getStatus())
            .orderByDesc(FoxPlayerPO::getCreateTime);

        // Step 2: 执行分页查询
        Page<FoxPlayerPO> page = playerMapper.selectPage(
            new Page<>(request.getCurrent(), request.getSize()),
            wrapper
        );

        // Step 3: 转换为VO对象
        List<FoxPlayerVO> records = page.getRecords().stream()
            .map(this::convertToVO)
            .collect(Collectors.toList());

        // Step 4: 构建返回结果
        Page<FoxPlayerVO> result = new Page<>();
        BeanUtils.copyProperties(page, result, "records");
        result.setRecords(records);

        return result;
    }

    /**
     * 将PO对象转换为VO对象
     *
     * @param po PO对象
     * @return VO对象
     */
    private FoxPlayerVO convertToVO(FoxPlayerPO po) {
        FoxPlayerVO vo = new FoxPlayerVO();
        BeanUtils.copyProperties(po, vo);
        return vo;
    }
} 