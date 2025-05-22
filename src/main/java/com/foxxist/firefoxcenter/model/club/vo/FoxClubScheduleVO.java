package com.foxxist.firefoxcenter.model.club.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 俱乐部赛程视图对象
 */
@Data
@Schema(description = "俱乐部赛程视图对象")
public class FoxClubScheduleVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "主键ID")
    private Long id;

    @Schema(description = "俱乐部ID")
    private Long clubId;

    @Schema(description = "赛制（1：五人制，2：六人制，3：七人制，4：八人制，5：十一人制）")
    private Integer gameType;

    @Schema(description = "赛制名称")
    private String gameTypeName;

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

    @Schema(description = "发起人姓名")
    private String creatorName;

    @Schema(description = "比赛描述")
    private String description;

    @Schema(description = "比赛须知文案ID")
    private Long noticeId;

    @Schema(description = "比赛须知文案内容")
    private String noticeContent;

    @Schema(description = "比赛状态（0：未进行，1：进行中，2：已过期）")
    private Integer status;

    @Schema(description = "比赛状态名称")
    private String statusName;

    @Schema(description = "比赛场地")
    private String venue;

    @Schema(description = "比赛费用（单位：元/人）")
    private Integer fee;

    @Schema(description = "比赛级别（1：养生，2：锻炼，3：激情）")
    private Integer level;

    @Schema(description = "比赛级别名称")
    private String levelName;

    @Schema(description = "是否需要裁判（0：否，1：是）")
    private Integer needReferee;

    @Schema(description = "是否需要医疗人员（0：否，1：是）")
    private Integer needMedical;

    @Schema(description = "是否需要保险（0：否，1：是）")
    private Integer needInsurance;

    @Schema(description = "报名截止时间")
    private LocalDateTime registrationDeadline;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;
} 