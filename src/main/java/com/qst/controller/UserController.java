package com.qst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
 * @Package com.qst.controller
 * @ClassName: UserController
 * @Description: TODO  
 * @author cuiyang 
 * @date 2018年10月8日  
 */
@Controller
public class UserController {

	//首页
	@RequestMapping("/")
	public String toIndex() {
		return "index";
	}
	
	//登录
	@RequestMapping("/login")
	public String toLogin() {
		
		return "login";
	}
	
	//注册
	@RequestMapping("/register")
	public String toRegister() {
		
		return "register";
	}
}
