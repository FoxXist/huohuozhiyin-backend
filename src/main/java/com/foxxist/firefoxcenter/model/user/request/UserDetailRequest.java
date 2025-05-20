package com.foxxist.firefoxcenter.model.user.request;

import lombok.Data;
import java.io.Serial;
import java.io.Serializable;

/**
 * 用户详情查询请求对象
 */
@Data
public class UserDetailRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 是否包含球员信息（默认true）
     */
    private Boolean includePlayerInfo = true;

    /**
     * 是否包含俱乐部信息（默认false）
     */
    private Boolean includeClubInfo = false;

    /**
     * 是否包含统计数据（默认false）
     */
    private Boolean includeStatistics = false;
} 