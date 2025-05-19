package com.foxxist.firefoxcenter.model.user.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 微信小程序用户实体类
 *
 * @author foxxist
 */
@Data
@TableName("fox_user")
public class FoxUserPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 微信小程序openid
     */
    @TableField("open_id")
    private String openId;

    /**
     * 微信小程序unionid
     */
    @TableField("union_id")
    private String unionId;

    /**
     * 用户昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 用户头像URL
     */
    @TableField("avatar_url")
    private String avatarUrl;

    /**
     * 性别（0：未知，1：男，2：女）
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 手机号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 是否为俱乐部球员（0：否，1：是）
     */
    @TableField("is_player")
    private Integer isPlayer;

    /**
     * 球员号码（如果是球员）
     */
    @TableField("player_number")
    private String playerNumber;

    /**
     * 球员位置（如果是球员）
     */
    @TableField("player_position")
    private String playerPosition;

    /**
     * 用户状态（0：禁用，1：正常）
     */
    @TableField("status")
    private Integer status;

    /**
     * 最后登录时间
     */
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 是否删除（0：未删除，1：已删除）
     */
    @TableLogic
    @TableField("is_deleted")
    private Integer isDeleted;
} 