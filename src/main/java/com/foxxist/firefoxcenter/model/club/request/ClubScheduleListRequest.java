package com.foxxist.firefoxcenter.model.club.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 俱乐部赛程列表查询请求对象
 */
@Data
@Schema(description = "俱乐部赛程列表查询请求")
public class ClubScheduleListRequest {

    @Schema(description = "当前页码", example = "1")
    private Long current = 1L;

    @Schema(description = "每页大小", example = "15")
    private Long size = 15L;

    @Schema(description = "俱乐部ID", example = "1")
    private Long clubId;

    @Schema(description = "赛制（1：五人制，2：六人制，3：七人制，4：八人制，5：十一人制）", example = "1")
    private Integer gameType;

    @Schema(description = "比赛状态（0：未进行，1：进行中，2：已过期）", example = "0")
    private Integer status;

    @Schema(description = "比赛级别（1：养生，2：锻炼，3：激情）", example = "1")
    private Integer level;

    @Schema(description = "开始时间", example = "2025-05-01 00:00:00")
    private String startTime;

    @Schema(description = "结束时间", example = "2025-05-31 23:59:59")
    private String endTime;
} 