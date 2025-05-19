package com.foxxist.firefoxcenter.service.user;

import com.foxxist.firefoxcenter.model.user.bo.FoxUserBO;
import com.foxxist.firefoxcenter.model.user.request.WxLoginRequest;
import com.foxxist.firefoxcenter.model.user.response.LoginResponse;

/**
 * 基础服务接口
 */
public interface UserLoginService {

    /**
     * 根据用户open id查询用户信息
     * @param openId 用户open id
     * @return 用户信息
     */
    FoxUserBO getByOpenId(String openId);

    /**
     * 微信登陆注册业务分流
     * @param request 用户id
     * @return 用户信息
     */
    LoginResponse loginOrRegisterByWx(WxLoginRequest request);
}