package com.huanghonghao.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huanghonghao.mybatis.entity.FindUserResp;
import com.huanghonghao.mybatis.model.User;
import com.huanghonghao.mybatis.service.UserManagerService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(path = "/user", produces = {"application/json;charset=UTF-8"})
@Slf4j
public class UserController {
	
	@Autowired
	private UserManagerService userManagerService;

	@RequestMapping(path = "/findUserById", method = RequestMethod.POST)
	@ResponseBody
	public FindUserResp findUserById(@RequestBody FindUserResp id) {
		log.info("id: {}", id.getId());
		return userManagerService.findUserById(id.getId());
	}
	
	@RequestMapping(path = "/addUser", method = RequestMethod.POST, produces = "application/text;charset=UTF-8")
	@ResponseBody
	public String addUser(@RequestBody FindUserResp userResp) {
		User temp = userManagerService.addUser(userResp);
		return temp.getId() + "," + temp.getName();
	}
}
