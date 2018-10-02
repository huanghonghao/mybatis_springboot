package com.huanghonghao.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.huanghonghao.mybatis.mapper")
public class MainApp {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApp.class, args);
	}

}