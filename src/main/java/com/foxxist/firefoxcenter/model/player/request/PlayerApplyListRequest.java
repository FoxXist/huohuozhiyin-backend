package com.foxxist.firefoxcenter.model.player.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 球员入队申请列表查询请求对象
 */
@Data
@Schema(description = "球员入队申请列表查询请求")
public class PlayerApplyListRequest {

    @Schema(description = "当前页码", example = "1")
    private Long current = 1L;

    @Schema(description = "每页大小", example = "15")
    private Long size = 15L;

    @Schema(description = "申请人用户ID", example = "1001")
    private Long userId;

    @Schema(description = "申请人姓名", example = "张三")
    private String name;

    @Schema(description = "申请人手机号", example = "13800138000")
    private String phone;

    @Schema(description = "申请人年龄", example = "25")
    private Integer age;

    @Schema(description = "申请人地区", example = "浙江省")
    private String region;

    @Schema(description = "申请人城市", example = "杭州市")
    private String city;

    @Schema(description = "申请人位置", example = "前锋")
    private String position;

    @Schema(description = "申请状态（0：待审核，1：已通过，2：已拒绝）", example = "0")
    private Integer status;

    @Schema(description = "开始时间", example = "2025-05-01 00:00:00")
    private String startTime;

    @Schema(description = "结束时间", example = "2025-05-31 23:59:59")
    private String endTime;
} 