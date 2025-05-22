package com.foxxist.firefoxcenter.model.player.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 球员入队申请状态更新请求对象
 */
@Data
@Schema(description = "球员入队申请状态更新请求")
public class PlayerApplyStatusRequest {

    @Schema(description = "申请记录ID", example = "1")
    private Long id;

    @Schema(description = "审核状态（1：通过，2：拒绝）", example = "1")
    private Integer status;

    @Schema(description = "审核备注", example = "欢迎加入球队！")
    private String reviewRemark;
} 