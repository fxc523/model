/*
 *******************************************************************************
 * @ProjectName 中国航信  DIT(国际运价前端管理系统)
 * @FileName	CreateMysqlTableMapper.java
 * @package		com.model.util.system.createtable
 * @author		fuxianchao
 * @Date		2017年11月27日 下午1:16:19
 * @version		1.0
 * @Company		中国民航信息网络股份有限公司
 * @Copyright	Copyright (c) 2017
 * @description 
 *******************************************************************************
 */
package com.model.util.system.createtable;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.model.util.mysql.SysMysqlColumns;


/**
 ******************************************
 * @author fuxianchao  [2017年11月27日 下午1:16:19]
 * @version 1.0
 ******************************************
 */
public interface CreateMysqlTableMapper {

	/**
	 * 根据结构注解解析出来的信息创建表
	 * @param tableMap 表结构的map
	 */
	public void createTable(@Param("tableMap") Map<String, List<Object>> tableMap);

	/**
	 * 根据表名查询表在库中是否存在，存在返回1，不存在返回0
	 * @param tableName 表结构的map
	 * @return 存在返回1，不存在返回0
	 */
	public int findTableCountByTableName(@Param("tableName") String tableName);
	
	/**
	 * 根据表名查询库中该表的字段结构等信息
	 * @param tableName 表结构的map
	 * @return 表的字段结构等信息
	 */
	public List<SysMysqlColumns> findTableEnsembleByTableName(@Param("tableName") String tableName);
	
	/**
	 * 增加字段
	 * @param tableMap 表结构的map
	 */
	public void addTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 删除字段
	 * @param tableMap 表结构的map
	 */
	public void removeTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 修改字段
	 * @param tableMap 表结构的map
	 */
	public void modifyTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 删除主键约束，附带修改其他字段属性功能
	 * @param tableMap 表结构的map
	 */
	public void dropKeyTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 删除唯一约束字段，不带修改其他字段属性的功能
	 * @param tableMap 表结构的map
	 */
	public void dropUniqueTableField(@Param("tableMap") Map<String, Object> tableMap);
	
	/**
	 * 根据表名删除表
	 * @param tableName 表结构的map
	 */
	public void dorpTableByName(@Param("tableName") String tableName);
}
