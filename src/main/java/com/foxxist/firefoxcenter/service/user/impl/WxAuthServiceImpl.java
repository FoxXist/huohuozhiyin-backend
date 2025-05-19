package com.foxxist.firefoxcenter.service.user.impl;

import com.foxxist.firefoxcenter.service.user.WxAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信鉴权业务逻辑实现
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/19 17:32
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class WxAuthServiceImpl implements WxAuthService {

    @Value("${wx.appid}")
    private String appId;

    @Value("${wx.secret}")
    private String secret;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getOpenIdByCode(String code) {
        String url = String.format("https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code",
                appId, secret, code);

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        Map<String, Object> result = response.getBody();

        if (result == null || result.get("errcode") != null) {
            throw new RuntimeException("微信授权失败: " + result.get("errmsg"));
        }

        return (String) result.get("openid");
    }
}
