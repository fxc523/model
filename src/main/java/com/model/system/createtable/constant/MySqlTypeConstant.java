/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	MySqlTypeConstant.java
 * @package		com.model.system.createtable.constant
 * @author		fuxianchao
 * @Date		2017年12月20日 下午1:40:31
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.createtable.constant;

import com.model.annotation.LengthCode;

/**
 ******************************************
 * @author fuxianchao  [2017年12月20日 下午1:40:31]
 * @version 1.0
 ******************************************
 */
public class MySqlTypeConstant {

	@LengthCode
	public static final  String INT = "int";
	
	@LengthCode
	public static final  String VARCHAR = "varchar";
	
	@LengthCode(LengthCount=0)
	public static final  String TEXT = "text";
	
	@LengthCode(LengthCount=0)
	public static final  String DATETIME = "datetime";
	
	@LengthCode(LengthCount=2)
	public static final  String DECIMAL = "decimal";
	
	@LengthCode(LengthCount=2)
	public static final  String DOUBLE = "double";
	
	@LengthCode
	public static final  String CHAR = "char";
	
	/**
	 * 等于java中的long
	 */
	@LengthCode
	public static final  String BIGINT = "bigint";
}
