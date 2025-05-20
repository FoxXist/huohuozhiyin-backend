package com.foxxist.firefoxcenter.mapper.player;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.foxxist.firefoxcenter.model.player.po.FoxPlayerPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <pre> 狐火之茵俱乐部球员 DB 交互层</pre>
 *
 * @author loctek_wuyifan
 * @version 1.0
 * @since 2025/5/20 16:16
 */
@Mapper
public interface FoxPlayerMapper extends BaseMapper<FoxPlayerPO> {
}
