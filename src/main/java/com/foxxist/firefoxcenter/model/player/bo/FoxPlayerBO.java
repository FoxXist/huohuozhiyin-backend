package com.foxxist.firefoxcenter.model.player.bo;

import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 俱乐部球员业务对象
 */
@Data
public class FoxPlayerBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 关联用户ID
     */
    private Long userId;

    /**
     * 球员姓名
     */
    private String name;

    /**
     * 英文名
     */
    private String englishName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期
     */
    private LocalDate birthDate;

    /**
     * 身高(cm)
     */
    private Integer height;

    /**
     * 体重(kg)
     */
    private Integer weight;

    /**
     * 惯用脚（1：左脚，2：右脚，3：双脚）
     */
    private Integer preferredFoot;

    /**
     * 场上位置（GK：门将，DF：后卫，MF：中场，FW：前锋）
     */
    private String position;

    /**
     * 具体位置（如：中锋、边锋、后腰等）
     */
    private String specificPosition;

    /**
     * 球衣号码
     */
    private String jerseyNumber;

    /**
     * 效力俱乐部
     */
    private String club;

    /**
     * 效力俱乐部ID
     */
    private Long clubId;

    /**
     * 身价(欧元)
     */
    private BigDecimal marketValue;

    /**
     * 地区
     */
    private String region;

    /**
     * 城市
     */
    private String city;

    /**
     * 当地名气（1-100）
     */
    private Integer localFame;

    /**
     * 球员状态（0：未激活，1：正常，2：受伤，3：停赛）
     */
    private Integer status;

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
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
} 