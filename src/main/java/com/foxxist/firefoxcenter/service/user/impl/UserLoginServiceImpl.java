package com.foxxist.firefoxcenter.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.foxxist.firefoxcenter.mapper.user.FoxUserMapper;
import com.foxxist.firefoxcenter.model.user.bo.FoxUserBO;
import com.foxxist.firefoxcenter.model.user.po.FoxUserPO;
import com.foxxist.firefoxcenter.model.user.request.WxLoginRequest;
import com.foxxist.firefoxcenter.model.user.response.LoginResponse;
import com.foxxist.firefoxcenter.service.user.UserLoginService;
import com.foxxist.firefoxcenter.service.user.WxAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/19 16:44
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserLoginServiceImpl implements UserLoginService {

    private final WxAuthService wxAuthService;
    private final FoxUserMapper userMapper;

    @Override
    public FoxUserBO getByOpenId(String openId) {
        // 根据openId查询用户
        FoxUserPO user = userMapper.selectOne(
                new LambdaQueryWrapper<FoxUserPO>()
                        .eq(FoxUserPO::getOpenId, openId)
                        .eq(FoxUserPO::getStatus, 1)
        );

        if (user == null) {
            return null;
        }

        // 转换为BO对象
        FoxUserBO bo = new FoxUserBO();
        BeanUtils.copyProperties(user, bo);
        bo.setIsPlayer(user.getIsPlayer() == 1);
        bo.setStatus(user.getStatus() == 1);

        return bo;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public LoginResponse loginOrRegisterByWx(WxLoginRequest request) {
        // Step 1: 向微信官方获取openId
        String openId = wxAuthService.getOpenIdByCode(request.getCode());
        if (openId == null || openId.isEmpty()) {
            throw new RuntimeException("获取openId失败");
        }

        // Step 2: 查询用户是否存在
        FoxUserPO user = userMapper.selectOne(
                new LambdaQueryWrapper<FoxUserPO>()
                        .eq(FoxUserPO::getOpenId, openId)
                        .eq(FoxUserPO::getStatus, 1)
                        .eq(FoxUserPO::getIsDeleted, 0)
        );

        boolean isNewUser = false;
        if (user == null) {
            // Step: 3: 新用户，创建用户记录
            user = new FoxUserPO();
            user.setOpenId(openId);
            user.setNickname(request.getNickname());
            user.setAvatarUrl(request.getAvatarUrl());
            user.setGender(request.getGender());
            user.setIsPlayer(0);
            user.setCompetence(0);
            user.setStatus(1);
            user.setLastLoginTime(LocalDateTime.now());

            userMapper.insert(user);
            isNewUser = true;
        } else {
            // 4. 老用户，更新登录信息
            user.setLastLoginTime(LocalDateTime.now());
            userMapper.updateById(user);
        }

        // 5. 构建登录响应
        LoginResponse response = new LoginResponse();
        response.setUserId(user.getId());
        response.setNickname(user.getNickname());
        response.setAvatarUrl(user.getAvatarUrl());
        response.setIsNewUser(isNewUser);

        // TODO: 生成登录token
        response.setToken("temp_token");

        return response;
    }
}
