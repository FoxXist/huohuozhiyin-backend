package com.foxxist.firefoxcenter.model.player.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <pre> </pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/20 16:07
 */
@Data
@Schema(description = "俱乐部球员响应实体", example = "")
public class FoxPlayerVO implements Serializable {

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
     * 俱乐部ID
     */
    private Integer clubId;

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
     * 当地名气（1-5）
     */
    private Integer localFame;

    /**
     * 球员状态（0：未激活，1：正常，2：受伤，3：停赛,4：歇着,5: 已堕落）
     */
    private Integer status;

    /**
     * 状态名称
     */
    private String statusName;

    /**
     * 惯用脚名称
     */
    private String preferredFootName;

    /**
     * 球员能力值信息
     */
    private FoxPlayerAbilityVO ability;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
