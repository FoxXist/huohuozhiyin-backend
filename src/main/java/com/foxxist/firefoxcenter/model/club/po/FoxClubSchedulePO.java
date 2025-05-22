package com.foxxist.firefoxcenter.model.club.po;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 俱乐部赛程表实体类
 */
@Data
@TableName("fox_club_schedule")
@Schema(description = "俱乐部赛程表")
public class FoxClubSchedulePO {

    @TableId(type = IdType.AUTO)
    @Schema(description = "主键ID")
    private Long id;

    @Schema(description = "俱乐部ID")
    private Long clubId;

    @Schema(description = "赛制（1：五人制，2：六人制，3：七人制，4：八人制，5：十一人制）")
    private Integer gameType;

    @Schema(description = "参赛队伍数量")
    private Integer teamCount;

    @Schema(description = "报名总人数")
    private Integer totalPlayers;

    @Schema(description = "已报名人数")
    private Integer registeredPlayers;

    @Schema(description = "排队人数")
    private Integer waitingPlayers;

    @Schema(description = "比赛地址")
    private String address;

    @Schema(description = "比赛名称")
    private String name;

    @Schema(description = "比赛开始时间")
    private LocalDateTime startTime;

    @Schema(description = "比赛结束时间")
    private LocalDateTime endTime;

    @Schema(description = "发起人ID")
    private Long creatorId;

    @Schema(description = "比赛描述")
    private String description;

    @Schema(description = "比赛须知文案ID")
    private Long noticeId;

    @Schema(description = "比赛状态（0：未进行，1：进行中，2：已过期）")
    private Integer status;

    @Schema(description = "比赛场地")
    private String venue;

    @Schema(description = "比赛费用（单位：元/人）")
    private Integer fee;

    @Schema(description = "比赛级别（1：养生，2：锻炼，3：激情）")
    private Integer level;

    @Schema(description = "是否需要裁判（0：否，1：是）")
    private Integer needReferee;

    @Schema(description = "是否需要医疗人员（0：否，1：是）")
    private Integer needMedical;

    @Schema(description = "是否需要保险（0：否，1：是）")
    private Integer needInsurance;

    @Schema(description = "报名截止时间")
    private LocalDateTime registrationDeadline;

    @Schema(description = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Schema(description = "是否删除（0：否，1：是）")
    @TableLogic
    private Integer isDeleted;
} 