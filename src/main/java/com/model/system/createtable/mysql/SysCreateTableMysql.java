/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	SysCreateTableMysql.java
 * @package		com.model.system.createtable.mysql
 * @author		fuxianchao
 * @Date		2017年12月20日 下午1:23:47
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.createtable.mysql;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 创建mysql数据库
 ******************************************
 * @author fuxianchao  [2017年12月20日 下午1:23:47]
 * @version 1.0
 ******************************************
 */
@Component
public interface SysCreateTableMysql {
	
	public void createMysqlTable();
}
