package com.huanghonghao.mybatis.mapper;

import com.huanghonghao.mybatis.model.User;

public interface UserMapper {

	int insertUser(User user);
	
	User queryUserById(String id);
	
	int deleteUserById(String id);
	
	int updateUserById(User user);
}
