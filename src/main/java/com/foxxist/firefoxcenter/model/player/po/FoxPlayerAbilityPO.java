package com.foxxist.firefoxcenter.model.player.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 球员能力值实体类
 */
@Data
@TableName("fox_player_ability")
public class FoxPlayerAbilityPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 附魔 (天赋)
     */
    @TableField("enchantment")
    private String enchantment;

    /**
     * 进攻面板
     */
    @TableField("offensive_panel")
    private String offensivePanel;

    /**
     * 防守面板
     */
    @TableField("defensive_panel")
    private String defensivePanel;

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
     * 逆足能力（1-100）
     */
    @TableField("weak_foot")
    private Integer weakFoot;

    /**
     * 花式技巧（1-100）
     */
    @TableField("skill_moves")
    private Integer skillMoves;

    /**
     * 五人制能力（1-100）
     */
    @TableField("futsal_rating")
    private Integer futsalRating;

    /**
     * 11人制能力（1-100）
     */
    @TableField("football_rating")
    private Integer footballRating;

    /**
     * 体能（1-100）
     */
    @TableField("stamina")
    private Integer stamina;

    /**
     * 反应（1-100）
     */
    @TableField("reactions")
    private Integer reactions;

    /**
     * 平衡（1-100）
     */
    @TableField("balance")
    private Integer balance;

    /**
     * 弹跳（1-100）
     */
    @TableField("jumping")
    private Integer jumping;

    /**
     * 头球（1-100）
     */
    @TableField("heading")
    private Integer heading;

    /**
     * 门将特有属性：扑救（1-100）
     */
    @TableField("saving")
    private Integer saving;

    /**
     * 门将特有属性：手型（1-100）
     */
    @TableField("handling")
    private Integer handling;

    /**
     * 门将特有属性：开球（1-100）
     */
    @TableField("kicking")
    private Integer kicking;

    /**
     * 门将特有属性：站位（1-100）
     */
    @TableField("positioning")
    private Integer positioning;

    /**
     * 门将特有属性：反应（1-100）
     */
    @TableField("keeper_reactions")
    private Integer keeperReactions;

    /**
     * 门将特有属性：速度（1-100）
     */
    @TableField("keeper_speed")
    private Integer keeperSpeed;

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
     * 是否删除（0：未删除，1：已删除）
     */
    @TableLogic
    @TableField("is_deleted")
    private Integer isDeleted;
} 