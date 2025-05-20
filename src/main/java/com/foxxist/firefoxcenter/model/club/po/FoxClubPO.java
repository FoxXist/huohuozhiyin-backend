package com.foxxist.firefoxcenter.model.club.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 俱乐部信息实体类
 */
@Data
@TableName("fox_club")
public class FoxClubPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 俱乐部名称
     */
    @TableField("name")
    private String name;

    /**
     * 英文名称
     */
    @TableField("english_name")
    private String englishName;

    /**
     * 成立时间
     */
    @TableField("foundation_date")
    private LocalDate foundationDate;

    /**
     * 总球员数
     */
    @TableField("total_players")
    private Integer totalPlayers;

    /**
     * 活跃球员数
     */
    @TableField("active_players")
    private Integer activePlayers;

    /**
     * 已组织比赛数
     */
    @TableField("total_matches")
    private Integer totalMatches;

    /**
     * 胜场数
     */
    @TableField("win_matches")
    private Integer winMatches;

    /**
     * 平场数
     */
    @TableField("draw_matches")
    private Integer drawMatches;

    /**
     * 负场数
     */
    @TableField("lose_matches")
    private Integer loseMatches;

    /**
     * 俱乐部队徽URL
     */
    @TableField("club_logo")
    private String clubLogo;

    /**
     * 俱乐部背景图URL
     */
    @TableField("club_background")
    private String clubBackground;

    /**
     * 俱乐部格言
     */
    @TableField("club_motto")
    private String clubMotto;

    /**
     * 当前教练
     */
    @TableField("current_coach")
    private String currentCoach;

    /**
     * 教练联系电话
     */
    @TableField("coach_phone")
    private String coachPhone;

    /**
     * 主场名称
     */
    @TableField("home_stadium")
    private String homeStadium;

    /**
     * 主场地址
     */
    @TableField("stadium_address")
    private String stadiumAddress;

    /**
     * 所在地区
     */
    @TableField("region")
    private String region;

    /**
     * 所在城市
     */
    @TableField("city")
    private String city;

    /**
     * 俱乐部联系电话
     */
    @TableField("contact_phone")
    private String contactPhone;

    /**
     * 俱乐部联系邮箱
     */
    @TableField("contact_email")
    private String contactEmail;

    /**
     * 俱乐部简介
     */
    @TableField("description")
    private String description;

    /**
     * 状态（0：未激活，1：正常，2：暂停运营）
     */
    @TableField("status")
    private Integer status;

    /**
     * 俱乐部等级
     */
    @TableField("level")
    private Integer level;

    /**
     * 俱乐部经验值
     */
    @TableField("experience")
    private Integer experience;

    /**
     * 创建时间
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