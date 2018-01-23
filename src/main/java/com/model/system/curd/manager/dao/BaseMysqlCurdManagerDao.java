/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	BaseMysqlCurdManagerDao.java
 * @package		com.model.system.curd.manager.dao
 * @author		fuxianchao
 * @Date		2018年1月11日 下午5:44:17
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.curd.manager.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 ******************************************
 * @author fuxianchao  [2018年1月11日 下午5:44:17]
 * @version 1.0
 ******************************************
 */
@Component
public interface BaseMysqlCurdManagerDao {
	
	/**
	 * 获得32位的主键作为id
	 ******************************************
	 * @author fuxianchao [2018年1月23日 上午11:07:07]
	 * @version 1.0
	 ******************************************
	 * @return
	 */
	public String queryKey();
	
	/**
	 * 通过id获取对象
	 ******************************************
	 * @author fuxianchao [2018年1月23日 下午2:34:11]
	 * @version 1.0
	 ******************************************
	 * @return
	 */
	public Object getById(@Param("id") String id);

	/**
	 * 新增
	 ******************************************
	 * @author fuxianchao [2018年1月23日 上午10:31:04]
	 * @version 1.0
	 ******************************************
	 * @param tableMap
	 */
	public void save(@Param("tableMap") Map<Object, Map<Object, Object>> tableMap);
	
	/**
	 * 修改
	 ******************************************
	 * @author fuxianchao [2018年1月23日 上午10:32:05]
	 * @version 1.0
	 ******************************************
	 * @param tableMap
	 */
	public void update(@Param("tableMap") Map<Object, Map<Object, Object>> tableMap);

}
