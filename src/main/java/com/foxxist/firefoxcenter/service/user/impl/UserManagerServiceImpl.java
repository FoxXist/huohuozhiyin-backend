package com.foxxist.firefoxcenter.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.mapper.FoxUserMapper;
import com.foxxist.firefoxcenter.model.user.po.FoxUserPO;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserVO;
import com.foxxist.firefoxcenter.service.user.UserManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户管理服务实现类
 */
@Service
@RequiredArgsConstructor
public class UserManagerServiceImpl implements UserManagerService {

    private final FoxUserMapper foxUserMapper;

    @Override
    public Page<FoxUserVO> getUserList(Long current, Long size, String nickname, String phone, Integer status) {
        // Step 1: 构建查询条件
        LambdaQueryWrapper<FoxUserPO> queryWrapper = new LambdaQueryWrapper<FoxUserPO>()
                .like(StringUtils.isNotBlank(nickname), FoxUserPO::getNickname, nickname)
                .like(StringUtils.isNotBlank(phone), FoxUserPO::getPhone, phone)
                .eq(status != null, FoxUserPO::getStatus, status)
                .orderByDesc(FoxUserPO::getCreateTime);

        // Step 2: 执行分页查询
        Page<FoxUserPO> page = new Page<>(current, size);
        Page<FoxUserPO> userPage = foxUserMapper.selectPage(page, queryWrapper);

        // Step 3: 转换为VO对象
        List<FoxUserVO> userVOList = userPage.getRecords().stream()
                .map(this::convertToVO)
                .collect(Collectors.toList());

        // 构建返回结果
        Page<FoxUserVO> resultPage = new Page<>();
        BeanUtils.copyProperties(userPage, resultPage, "records");
        resultPage.setRecords(userVOList);

        return resultPage;
    }

    /**
     * 将PO对象转换为VO对象
     */
    private FoxUserVO convertToVO(FoxUserPO userPO) {
        FoxUserVO userVO = new FoxUserVO();
        BeanUtils.copyProperties(userPO, userVO);
        
        // 设置状态名称
        userVO.setStatusName(getStatusName(userPO.getStatus()));
        
        // 设置用户类型名称
        userVO.setUserTypeName(getUserTypeName(userPO.getIsPlayer()));
        
        return userVO;
    }

    /**
     * 获取状态名称
     */
    private String getStatusName(Integer status) {
        if (status == null) {
            return "未知";
        }
        return switch (status) {
            case 0 -> "禁用";
            case 1 -> "正常";
            case 2 -> "待审核";
            default -> "未知";
        };
    }

    /**
     * 获取用户类型名称
     */
    private String getUserTypeName(Integer isPlayer) {
        if (isPlayer == null) {
            return "未知";
        }
        return isPlayer == 1 ? "球员" : "普通用户";
    }
} 