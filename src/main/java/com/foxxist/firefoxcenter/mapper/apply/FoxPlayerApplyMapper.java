package com.foxxist.firefoxcenter.mapper.apply;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.foxxist.firefoxcenter.model.player.po.FoxPlayerApplyPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 球员入队申请 Mapper 接口
 */
@Mapper
public interface FoxPlayerApplyMapper extends BaseMapper<FoxPlayerApplyPO> {
}