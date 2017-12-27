/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	Log.java
 * @package		com.model.util
 * @author		fuxianchao
 * @Date		2017年12月20日 下午4:38:06
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 ******************************************
 * @author fuxianchao  [2017年12月20日 下午4:38:06]
 * @version 1.0
 ******************************************
 */
public enum Log {

	/** 基础日志 */
	BS(LoggerFactory.getLogger("")),
	
	/** 发布filing日志 */
	CREATETABLE(LoggerFactory.getLogger("CREATETABLE"));
	
	private Logger logger;
	
	/**
	 * 私有化构造方法
	 ******************************************
	 * @author fxc [2016年6月14日 下午4:08:35]
	 * @version 1.0
	 ******************************************
	 * @param logger 日志对象
	 */
	private Log(Logger logger){
		this.logger = logger;
	}

	/**
	 * 获取日志对象
	 ******************************************
	 * @author fxc [2017年10月21日 上午9:33:54]
	 * @version 1.0
	 ******************************************
	 * @return 地址对象
	 */
	public Logger l() {
		return logger;
	}
	
	
}
