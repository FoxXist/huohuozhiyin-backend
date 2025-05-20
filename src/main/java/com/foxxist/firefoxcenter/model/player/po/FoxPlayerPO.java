package com.foxxist.firefoxcenter.model.player.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 俱乐部球员实体类
 */
@Data
@TableName("fox_player")
public class FoxPlayerPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 关联用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 球员姓名
     */
    @TableField("name")
    private String name;

    /**
     * 英文名
     */
    @TableField("english_name")
    private String englishName;

    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 出生日期
     */
    @TableField("birth_date")
    private LocalDate birthDate;

    /**
     * 身高(cm)
     */
    @TableField("height")
    private Integer height;

    /**
     * 体重(kg)
     */
    @TableField("weight")
    private Integer weight;

    /**
     * 惯用脚（1：左脚，2：右脚，3：双脚）
     */
    @TableField("preferred_foot")
    private Integer preferredFoot;

    /**
     * 场上位置（GK：门将，DF：后卫，MF：中场，FW：前锋）
     */
    @TableField("position")
    private String position;

    /**
     * 具体擅长位置（如：中锋、边锋、后腰等）
     */
    @TableField("specific_position")
    private String specificPosition;

    /**
     * 球衣号码
     */
    @TableField("jersey_number")
    private String jerseyNumber;

    /**
     * 效力俱乐部
     */
    @TableField("club")
    private String club;

    /**
     * 身价(欧元)
     */
    @TableField("market_value")
    private BigDecimal marketValue;

    /**
     * 地区
     */
    @TableField("region")
    private String region;

    /**
     * 城市
     */
    @TableField("city")
    private String city;

    /**
     * 当地名气（1-5）
     */
    @TableField("local_fame")
    private Integer localFame;

    /**
     * 球员状态（0：未激活，1：正常，2：受伤，3：停赛,4：歇着,5: 已堕落）
     */
    @TableField("status")
    private Integer status;

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