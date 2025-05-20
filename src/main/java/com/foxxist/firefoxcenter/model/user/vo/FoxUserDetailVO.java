package com.foxxist.firefoxcenter.model.user.vo;

import com.foxxist.firefoxcenter.model.player.vo.FoxPlayerVO;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户详情视图对象
 */
@Data
public class FoxUserDetailVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 性别（0：未知，1：男，2：女）
     */
    private Integer gender;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 是否球员（0：否，1：是）
     */
    private Integer isPlayer;

    /**
     * 用户状态（0：禁用，1：正常，2：待审核）
     */
    private Integer status;

    /**
     * 用户权限（0：普通用户，1：管理员）
     */
    private Integer competence;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 状态名称
     */
    private String statusName;

    /**
     * 用户类型名称
     */
    private String userTypeName;

    /**
     * 性别名称
     */
    private String genderName;

    /**
     * 权限名称
     */
    private String competenceName;

    /**
     * 球员信息（如果是球员）
     */
    private FoxPlayerVO playerInfo;
} 