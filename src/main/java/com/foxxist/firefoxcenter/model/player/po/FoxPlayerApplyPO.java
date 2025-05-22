package com.foxxist.firefoxcenter.model.player.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 球员入队申请实体类
 */
@Data
@TableName("fox_player_apply")
public class FoxPlayerApplyPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 申请人用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 申请人姓名
     */
    @TableField("name")
    private String name;

    /**
     * 申请人手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 申请人年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 申请人身高(cm)
     */
    @TableField("height")
    private Integer height;

    /**
     * 申请人体重(kg)
     */
    @TableField("weight")
    private Integer weight;

    /**
     * 申请人地区
     */
    @TableField("region")
    private String region;

    /**
     * 申请人城市
     */
    @TableField("city")
    private String city;

    /**
     * 申请人位置
     */
    @TableField("position")
    private String position;

    /**
     * 申请人球衣号码
     */
    @TableField("jersey_number")
    private String jerseyNumber;

    /**
     * 申请状态（0：待审核，1：已通过，2：已拒绝）
     */
    @TableField("status")
    private Integer status;

    /**
     * 审核人ID
     */
    @TableField("reviewer_id")
    private Long reviewerId;

    /**
     * 审核时间
     */
    @TableField("review_time")
    private LocalDateTime reviewTime;

    /**
     * 审核备注
     */
    @TableField("review_remark")
    private String reviewRemark;

    /**
     * 申请时间
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