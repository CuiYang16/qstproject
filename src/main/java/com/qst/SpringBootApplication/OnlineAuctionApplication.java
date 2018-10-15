package com.qst.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * @Package com.qst.SpringBootApplication
 * @ClassName: SpringBootApplication
 * @Description: 启动类
 * @author cuiyang
 * @date 2018年10月8日
 */
@SpringBootApplication
@ComponentScan("com.qst.*")
@MapperScan("com.qst.mapper")
public class OnlineAuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineAuctionApplication.class, args);
	}
}
