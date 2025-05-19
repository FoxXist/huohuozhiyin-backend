package com.foxxist.firefoxcenter.model.user.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 球员能力值实体类
 *
 * @author foxxist
 */
@Data
@TableName("fox_player_ability")
public class FoxPlayerAbilityPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 球员ID
     */
    @TableField("player_id")
    private Long playerId;

    /**
     * 综合能力值（1-100）
     */
    @TableField("overall_rating")
    private Integer overallRating;

    /**
     * 速度（1-100）
     */
    @TableField("speed")
    private Integer speed;

    /**
     * 力量（1-100）
     */
    @TableField("strength")
    private Integer strength;

    /**
     * 射门（1-100）
     */
    @TableField("shooting")
    private Integer shooting;

    /**
     * 防守（1-100）
     */
    @TableField("defending")
    private Integer defending;

    /**
     * 盘带（1-100）
     */
    @TableField("dribbling")
    private Integer dribbling;

    /**
     * 传球（1-100）
     */
    @TableField("passing")
    private Integer passing;

    /**
     * 扑救（1-100，仅门将）
     */
    @TableField("saving")
    private Integer saving;

    /**
     * 手型（1-100，仅门将）
     */
    @TableField("handling")
    private Integer handling;

    /**
     * 开球（1-100，仅门将）
     */
    @TableField("kicking")
    private Integer kicking;

    /**
     * 反应（1-100，仅门将）
     */
    @TableField("reflexes")
    private Integer reflexes;

    /**
     * 球员位置（GK：门将，DF：后卫，MF：中场，FW：前锋）
     */
    @TableField("position")
    private String position;

    /**
     * 能力值更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime modifyTime;

    /**
     * 是否删除（0：未删除，1：已删除）
     */
    @TableLogic
    @TableField("is_deleted")
    private Integer isDeleted;
} 