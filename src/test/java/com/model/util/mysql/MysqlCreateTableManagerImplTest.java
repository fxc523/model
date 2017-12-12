/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	MysqlCreateTableManagerImplTest.java
 * @package		com.model.util.mysql
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:34:08
 * @version		1.0
 * @description 
 *******************************************************************************
 */
package com.model.util.mysql;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 ******************************************
 * @author fuxianchao  [2017年11月27日 上午9:53:54]
 * @version 1.0
 ******************************************
 */
public class MysqlCreateTableManagerImplTest {

	@Autowired
	private MysqlCreateTableManagerImpl mctmi;
	
	@Test
	public void test1(){
		mctmi.createMysqlTable();
	}
}
