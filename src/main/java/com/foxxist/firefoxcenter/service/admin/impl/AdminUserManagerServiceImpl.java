package com.foxxist.firefoxcenter.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.mapper.club.FoxClubMapper;
import com.foxxist.firefoxcenter.mapper.player.FoxPlayerMapper;
import com.foxxist.firefoxcenter.mapper.user.FoxUserMapper;
import com.foxxist.firefoxcenter.model.player.po.FoxPlayerPO;
import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerVO;
import com.foxxist.firefoxcenter.model.user.po.FoxUserPO;
import com.foxxist.firefoxcenter.model.user.request.UserDetailRequest;
import com.foxxist.firefoxcenter.model.user.request.UserListRequest;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserDetailVO;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserVO;
import com.foxxist.firefoxcenter.service.admin.AdminUserManagerService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户管理服务实现类
 */
@Service
@RequiredArgsConstructor
public class AdminUserManagerServiceImpl implements AdminUserManagerService {

    private final FoxUserMapper foxUserMapper;
    private final FoxPlayerMapper foxPlayerMapper;
    private final FoxClubMapper foxClubMapper;

    @Override
    public Page<FoxUserVO> getUserList(UserListRequest request) {
        // 构建查询条件
        LambdaQueryWrapper<FoxUserPO> queryWrapper = new LambdaQueryWrapper<FoxUserPO>()
                .like(StringUtils.isNotBlank(request.getNickname()), FoxUserPO::getNickname, request.getNickname())
                .like(StringUtils.isNotBlank(request.getPhone()), FoxUserPO::getPhone, request.getPhone())
                .eq(request.getStatus() != null, FoxUserPO::getStatus, request.getStatus())
                .orderByDesc(FoxUserPO::getCreateTime);

        // 执行分页查询
        Page<FoxUserPO> page = new Page<>(request.getCurrent(), request.getSize());
        Page<FoxUserPO> userPage = foxUserMapper.selectPage(page, queryWrapper);

        // 转换为VO对象
        List<FoxUserVO> userVOList = userPage.getRecords().stream()
                .map(this::convertToVO)
                .collect(Collectors.toList());

        // 构建返回结果
        Page<FoxUserVO> resultPage = new Page<>();
        BeanUtils.copyProperties(userPage, resultPage, "records");
        resultPage.setRecords(userVOList);

        return resultPage;
    }

    @Override
    public FoxUserDetailVO getUserDetail(UserDetailRequest request) {
        // 查询用户信息
        FoxUserPO userPO = foxUserMapper.selectById(request.getId());
        if (userPO == null) {
            throw new RuntimeException("用户不存在");
        }

        // 转换为详情VO对象
        FoxUserDetailVO userDetailVO = new FoxUserDetailVO();
        BeanUtils.copyProperties(userPO, userDetailVO);

        // 设置状态名称
        userDetailVO.setStatusName(getStatusName(userPO.getStatus()));
        
        // 设置用户类型名称
        userDetailVO.setUserTypeName(getUserTypeName(userPO.getIsPlayer()));
        
        // 设置性别名称
        userDetailVO.setGenderName(getGenderName(userPO.getGender()));
        
        // 设置权限名称
        userDetailVO.setCompetenceName(getCompetenceName(userPO.getCompetence()));

        // 如果需要包含球员信息且用户是球员
        if (Boolean.TRUE.equals(request.getIncludePlayerInfo()) 
            && userPO.getIsPlayer() != null 
            && userPO.getIsPlayer() == 1) {
            FoxPlayerPO playerPO = foxPlayerMapper.selectOne(
                new LambdaQueryWrapper<FoxPlayerPO>()
                    .eq(FoxPlayerPO::getUserId, request.getId())
            );
            
            if (playerPO != null) {
                FoxPlayerVO playerVO = new FoxPlayerVO();
                BeanUtils.copyProperties(playerPO, playerVO);
                userDetailVO.setPlayerInfo(playerVO);

                // 如果需要包含俱乐部信息
                if (Boolean.TRUE.equals(request.getIncludeClubInfo())) {
                    // TODO: 查询并设置俱乐部信息
                }
            }
        }

        // 如果需要包含统计数据
        if (Boolean.TRUE.equals(request.getIncludeStatistics())) {
            // TODO: 查询并设置统计数据
        }

        return userDetailVO;
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

    /**
     * 获取性别名称
     */
    private String getGenderName(Integer gender) {
        if (gender == null) {
            return "未知";
        }
        return switch (gender) {
            case 0 -> "未知";
            case 1 -> "男";
            case 2 -> "女";
            default -> "未知";
        };
    }

    /**
     * 获取权限名称
     */
    private String getCompetenceName(Integer competence) {
        if (competence == null) {
            return "未知";
        }
        return switch (competence) {
            case 0 -> "普通用户";
            case 1 -> "管理员";
            default -> "未知";
        };
    }
} 