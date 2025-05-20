package com.foxxist.firefoxcenter.service.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserVO;

/**
 * 用户管理服务接口
 */
public interface UserManagerService {

    /**
     * 分页查询用户列表
     *
     * @param current 当前页码
     * @param size 每页大小
     * @param nickname 用户昵称（可选）
     * @param phone 手机号（可选）
     * @param status 用户状态（可选）
     * @return 用户列表分页数据
     */
    Page<FoxUserVO> getUserList(Long current, Long size, String nickname, String phone, Integer status);
} 