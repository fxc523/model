/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	BaseBean.java
 * @package		com.model.bean
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:34:08
 * @version		1.0
 * @description 
 *******************************************************************************
 */
package com.model.bean;

import com.model.annotation.Column;

/**
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午2:38:33]
 * @version 1.0
 ******************************************
 */
public class BaseBean {

	/**
	 * 主键
	 */
	@Column(type="VARCHAR",length=32,isKey=true)
	private String id;
	
	
}
