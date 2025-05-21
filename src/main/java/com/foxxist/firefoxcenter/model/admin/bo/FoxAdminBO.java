package com.foxxist.firefoxcenter.model.admin.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 管理员业务对象
 *
 * @author foxxist
 */
@Data
@Schema(description = "管理员业务载体")
public class FoxAdminBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    @Schema(description = "管理员id", example = "记得存起来")
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
    @Schema(description = "管理员头像", example = "")
    private String avatar;

    /**
     * 管理员邮箱
     */
    private String email;

    /**
     * 管理员手机号
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
    private LocalDateTime lastLoginTime;

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
    private LocalDateTime createTime;
} 