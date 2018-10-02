package com.huanghonghao.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private String password;

	private Date createDate;

	private Date expDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", createDate=" + createDate
				+ ", expDate=" + expDate + "]";
	}
}
