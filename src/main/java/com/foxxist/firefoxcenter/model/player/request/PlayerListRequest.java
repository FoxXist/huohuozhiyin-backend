package com.foxxist.firefoxcenter.model.player.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 球员列表查询请求对象
 */
@Data
@Schema(description = "球员列表查询请求")
public class PlayerListRequest {

    @Schema(description = "当前页码", example = "1")
    private Long current = 1L;

    @Schema(description = "每页大小", example = "15")
    private Long size = 15L;

    @Schema(description = "球员姓名", example = "张三")
    private String name;

    @Schema(description = "球员号码", example = "10")
    private String number;

    @Schema(description = "球员位置", example = "前锋")
    private String position;

    @Schema(description = "球员状态（0：禁用，1：正常）", example = "1")
    private Integer status;

    @Schema(description = "俱乐部球员 还是外部球员", example = "0")
    private Integer type;
} 