/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	MysqlTypeConstant.java
 * @package		com.model.util.mysql
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:34:08
 * @version		1.0
 * @description 
 *******************************************************************************
 */
package com.model.util.mysql;

import com.model.annotation.LengthCode;

/**
 * 用于配置Mysql数据库中类型，并且该类型需要设置几个长度
 * 这里配置多少个类型，创建表能使用多少类型
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午3:10:28]
 * @version 1.0
 ******************************************
 */
public class MysqlTypeConstant {


	@LengthCode
	public static final  String INT = "int";
	
	@LengthCode
	public static final  String VARCHAR = "varchar";
	
	@LengthCode(LengthCount=0)
	public static final  String TEXT = "text";
	
	@LengthCode(LengthCount=0)
	public static final  String DATETIME = "datetime";
	
	@LengthCode(LengthCount=0)
	public static final  String DATETYPE = "date";
	
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
