package com.huanghonghao.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
public class FindUserResp implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("password")
	private String password;

	@JsonProperty("createDate")
	private Date createDate;

	@JsonProperty("expDate")
	private Date expDate;
}
