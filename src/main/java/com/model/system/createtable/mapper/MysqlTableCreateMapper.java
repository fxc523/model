/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	MysqlTableCreateMapper.java
 * @package		com.model.system.createtable.mapper
 * @author		fuxianchao
 * @Date		2017年12月21日 下午1:44:24
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.createtable.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.model.system.createtable.constant.SysMysqlColumns;

/**
 ******************************************
 * @author fuxianchao  [2017年12月21日 下午1:44:24]
 * @version 1.0
 ******************************************
 */
@Repository
public interface MysqlTableCreateMapper {

	/**
	 * 根据表名删除表
	 * @param tableName 表结构的map
	 */
	public void dorpTableByName(@Param("tableName") String tableName);

	/**
	 * 检查表是否存在
	 ******************************************
	 * @author fuxianchao [2017年12月22日 上午9:22:33]
	 * @version 1.0
	 ******************************************
	 * @param name name
	 * @return 0不存在 1 存在
	 */
	public int findTableCountByTableName(@Param("tableName") String name);

	/**
	 * 查询表中字段的信息
	 ******************************************
	 * @author fuxianchao [2017年12月22日 上午9:31:31]
	 * @version 1.0
	 ******************************************
	 * @param name 表名
	 * @return 表字段结果
	 */
	public List<SysMysqlColumns> findTableEnsembleByTableName(@Param("tableName") String name);

	/**
	 * 根据结构注解解析出来的信息创建表
	 ******************************************
	 * @author fuxianchao [2017年12月22日 上午10:11:13]
	 * @version 1.0
	 ******************************************
	 * @param tableMap 表结构的map
	 */
	public void createTable(@Param("tableMap") Map<String, List<Object>> tableMap);

	/**
	 * 删除主键约束，附带修改其他字段属性功能
	 ******************************************
	 * @author fuxianchao [2017年12月22日 上午10:15:10]
	 * @version 1.0
	 ******************************************
	 * @param map 表结构的map
	 */
	public void dropKeyTableField(@Param("tableMap") Map<String, Object> tableMap);

	/**
	 * 删除唯一约束字段，不带修改其他字段属性的功能
	 ******************************************
	 * @author fuxianchao [2017年12月22日 上午10:58:34]
	 * @version 1.0
	 ******************************************
	 * @param map
	 */
	public void dropUniqueTableField(@Param("tableMap") Map<String, Object> tableMap);

	/**
	 * 修改字段
	 ******************************************
	 * @author fuxianchao [2017年12月22日 上午11:04:50]
	 * @version 1.0
	 ******************************************
	 * @param map
	 */
	public void modifyTableField(@Param("tableMap") Map<String, Object> map);

	/**
	 * 添加的字段
	 ******************************************
	 * @author fuxianchao [2017年12月22日 下午1:06:19]
	 * @version 1.0
	 ******************************************
	 * @param map
	 */
	public void addTableField(@Param("tableMap") Map<String, Object> map);

	/**
	 * 删除table字段
	 ******************************************
	 * @author fuxianchao [2017年12月22日 下午1:08:50]
	 * @version 1.0
	 ******************************************
	 * @param map
	 */
	public void removeTableField(@Param("tableMap") Map<String, Object> map);
}
