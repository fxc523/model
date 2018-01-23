/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	User.java
 * @package		com.model.bean
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:34:08
 * @version		1.0
 * @description 
 *******************************************************************************
 */
package com.model.bean;

import com.model.annotation.Column;
import com.model.annotation.Table;
import com.model.system.createtable.constant.MySqlTypeConstant;

/**
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午2:40:55]
 * @version 1.0
 ******************************************
 */
@Table(name="m_user")
public class User extends BaseBean {

	/**
	 * 用户名
	 */
	@Column(name = "username", type =MySqlTypeConstant.VARCHAR, length=32)
	private String username;
	
	/**
	 * 密码
	 */
	@Column(name = "pwd", type =MySqlTypeConstant.VARCHAR)
	private String pwd;
	
	/**
	 * 性别0,男，1女
	 */
	//@Column(name = "sex", type =MySqlTypeConstant.INT, length=1)
	private int sex;
	
	/**
	 * 电话号
	 */
	private String telNum;

	/**
	 * 获取 username
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 设置 username
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取 pwd
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * 设置 pwd
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 获取 sex
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * 设置 sex
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 获取 telNum
	 * @return the telNum
	 */
	public String getTelNum() {
		return telNum;
	}

	/**
	 * 设置 telNum
	 * @param telNum the telNum to set
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	
}
