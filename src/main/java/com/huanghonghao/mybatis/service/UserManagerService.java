package com.huanghonghao.mybatis.service;

import com.huanghonghao.mybatis.entity.FindUserResp;

public interface UserManagerService {

	FindUserResp findUserById(String id);
}
