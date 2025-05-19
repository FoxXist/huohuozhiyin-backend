package com.foxxist.firefoxcenter.model.user.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 球员能力值视图对象
 *
 * @author foxxist
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
     * 扑救（1-100，仅门将）
     */
    private Integer saving;

    /**
     * 手型（1-100，仅门将）
     */
    private Integer handling;

    /**
     * 开球（1-100，仅门将）
     */
    private Integer kicking;

    /**
     * 反应（1-100，仅门将）
     */
    private Integer reflexes;

    /**
     * 球员位置（GK：门将，DF：后卫，MF：中场，FW：前锋）
     */
    private String position;

    /**
     * 能力值更新时间
     */
    private String updateTime;
} 