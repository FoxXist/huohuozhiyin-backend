package com.foxxist.firefoxcenter.service.user.impl;

import com.foxxist.firefoxcenter.model.user.bo.FoxUserBO;
import com.foxxist.firefoxcenter.model.user.request.WxLoginRequest;
import com.foxxist.firefoxcenter.model.user.response.LoginResponse;
import com.foxxist.firefoxcenter.service.user.UserLoginService;
import com.foxxist.firefoxcenter.service.user.WxAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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

    @Override
    public FoxUserBO getByOpenId(String openId) {
        return null;
    }

    @Override
    public LoginResponse loginOrRegisterByWx(WxLoginRequest request) {

        String openId = wxAuthService.getOpenIdByCode(request.getCode());
        return null;
    }
}
