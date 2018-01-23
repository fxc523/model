/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	UserService.java
 * @package		com.model.all.test
 * @author		fuxianchao
 * @Date		2018年1月23日 下午1:28:06
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.all.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.bean.User;
import com.model.system.curd.manager.BaseMysqlCurdManager;

/**
 ******************************************
 * @author fuxianchao  [2018年1月23日 下午1:28:06]
 * @version 1.0
 ******************************************
 */
@Service
public class UserService {

	@Autowired
	private BaseMysqlCurdManager<User> bmcm;
	
	public void saveUser(User u){
		bmcm.save(u);
	}

	/**
	 * 获取 bmcm
	 * @return the bmcm
	 */
	public BaseMysqlCurdManager<User> getBmcm() {
		return bmcm;
	}

	/**
	 * 设置 bmcm
	 * @param bmcm the bmcm to set
	 */
	public void setBmcm(BaseMysqlCurdManager<User> bmcm) {
		this.bmcm = bmcm;
	}

}
