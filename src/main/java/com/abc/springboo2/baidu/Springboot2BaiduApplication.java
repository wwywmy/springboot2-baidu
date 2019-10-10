package com.abc.springboo2.baidu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.baidu.fsg.uid.worker.dao"})
public class Springboot2BaiduApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2BaiduApplication.class, args);
	}

}
