/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	MysqlCurdTest.java
 * @package		com.model.util
 * @author		fuxianchao
 * @Date		2018年1月23日 上午11:33:32
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.all.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.bean.User;

/**
 ******************************************
 * @author fuxianchao  [2018年1月23日 上午11:33:32]
 * @version 1.0
 ******************************************
 */
@Controller
@RequestMapping("/test")
public class MysqlCurdTest {
	
	@Autowired
	private UserService us;

	@RequestMapping("/save")
	public void saveUser(String username,String pwd){
		System.out.println("username="+username);
		System.out.println("pwd="+pwd);
		User u = new User();
		u.setUsername(username);
		u.setPwd(pwd);
		us.saveUser(u);
	}

	/**
	 * 获取 us
	 * @return the us
	 */
	public UserService getUs() {
		return us;
	}

	/**
	 * 设置 us
	 * @param us the us to set
	 */
	public void setUs(UserService us) {
		this.us = us;
	}

}
