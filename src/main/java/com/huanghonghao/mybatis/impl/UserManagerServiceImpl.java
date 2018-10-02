package com.huanghonghao.mybatis.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huanghonghao.mybatis.entity.FindUserResp;
import com.huanghonghao.mybatis.mapper.UserMapper;
import com.huanghonghao.mybatis.model.User;
import com.huanghonghao.mybatis.service.UserManagerService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserManagerServiceImpl implements UserManagerService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public FindUserResp findUserById(String id) {
		User user = userMapper.queryUserById(id);
		FindUserResp findUserResp = new FindUserResp();
		BeanUtils.copyProperties(user, findUserResp);
		log.info(user.toString());
		return findUserResp;
	}

}
