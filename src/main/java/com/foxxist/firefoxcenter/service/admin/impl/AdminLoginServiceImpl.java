package com.foxxist.firefoxcenter.service.admin.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.foxxist.firefoxcenter.convert.admin.AdminConvertor;
import com.foxxist.firefoxcenter.mapper.admin.FoxAdminMapper;
import com.foxxist.firefoxcenter.model.admin.bo.FoxAdminBO;
import com.foxxist.firefoxcenter.model.admin.po.FoxAdminPO;
import com.foxxist.firefoxcenter.model.admin.request.AdminLoginRequest;
import com.foxxist.firefoxcenter.model.admin.response.AdminLoginResponse;
import com.foxxist.firefoxcenter.service.admin.AdminLoginService;
import com.foxxist.firefoxcenter.util.PasswordUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;

/**
 * 管理员Service实现类
 */
@Service
@RequiredArgsConstructor
public class AdminLoginServiceImpl implements AdminLoginService {


    private final FoxAdminMapper adminMapper;

    @Override
    public AdminLoginResponse login(AdminLoginRequest request) {
        // 1. 查询管理员信息
        FoxAdminPO admin = adminMapper.selectOne(
            new LambdaQueryWrapper<FoxAdminPO>()
                .eq(FoxAdminPO::getUsername, request.getUsername())
                .eq(FoxAdminPO::getStatus, 1)
        );

        if (admin == null) {
            throw new RuntimeException("管理员账号不存在");
        }

        // TODO: 2. 验证密码（需要实现密码加密和验证逻辑）
        if (!PasswordUtil.matches(request.getPassword(),admin.getPassword())) {
            throw new RuntimeException("密码错误");
        }

        // 3. 构建登录响应
        AdminLoginResponse response = new AdminLoginResponse();
        response.setId(admin.getId());
        response.setUsername(admin.getUsername());
        response.setNickname(admin.getNickname());
        response.setAvatarUrl(admin.getAvatar());
        response.setRoleLevel(admin.getRoleLevel());
        // TODO: 4. 生成登录token（需要实现token生成逻辑）
        response.setToken("temp_token");

        return response;
    }

    @Override
    public FoxAdminBO getByUsername(String username) {
        FoxAdminPO admin = adminMapper.selectOne(
            new LambdaQueryWrapper<FoxAdminPO>()
                .eq(FoxAdminPO::getUsername, username)
                .eq(FoxAdminPO::getStatus, 1)
        );

        if (admin == null) {
            return null;
        }

        FoxAdminBO bo = new FoxAdminBO();
        BeanUtils.copyProperties(admin, bo);
        bo.setPermissions(JSON.parseArray(admin.getPermissions(), String.class));
        bo.setStatus(admin.getStatus() == 1);

        return bo;
    }
} 