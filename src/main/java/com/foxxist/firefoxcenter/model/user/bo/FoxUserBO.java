package com.foxxist.firefoxcenter.model.user.bo;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 微信小程序用户业务对象
 *
 * @author foxxist
 */
@Data
public class FoxUserBO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像URL
     */
    private String avatarUrl;

    /**
     * 性别（0：未知，1：男，2：女）
     */
    private Integer gender;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 是否为俱乐部球员
     */
    private Boolean isPlayer;

    /**
     * 球员号码
     */
    private String playerNumber;

    /**
     * 球员位置
     */
    private String playerPosition;

    /**
     * 用户状态
     */
    private Boolean status;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
} 