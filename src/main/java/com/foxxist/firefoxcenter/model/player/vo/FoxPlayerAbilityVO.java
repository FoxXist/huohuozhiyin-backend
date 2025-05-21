package com.foxxist.firefoxcenter.model.player.vo;

import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 球员能力值视图对象
 */
@Data
public class FoxPlayerAbilityVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 球员ID
     */
    private Long playerId;

    /**
     * 附魔 (天赋)
     */
    private String enchantment;

    /**
     * 进攻面板
     */
    private String offensivePanel;

    /**
     * 防守面板
     */
    private String defensivePanel;

    /**
     * 综合能力值（1-100）
     */
    private Integer overallRating;

    /**
     * 速度（1-100）
     */
    private Integer speed;

    /**
     * 力量（1-100）
     */
    private Integer strength;

    /**
     * 射门（1-100）
     */
    private Integer shooting;

    /**
     * 防守（1-100）
     */
    private Integer defending;

    /**
     * 盘带（1-100）
     */
    private Integer dribbling;

    /**
     * 传球（1-100）
     */
    private Integer passing;

    /**
     * 逆足能力（1-100）
     */
    private Integer weakFoot;

    /**
     * 花式技巧（1-100）
     */
    private Integer skillMoves;

    /**
     * 五人制能力（1-100）
     */
    private Integer futsalRating;

    /**
     * 11人制能力（1-100）
     */
    private Integer footballRating;

    /**
     * 体能（1-100）
     */
    private Integer stamina;

    /**
     * 反应（1-100）
     */
    private Integer reactions;

    /**
     * 平衡（1-100）
     */
    private Integer balance;

    /**
     * 弹跳（1-100）
     */
    private Integer jumping;

    /**
     * 头球（1-100）
     */
    private Integer heading;

    /**
     * 门将特有属性：扑救（1-100）
     */
    private Integer saving;

    /**
     * 门将特有属性：手型（1-100）
     */
    private Integer handling;

    /**
     * 门将特有属性：开球（1-100）
     */
    private Integer kicking;

    /**
     * 门将特有属性：站位（1-100）
     */
    private Integer positioning;

    /**
     * 门将反应（1-100）
     */
    private Integer keeperReactions;

    /**
     * 门将速度（1-100）
     */
    private Integer keeperSpeed;

    /**
     * 能力值更新时间
     */
    private LocalDateTime updateTime;
} 