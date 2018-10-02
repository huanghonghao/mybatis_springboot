package com.huanghonghao.mybatis.service;

import com.huanghonghao.mybatis.entity.FindUserResp;
import com.huanghonghao.mybatis.model.User;

public interface UserManagerService {

	FindUserResp findUserById(String id);
	
	User addUser(FindUserResp userResp);
}
