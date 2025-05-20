package com.foxxist.firefoxcenter.model.user.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 微信小程序用户视图对象
 *
 * @author foxxist
 */
@Data
public class FoxUserVO implements Serializable {

    @Serial
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
     * 手机号码（脱敏）
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
     * 状态名称
     */
    private String statusName;

    /**
     * 用户类型
     */
    private String userTypeName;
} 