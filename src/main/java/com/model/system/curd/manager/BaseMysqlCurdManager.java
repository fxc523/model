/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	MysqlCurdManager.java
 * @package		com.model.system.curd.manager
 * @author		fuxianchao
 * @Date		2018年1月11日 下午4:46:38
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.curd.manager;

import java.util.List;

/**
 ******************************************
 * @author fuxianchao  [2018年1月11日 下午4:46:38]
 * @version 1.0
 ******************************************
 */
public interface BaseMysqlCurdManager<T> {

	/**
	 * 保存，如果主键有值则进行更新操作
	 ******************************************
	 * @author fuxianchao [2018年1月11日 下午4:50:37]
	 * @version 1.0
	 ******************************************
	 * @param t
	 */
	void save(T t);
	
	/**
	 * 根据主键条件删除
	 ******************************************
	 * @author fuxianchao [2018年1月11日 下午4:51:48]
	 * @version 1.0
	 ******************************************
	 * @param t
	 */
	void delete(String id);
	
	/**
	 * 查找所有数据
	 ******************************************
	 * @author fuxianchao [2018年1月11日 下午4:54:51]
	 * @version 1.0
	 ******************************************
	 * @return
	 */
	 List<T> findAll();
	
	/**
	 * 根据主键查找唯一数据
	 ******************************************
	 * @author fuxianchao [2018年1月11日 下午4:55:45]
	 * @version 1.0
	 ******************************************
	 * @param id 唯一主键
	 * @return
	 */
	T findOne(String id);
}
