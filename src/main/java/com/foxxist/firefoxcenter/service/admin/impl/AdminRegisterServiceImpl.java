package com.foxxist.firefoxcenter.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.foxxist.firefoxcenter.mapper.admin.FoxAdminMapper;
import com.foxxist.firefoxcenter.model.admin.bo.FoxAdminBO;
import com.foxxist.firefoxcenter.model.admin.po.FoxAdminPO;
import com.foxxist.firefoxcenter.model.admin.request.AdminRegisterRequest;
import com.foxxist.firefoxcenter.service.admin.AdminRegisterService;
import com.foxxist.firefoxcenter.util.PasswordUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 管理员注册服务实现类
 */
@Service
@RequiredArgsConstructor
public class AdminRegisterServiceImpl implements AdminRegisterService {

    private final FoxAdminMapper adminMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public FoxAdminBO register(AdminRegisterRequest request) {
        // 1. 检查用户名是否已存在
        FoxAdminPO existingAdmin = adminMapper.selectOne(
            new LambdaQueryWrapper<FoxAdminPO>()
                .eq(FoxAdminPO::getUsername, request.getUsername())
        );

        if (existingAdmin != null) {
            throw new RuntimeException("用户名已存在");
        }

        // 2. 创建管理员实体
        FoxAdminPO admin = new FoxAdminPO();
        admin.setUsername(request.getUsername());
        admin.setPassword(PasswordUtil.encode(request.getPassword()));
        admin.setNickname(request.getNickname());
        admin.setEmail(request.getEmail());
        admin.setPhone(request.getPhone());
        admin.setRoleLevel(request.getRoleLevel());
        admin.setRemark(request.getRemark());
        admin.setStatus(1); // 默认启用

        // 3. 保存管理员信息
        adminMapper.insert(admin);

        FoxAdminBO adminBO = new FoxAdminBO();
        BeanUtils.copyProperties(admin, adminBO);
        return adminBO;
    }
} 