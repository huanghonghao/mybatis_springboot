package com.huanghonghao.mybatis.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.huanghonghao.mybatis.entity.FindUserResp;
import com.huanghonghao.mybatis.mapper.UserMapper;
import com.huanghonghao.mybatis.model.User;
import com.huanghonghao.mybatis.service.UserManagerService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@CacheConfig(cacheNames = "user")
public class UserManagerServiceImpl implements UserManagerService {

	@Autowired
	private UserMapper userMapper;

	@Override
	@Cacheable(key = "#p0")
	public FindUserResp findUserById(String id) {
		User user = userMapper.queryUserById(id);
		FindUserResp findUserResp = new FindUserResp();
		BeanUtils.copyProperties(user, findUserResp);
		log.info(user.toString());
		return findUserResp;
	}

	@Override
	@CachePut(key = "#p0.id")
	public User addUser(FindUserResp userResp) {
		User user = new User();
		BeanUtils.copyProperties(userResp, user);
		userMapper.insertUser(user);
		return user;
	}

}
