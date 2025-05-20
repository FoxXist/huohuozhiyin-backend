package com.foxxist.firefoxcenter.model.admin.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 管理员实体类
 *
 * @author foxxist
 */
@Data
@TableName("fox_admin")
public class FoxAdminPO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 管理员账号
     */
    @TableField("username")
    private String username;

    /**
     * 管理员密码（加密存储）
     */
    @TableField("password")
    private String password;

    /**
     * 管理员昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 管理员头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 管理员邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 管理员手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 权限级别（1：超级管理员，2：普通管理员，3：运营人员）
     */
    @TableField("role_level")
    private Integer roleLevel;

    /**
     * 权限列表（JSON格式存储）
     */
    @TableField("permissions")
    private String permissions;

    /**
     * 最后登录IP
     */
    @TableField("last_login_ip")
    private String lastLoginIp;

    /**
     * 最后登录时间
     */
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    /**
     * 状态（0：禁用，1：正常）
     */
    @TableField("status")
    private Integer status;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

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