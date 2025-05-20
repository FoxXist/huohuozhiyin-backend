package com.foxxist.firefoxcenter.convert.admin;

import com.foxxist.firefoxcenter.service.impl.OssServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * 管理员对象转换器
 *
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/20 13:42
 */
@Component
public class AdminConvertor implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static String getSignAvatar(String avatarUrl, Long expired) {
        OssServiceImpl bean = applicationContext.getBean(OssServiceImpl.class);
        return bean.getFullUrl(avatarUrl, expired);
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        AdminConvertor.applicationContext = applicationContext;
    }
}
