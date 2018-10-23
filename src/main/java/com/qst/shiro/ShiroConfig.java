package com.qst.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qst.shiro.realm.UserRealm;

/**  
 * @Package com.qst.shiro
 * @ClassName: ShiroConfig
 * @Description: TODO  
 * @author cuiyang 
 * @date 2018年10月23日  
 */
@Configuration
public class ShiroConfig {

	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Autowired DefaultWebSecurityManager securityManager) {
			ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
		
		//设置安全管理器
		factoryBean.setSecurityManager(securityManager);
		//内置过滤器
		/**
		 * anon:无须认证
		 * authc：必须认证
		 * user：如果使用rememberMe功能可直接访问
		 * perms[xxx]:授权可访问
		 * role：必须得到角色授权
		 */
		Map<String, String> filterMap = new LinkedHashMap<String,String>();
		
		return factoryBean;
	}
	
	@Bean
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Autowired UserRealm userRealm) {
		DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
		defaultWebSecurityManager.setRealm(userRealm);
		return defaultWebSecurityManager;
	}
	
	@Bean
	public UserRealm getUserRealm() {
		return new UserRealm();
	}
}
