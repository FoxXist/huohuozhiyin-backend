package com.foxxist.firefoxcenter.service.user;

/**
 * 微信鉴权服务层
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/19 17:31
 */
public interface WxAuthService {

    /**
     * 根据前端用户的openCode获取openId
     * @param code 前端用户的openCode
     * @return openId
     */
    String getOpenIdByCode(String code);
}
