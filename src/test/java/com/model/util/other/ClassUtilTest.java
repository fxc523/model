/*
 *******************************************************************************
 * @ProjectName 中国航信  DIT(国际运价前端管理系统)
 * @FileName	ClassUtilTest.java
 * @package		com.model.util.other
 * @author		fuxianchao
 * @Date		2017年11月24日 上午10:01:54
 * @version		1.0
 * @Company		中国民航信息网络股份有限公司
 * @Copyright	Copyright (c) 2017
 * @description 
 *******************************************************************************
 */
package com.model.util.other;

import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 ******************************************
 * @author fuxianchao  [2017年11月24日 上午10:01:54]
 * @version 1.0
 ******************************************
 */
public class ClassUtilTest {

	@Autowired
	private ClassUtil cu;
	
	@Test
	public void testUc1(){
		Set<Class<?>> ss = cu.getAllClass("com.model.bean.po");
		
	}
}
