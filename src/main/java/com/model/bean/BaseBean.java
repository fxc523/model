/*
 *******************************************************************************
 * @ProjectName 中国航信  DIT(国际运价前端管理系统)
 * @FileName	BaseBean.java
 * @package		com.model.bean
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:38:33
 * @version		1.0
 * @Company		中国民航信息网络股份有限公司
 * @Copyright	Copyright (c) 2017
 * @description 
 *******************************************************************************
 */
package com.model.bean;

import com.model.util.annotation.Column;

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
	@Column(name="id",type="VARCHAR")
	private String id;
	
	
}
