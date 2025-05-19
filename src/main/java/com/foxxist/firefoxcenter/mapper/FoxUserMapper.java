package com.foxxist.firefoxcenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.foxxist.firefoxcenter.model.user.po.FoxUserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 基础Mapper接口
 */
@Mapper
public interface FoxUserMapper extends BaseMapper<FoxUserPO> {

} 