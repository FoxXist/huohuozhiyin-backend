package com.foxxist.firefoxcenter.model.club.vo;

import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 俱乐部信息视图对象
 */
@Data
public class FoxClubVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 俱乐部名称
     */
    private String name;

    /**
     * 英文名称
     */
    private String englishName;

    /**
     * 成立时间
     */
    private LocalDate foundationDate;

    /**
     * 总球员数
     */
    private Integer totalPlayers;

    /**
     * 活跃球员数
     */
    private Integer activePlayers;

    /**
     * 已组织比赛数
     */
    private Integer totalMatches;

    /**
     * 胜场数
     */
    private Integer winMatches;

    /**
     * 平场数
     */
    private Integer drawMatches;

    /**
     * 负场数
     */
    private Integer loseMatches;

    /**
     * 俱乐部队徽URL
     */
    private String clubLogo;

    /**
     * 俱乐部背景图URL
     */
    private String clubBackground;

    /**
     * 俱乐部格言
     */
    private String clubMotto;

    /**
     * 当前教练
     */
    private String currentCoach;

    /**
     * 主场名称
     */
    private String homeStadium;

    /**
     * 主场地址
     */
    private String stadiumAddress;

    /**
     * 所在地区
     */
    private String region;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 俱乐部简介
     */
    private String description;

    /**
     * 状态名称
     */
    private String statusName;

    /**
     * 俱乐部等级名称
     */
    private String levelName;

    /**
     * 胜率
     */
    private Double winRate;

    /**
     * 俱乐部经验值
     */
    private Integer experience;

    /**
     * 俱乐部等级
     */
    private Integer level;
} 