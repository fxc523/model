/*
 *******************************************************************************
 * @ProjectName 中国航信  DIT(国际运价前端管理系统)
 * @FileName	MysqlCreateTableManagerImplTest.java
 * @package		com.model.util.mysql
 * @author		fuxianchao
 * @Date		2017年11月27日 上午9:53:54
 * @version		1.0
 * @Company		中国民航信息网络股份有限公司
 * @Copyright	Copyright (c) 2017
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
