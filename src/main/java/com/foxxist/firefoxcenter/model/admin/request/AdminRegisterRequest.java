package com.foxxist.firefoxcenter.model.admin.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

/**
 * 管理员注册请求对象
 */
@Data
@Schema(description = "管理员注册请求")
public class AdminRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    @Schema(description = "用户名", required = true)
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Schema(description = "密码", required = true)
    private String password;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    private String nickname;

    /**
     * 邮箱
     */
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "邮箱格式不正确")
    @Schema(description = "邮箱")
    private String email;

    /**
     * 手机号
     */
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    @Schema(description = "手机号")
    private String phone;

    /**
     * 权限级别（1：超级管理员，2：普通管理员，3：运营人员）
     */
    @Schema(description = "权限级别（1：超级管理员，2：普通管理员，3：运营人员）", example = "一般不给1和2的权限,1和2只有咱俩有 默认给3")
    private Integer roleLevel = 3;

    /**
     * 备注
     */
    @Schema(description = "备注")
    private String remark;
} 