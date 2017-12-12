/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	ClassUtilTest.java
 * @package		com.model.util.mysql
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:34:08
 * @version		1.0
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
