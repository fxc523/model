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
import com.model.system.curd.manager.BaseMysqlCurdManager;

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
	private BaseMysqlCurdManager baseMysqlCurdManager;

	@RequestMapping("/save")
	public void saveUser(String username,String pwd){
		System.out.println("username="+username);
		System.out.println("pwd="+pwd);
		User u = new User();
		u.setUsername(username);
		u.setPwd(pwd);
		//u.setId("bc2b1791065211e88ac70021cc6ef2ce");
		baseMysqlCurdManager.save(u);
	}

	public BaseMysqlCurdManager getBaseMysqlCurdManager() {
		return baseMysqlCurdManager;
	}

	public void setBaseMysqlCurdManager(BaseMysqlCurdManager baseMysqlCurdManager) {
		this.baseMysqlCurdManager = baseMysqlCurdManager;
	}

	
}
