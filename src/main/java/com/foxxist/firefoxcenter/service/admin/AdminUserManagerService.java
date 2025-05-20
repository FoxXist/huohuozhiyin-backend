package com.foxxist.firefoxcenter.service.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foxxist.firefoxcenter.model.user.request.UserDetailRequest;
import com.foxxist.firefoxcenter.model.user.request.UserListRequest;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserDetailVO;
import com.foxxist.firefoxcenter.model.user.vo.FoxUserVO;

/**
 * 用户管理服务接口
 */
public interface AdminUserManagerService {

    /**
     * 分页查询用户列表
     *
     * @param request 查询请求参数
     * @return 用户列表分页数据
     */
    Page<FoxUserVO> getUserList(UserListRequest request);

    /**
     * 查询用户详情
     * 根据请求参数返回用户详细信息，可选择性包含球员信息、俱乐部信息和统计数据
     *
     * @param request 查询请求参数
     * @return 用户详情信息
     */
    FoxUserDetailVO getUserDetail(UserDetailRequest request);
} 