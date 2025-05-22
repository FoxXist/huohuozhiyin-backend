package com.foxxist.firefoxcenter.model.player.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 球员入队申请视图对象
 */
@Data
@Schema(description = "球员入队申请信息")
public class FoxPlayerApplyVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Schema(description = "申请ID")
    private Long id;

    /**
     * 申请人用户ID
     */
    @Schema(description = "申请人用户ID")
    private Long userId;

    /**
     * 申请人姓名
     */
    @Schema(description = "申请人姓名")
    private String name;

    /**
     * 申请人手机号（脱敏）
     */
    @Schema(description = "申请人手机号")
    private String phone;

    /**
     * 申请人年龄
     */
    @Schema(description = "申请人年龄")
    private Integer age;

    /**
     * 申请人身高(cm)
     */
    @Schema(description = "申请人身高(cm)")
    private Integer height;

    /**
     * 申请人体重(kg)
     */
    @Schema(description = "申请人体重(kg)")
    private Integer weight;

    /**
     * 申请人地区
     */
    @Schema(description = "申请人地区")
    private String region;

    /**
     * 申请人城市
     */
    @Schema(description = "申请人城市")
    private String city;

    /**
     * 申请人位置
     */
    @Schema(description = "申请人位置")
    private String position;

    /**
     * 申请人球衣号码
     */
    @Schema(description = "申请人球衣号码")
    private String jerseyNumber;

    /**
     * 申请状态（0：待审核，1：已通过，2：已拒绝）
     */
    @Schema(description = "申请状态（0：待审核，1：已通过，2：已拒绝）")
    private Integer status;

    /**
     * 审核人姓名
     */
    @Schema(description = "审核人姓名")
    private String reviewerName;

    /**
     * 审核时间
     */
    @Schema(description = "审核时间")
    private LocalDateTime reviewTime;

    /**
     * 审核备注
     */
    @Schema(description = "审核备注")
    private String reviewRemark;

    /**
     * 申请时间
     */
    @Schema(description = "申请时间")
    private LocalDateTime createTime;
} 