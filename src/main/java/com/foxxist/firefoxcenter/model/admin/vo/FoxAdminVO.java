package com.foxxist.firefoxcenter.model.admin.vo;

import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * 管理员视图对象
 *
 * @author foxxist
 */
@Data
public class FoxAdminVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    private Long id;

    /**
     * 管理员账号
     */
    private String username;

    /**
     * 管理员昵称
     */
    private String nickname;

    /**
     * 管理员头像
     */
    private String avatar;

    /**
     * 管理员邮箱
     */
    private String email;

    /**
     * 管理员手机号（脱敏）
     */
    private String phone;

    /**
     * 权限级别（1：超级管理员，2：普通管理员，3：运营人员）
     */
    private Integer roleLevel;

    /**
     * 权限列表
     */
    private List<String> permissions;

    /**
     * 最后登录IP
     */
    private String lastLoginIp;

    /**
     * 最后登录时间
     */
    private String lastLoginTime;

    /**
     * 状态（0：禁用，1：正常）
     */
    private Boolean status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;
} 