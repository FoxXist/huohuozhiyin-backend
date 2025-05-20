package com.foxxist.firefoxcenter.mapper.admin;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.foxxist.firefoxcenter.model.admin.po.FoxAdminPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员Mapper接口
 */
@Mapper
public interface FoxAdminMapper extends BaseMapper<FoxAdminPO> {
} 